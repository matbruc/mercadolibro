package Personas;

public class Categoria  {
	
	private String id;
	private String descripcion;
	private Double descuento;
	
	/**
	 * @param id
	 * @param descripcion
	 * @param descuento
	 */
	public Categoria(String id, String descripcion, Double descuento) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.descuento = descuento;
	}
	protected String getId() {
		return id;
	}
	protected void setId(String id) {
		this.id = id;
	}
	protected Double getDescuento() {
		return descuento;
	}
	protected void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
