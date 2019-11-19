package com.ifts12.mercadolibro;

import com.ifts12.mercadolibro.Compra.Orden;
import com.ifts12.mercadolibro.Libro.Autor;
import com.ifts12.mercadolibro.Libro.LibroDigital;
import com.ifts12.mercadolibro.Personas.Categoria;
import com.ifts12.mercadolibro.Personas.UsuarioCliente;

public class MercadoLibro {
	
	public static void main(String[] args) {
		Autor miAutor = new Autor("Jose Perez");
		Categoria miCategoria = new Categoria("VIP", 0.10);
		LibroDigital miLibro = new LibroDigital("Diseño de Software", "educacion", 100.0, miAutor, 10, 0.15);
		UsuarioCliente miUsuario = new UsuarioCliente("Juan Carlos Cliente", "Password", true, "juan@carlos.com", 1000.00, "11111111", miCategoria);
		System.out.println("Mi libro se llama " + miLibro.getTitulo());
		System.out.println("Mi cliente se llama " + miUsuario.getNombre());

		Orden miOrden = new Orden(1, miLibro, miUsuario);

		switch (miOrden.getEstado()) {
			case "CANCELADA":
				System.out.println("[ERROR] El libro no cuenta con stock suficiente");
				break;
			case "RECHAZADA":
				System.out.println("[ERROR] El usuario no cuenta con saldo suficiente");
				break;
			case "APROBADA":
				miLibro.modificarStock(miLibro.getStockLicencias() - 1);
				miUsuario.setSaldo(miUsuario.getSaldo() - miLibro.getPrecio());
				System.out.println("Se genero orden " + miOrden.getId());
				System.out.println("Nuevo saldo del usuario " + miUsuario.getNombre() + " : " + miUsuario.getSaldo());
				System.out.println("Nuevo stock del libro " + miLibro.getTitulo() + " : " + miLibro.getStockLicencias());
				break;
			default:
				System.out.println("[ERROR] Hubo un problema al crear la orden");
		}
	}

	
}
