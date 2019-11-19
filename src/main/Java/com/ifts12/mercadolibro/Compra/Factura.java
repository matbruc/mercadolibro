package com.ifts12.mercadolibro.Compra;

import java.util.concurrent.ThreadLocalRandom;

public class Factura {
	private String id;
	private String fecha;
	private Orden orden;
	private Double total;
	
	public Factura(String fecha, Orden orden) {
		Integer randomId = ThreadLocalRandom.current().nextInt(0, 1000);
		this.id = randomId.toString();
		this.fecha = fecha;
		this.orden = orden;
	}

	public String getId() {
		return id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
