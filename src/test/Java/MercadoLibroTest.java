import com.ifts12.mercadolibro.Libro.Autor;
import com.ifts12.mercadolibro.Libro.Libro;
import com.ifts12.mercadolibro.Libro.LibroDigital;

public class MercadoLibroTest {

	public void test() {
		Autor miAutor = new Autor("Jose Perez");
		Libro miLibro = new LibroDigital("Diseño de Software", "educacion", 100.50, miAutor, 10, 10.00);
		
		System.out.println(miLibro.getTitulo());
	}
	
	
}