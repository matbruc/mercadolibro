package Libro;

public class LibroImpreso extends Libro {

	private Integer stockCopias;
	
	public LibroImpreso(String id, String titulo, String genero, Double precio, Autor autor, Integer stockCopias) {
		super(id, titulo, genero, precio, autor);
		
		this.stockCopias = stockCopias;
		// TODO Auto-generated constructor stub
	}

	public Integer getStockCopias() {
		return stockCopias;
	}

	public void setStockCopias(Integer stockCopias) {
		this.stockCopias = stockCopias;
	}
	
	
	
	

	
}
