package com.ifts12.mercadolibro.Personas;

import java.util.concurrent.ThreadLocalRandom;

public class Categoria  {
	
	private String id;
	private String descripcion;
	private Double descuento;

	public Categoria(String descripcion, Double descuento) {
		Integer randomId = ThreadLocalRandom.current().nextInt(0, 1000);
		this.id = randomId.toString();
		this.descripcion = descripcion;
		this.descuento = descuento;
	}
	public String getId() {
		return id;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
