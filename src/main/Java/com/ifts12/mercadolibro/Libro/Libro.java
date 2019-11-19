package com.ifts12.mercadolibro.Libro;

import java.util.concurrent.ThreadLocalRandom;

public class Libro {

	private String id;
	private String titulo;
	private String genero;
	private Double precio;
	private Autor autor;

	public Libro(String titulo, String genero, Double precio, Autor autor) {

		Integer randomId = ThreadLocalRandom.current().nextInt(0, 1000);
		this.id = randomId.toString();		this.titulo = titulo;
		this.genero = genero;
		this.precio = precio;
		this.autor = autor;
	}

	public String getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	public void Comprar(Integer cantidad) {
		
		
	}
	
	
	
	
	
}
