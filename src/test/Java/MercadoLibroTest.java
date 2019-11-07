import Libro.Autor;
import Libro.Libro;
import Libro.LibroDigital;

public class MercadoLibroTest {

	public void test() {
		Autor miAutor = new Autor("1", "Jose Perez");
		Libro miLibro = new LibroDigital("L1", "Diseño de Software", "educacion", 100.50, miAutor, 10, 10.00);
		
		System.out.println(miLibro.getTitulo());
	}
	
	
}