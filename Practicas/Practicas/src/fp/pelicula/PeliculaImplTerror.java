package fp.pelicula;

public class PeliculaImplTerror extends PeliculaImpl implements Pelicula {

	private static Boolean existe = false;

	public PeliculaImplTerror() {
		super();
		existe = existe || this.getGenero().equals(Genero.TERROR);

	}

	public PeliculaImplTerror(String nombre, String nacionalidad,
			Genero genero, Double presupuesto, Integer año) {

		super(nombre, nacionalidad, genero, presupuesto, año);
		existe = existe || this.getGenero().equals(Genero.TERROR);
	}

	public PeliculaImplTerror(String s) {
		super(s);
		existe = existe || this.getGenero().equals(Genero.TERROR);
	}

	public static Boolean existeAlMenosUno() {
		return existe;
	}
}
