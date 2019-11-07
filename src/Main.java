import Compra.Orden;
import Libro.Autor;
import Libro.LibroDigital;
import Personas.Categoria;
import Personas.UsuarioCliente;

public class Main {
	
	public static void main(String[] args){
		Autor miAutor = new Autor("1", "Jose Perez");
		Categoria miCategoria = new Categoria("C1", "VIP", 10.0);
		LibroDigital miLibro = new LibroDigital("L1", "Diseño de Software", "educacion", 10000.50, miAutor, 10, 10.00);
		UsuarioCliente miUsuario = new UsuarioCliente("U1", "Juan Carlos Cliente", "Password", true, "juan@carlos.com", 1000.00, "11111111", miCategoria);
		System.out.println("Mi libro se llama " + miLibro.getTitulo());
		System.out.println("Mi cliente se llama " + miUsuario.getNombre());

		Orden miOrden = new Orden("O1", 1, miLibro, miUsuario);
		System.out.println("Se genero orden " + miOrden.getId());
	}
	
}
