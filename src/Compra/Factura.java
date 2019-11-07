package Compra;

public class Factura {
	private String id;
	private String fecha;
	
	public Factura(String id, String fecha) {
		this.id = id;
		this.fecha = fecha;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
