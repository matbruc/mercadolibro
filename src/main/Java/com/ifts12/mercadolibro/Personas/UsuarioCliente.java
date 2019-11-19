package com.ifts12.mercadolibro.Personas;


public class UsuarioCliente extends Usuario {

	private String dni;
	private Double saldo;
	private Categoria categoria;
	
	public UsuarioCliente(String nombre, String password, Boolean loginStatus, String email,
			Double saldo, String dni, Categoria categoria) {
		super(nombre, password, loginStatus, email);
		this.saldo = saldo;
		this.dni = dni;
		this.categoria = categoria;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	

	
		
	

}
