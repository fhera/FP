package fp.pelicula;

import java.util.LinkedList;
import java.util.List;

public class PeliculaImplInstanciasCriterioCreadas extends PeliculaImpl
		implements Pelicula {

	private List<Pelicula> instancias = new LinkedList<Pelicula>();

	public PeliculaImplInstanciasCriterioCreadas() {
		super();
	}

	public PeliculaImplInstanciasCriterioCreadas(String nombre,
			String nacionalidad, Genero genero, Double presupuesto, Integer año) {

		super(nombre, nacionalidad, genero, presupuesto, año);
	}
	public PeliculaImplInstanciasCriterioCreadas(String s) {
		super(s);
	}

	public List<Pelicula> getInstancias() {
		return instancias;
	}

}
