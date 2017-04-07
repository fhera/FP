package fp.libro;

import fp.fecha.Fecha;
import fp.persona.Persona;

public class LibroImplNumeroInstancias extends LibroImpl implements Libro {

	private static Integer numinstancias = 0;

	public LibroImplNumeroInstancias() {
		super();
		numinstancias++;
	}

	public LibroImplNumeroInstancias(String isbn, String titulo, Persona autor,
			Fecha fedicion, Integer numpaginas) {
		super(isbn, titulo, autor, fedicion, numpaginas);
		numinstancias++;
	}
	
	public LibroImplNumeroInstancias(String cad){
		super(cad);
		numinstancias++;
	}
	
	public static Integer LibroNumInstancias(){
		return numinstancias;
	}

}
