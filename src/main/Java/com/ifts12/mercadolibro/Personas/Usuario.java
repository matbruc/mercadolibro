package com.ifts12.mercadolibro.Personas;

import java.util.concurrent.ThreadLocalRandom;

public class Usuario {

	private String id;
	private String nombre;
	private String password;
	private Boolean loginStatus;
	private String email;
	
	public Usuario(String nombre, String password, Boolean loginStatus, String email) {

		Integer randomId = ThreadLocalRandom.current().nextInt(0, 1000);
		this.id = randomId.toString();
		this.nombre = nombre;
		this.password = password;
		this.loginStatus = loginStatus;
		this.email = email;
		
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(Boolean loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

		
	
}


