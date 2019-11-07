package Compra;

import Libro.Libro;
import Libro.LibroDigital;
import Libro.LibroImpreso;
import Personas.UsuarioCliente;
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
	
	public Orden(String id, Integer cantidad, LibroDigital libro, UsuarioCliente usuario) {
		
		this.id = id;
		this.cantidad = cantidad;
		this.libro = libro;
		this.usuario = usuario;
		
		if(!this.verificarStock(libro)) {
			System.out.println("El libro " + this.libro.getTitulo() + " no tiene stock suficiente.");
		} else if(!this.verificarCredito()) {
			System.out.println("El usuario " + this.usuario.getNombre() + " no tiene saldo suficiente.");
		} else {
			Integer randomId = ThreadLocalRandom.current().nextInt(0, 1000); 
			String fecha = String.valueOf(System.currentTimeMillis());
			this.factura = this.generarFactura(randomId.toString(), fecha);
			System.out.println("Se generó correctamente la factura " + this.factura.getId());
		}
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public boolean verificarStock(LibroDigital libro) {
		if(libro.getStockLicencias() >= this.cantidad) {
			return true;
		}
		return false;
	}
	
	public boolean verificarStock(LibroImpreso libro) {
		if(libro.getStockCopias() >= this.cantidad) {
			return true;
		}
		return false;
	}
	
	public boolean verificarCredito() {
		if(this.usuario.getSaldo() >= this.libro.getPrecio()) {
			return true;
		}
		return false;
	}
	
	
	public Factura generarFactura(String id, String fecha) {
		return new Factura(id, fecha);
	}
	
	
}
