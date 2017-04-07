package fp.pelicula;

import java.util.LinkedList;
import java.util.List;

public class PeliculaImplIterableInstaciasCreadas extends PeliculaImpl
		implements Pelicula {

	private static List<Pelicula> instancias = new LinkedList<Pelicula>();

	public PeliculaImplIterableInstaciasCreadas() {
		super();
		instancias.add(this);
	}

	public PeliculaImplIterableInstaciasCreadas(String nombre,
			String nacionalidad, Genero genero, Double presupuesto, Integer año) {

		super(nombre, nacionalidad, genero, presupuesto, año);
		instancias.add(this);
	}

	public PeliculaImplIterableInstaciasCreadas(String s) {
		super(s);
		instancias.add(this);
	}

	public List<Pelicula> getInstancias() {
		return instancias;
	}

}
