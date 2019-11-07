package Personas;


public class UsuarioCliente extends Usuario {

	private String dni;
	private Double saldo;
	private Categoria categoria;
	
	public UsuarioCliente(String id, String nombre, String password, Boolean loginStatus, String email,
			Double saldo, String dni, Categoria categoria) {
		super(id, nombre, password, loginStatus, email);
		// TODO Auto-generated constructor stub
		
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

// agregar cardinalidad private List<direccion> direcciones = new ArrayList<Direccion>();

