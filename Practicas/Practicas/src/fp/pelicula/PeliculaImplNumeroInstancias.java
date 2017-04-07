package fp.pelicula;

public class PeliculaImplNumeroInstancias extends PeliculaImpl implements
		Pelicula {

	private static Integer numInstancias = 0;

	public PeliculaImplNumeroInstancias() {
		super();
		numInstancias++;
	}

	public PeliculaImplNumeroInstancias(String nombre, String nacionalidad,
			Genero genero, Double presupuesto, Integer año) {
		super(nombre, nacionalidad, genero, presupuesto, año);
		numInstancias++;
	}

	public PeliculaImplNumeroInstancias(String cad) {
		super(cad);
		numInstancias++;
	}

	public static Integer PeliculaImplNumInstancias() {
		return numInstancias;
	}
}