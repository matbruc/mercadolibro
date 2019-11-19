package com.ifts12.mercadolibro.Libro;

public class LibroImpreso extends Libro {

	private Integer stockCopias;
	
	public LibroImpreso(String titulo, String genero, Double precio, Autor autor, Integer stockCopias) {
		super(titulo, genero, precio, autor);
		
		this.stockCopias = stockCopias;
		// TODO Auto-generated constructor stub
	}

	public Integer getStockCopias() {
		return stockCopias;
	}

	public void setStockCopias(Integer stockCopias) {
		this.stockCopias = stockCopias;
	}
	
	
	
	

	
}
