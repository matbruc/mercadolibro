package com.ifts12.mercadolibro.Libro;

import java.util.concurrent.ThreadLocalRandom;

public class Autor {

	// Attributes
	
	private String id;
	private String nombre;
	
	//Method Constructor
	
	public Autor(String nombre){

		Integer randomId = ThreadLocalRandom.current().nextInt(0, 1000);
		this.id = randomId.toString();
		this.nombre = nombre;

		
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
