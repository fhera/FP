package fp.libro;

import java.util.LinkedList;
import java.util.List;

import fp.fecha.Fecha;
import fp.persona.Persona;

public class LibroImplInstanciasCreadas extends LibroImpl implements Libro {

	private static List<Libro> instancias = new LinkedList<Libro>();

	public LibroImplInstanciasCreadas() {
		super();
		instancias.add(this);
	}

	public LibroImplInstanciasCreadas(String isbn, String titulo,
			Persona autor, Fecha fedicion, Integer numpaginas) {
		
		super(isbn, titulo, autor, fedicion, numpaginas);
		instancias.add(this);
	}
	
	public LibroImplInstanciasCreadas(String cad){
		super(cad);
		instancias.add(this);
	}
	
	public static List<Libro> getInstancias(){
		return instancias;
	}

}
