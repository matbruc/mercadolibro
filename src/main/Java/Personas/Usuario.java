package Personas;

public class Usuario {

	//Attributes
	
	private String id;
	private String nombre;
	private String password;
	private Boolean loginStatus;
	private String email;
	
	//Method Constructor
	
	public Usuario(String id, String nombre, String password, Boolean loginStatus, String email) {
		
		this.id =id;
		this.nombre = nombre;
		this.password = password;
		this.loginStatus = loginStatus;
		this.email = email;
		
	}
	
	
	//Getters & Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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


