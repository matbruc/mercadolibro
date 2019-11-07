package Libro;

public class Autor {

	// Attributes
	
	private String id;
	private String nombre;
	
	//Method Constructor
	
	public Autor(String id, String nombre){
		
		this.id = id;
		this.nombre = nombre;
		
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	
}
