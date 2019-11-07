package Libro;

public class LibroDigital extends Libro {

	private Integer stockLicencias;
	private Double descuento;
	
	public LibroDigital(String id, String titulo, String genero, Double precio, Autor autor, Integer stockLicencias,
			Double descuento) {
	super(id, titulo, genero, precio, autor);
		
	this.stockLicencias = stockLicencias;
	this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}

	public Integer getStockLicencias() {
		return stockLicencias;
	}

	public void setStockLicencias(Integer stockLicencias) {
		this.stockLicencias = stockLicencias;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	
	
	public Integer modificarStock(Integer nuevoStock) {
		
		this.stockLicencias = nuevoStock;
		return this.stockLicencias;
	}
	
	

}
