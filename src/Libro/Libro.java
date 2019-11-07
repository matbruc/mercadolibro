package Libro;

public class Libro {

	//Attributes
	
	private String id;
	private String titulo;
	private String genero;
	private Double precio;
	private Autor autor;
	
	//Method Constructor
	


	public Libro(String id, String titulo, String genero, Double precio, Autor autor) {
		
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.precio = precio;
		this.autor = autor;
	}

	//Getters & Setters
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
