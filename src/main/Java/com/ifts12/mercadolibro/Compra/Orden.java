package com.ifts12.mercadolibro.Compra;

import com.ifts12.mercadolibro.Libro.Libro;
import com.ifts12.mercadolibro.Libro.LibroDigital;
import com.ifts12.mercadolibro.Libro.LibroImpreso;
import com.ifts12.mercadolibro.Personas.UsuarioCliente;
import java.util.concurrent.ThreadLocalRandom;


public class Orden {

	private String id;
	private Integer cantidad;
	private Double descuento;
	private Double total;
	private String estado;
	private Libro libro;
	private UsuarioCliente usuario;
	private Factura factura;
	
	public Orden(Integer cantidad, LibroDigital libro, UsuarioCliente usuario) {
		Integer randomId = ThreadLocalRandom.current().nextInt(0, 1000);
		this.id = randomId.toString();
		this.cantidad = cantidad;
		this.libro = libro;
		this.usuario = usuario;
		this.total = libro.getPrecio();
		this.estado = "NUEVA";

		calcularDescuentos();

		if(!this.verificarStock(libro)) {
			System.out.println("El libro " + this.libro.getTitulo() + " no tiene stock suficiente.");
			this.estado = "CANCELADA";
		} else if(!this.verificarCredito()) {
			System.out.println("El usuario " + this.usuario.getNombre() + " no tiene saldo suficiente.");
			this.estado = "RECHAZADA";
		} else {
			this.estado = "EN PROCESO";
			String fecha = String.valueOf(System.currentTimeMillis());
			this.factura = this.generarFactura(fecha);
			System.out.println("Se generó correctamente la factura " + this.factura.getId());
			this.estado = "APROBADA";
		}
		
	}

	public String getId() {
		return id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public UsuarioCliente getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioCliente usuario) {
		this.usuario = usuario;
	}
	
	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	private boolean verificarStock(LibroDigital libro) {
		return libro.getStockLicencias() >= this.cantidad;
	}
	
	private boolean verificarStock(LibroImpreso libro) {
		return libro.getStockCopias() >= this.cantidad;
	}

	private void calcularDescuentos() {
		if (this.libro instanceof LibroDigital) {
			this.total = this.total - (libro.getPrecio()*((LibroDigital) this.libro).getDescuento());
		}
		this.total = this.total-(libro.getPrecio()*this.usuario.getCategoria().getDescuento());
	}
	
	private boolean verificarCredito() {
		return this.usuario.getSaldo() >= this.total;
	}

	private Factura generarFactura(String fecha) {
		return new Factura(fecha, this);
	}
	
	
}
