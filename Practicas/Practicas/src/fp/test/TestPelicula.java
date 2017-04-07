package fp.test;

import fp.pelicula.*;

public class TestPelicula extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula p1 = new PeliculaImpl("El discurso del Rey (2010)");
		mostrar(p1);

		Pelicula p2 = new PeliculaImplTerror("Numero 23", "Americana", Genero.TERROR,
				2862.10, 1986);
		mostrar (p2);
		mostrar("Es una peli de terror: ",PeliculaImplTerror.existeAlMenosUno());
	}

}
