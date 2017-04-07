package fp.utiles;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import fp.pelicula.*;

public class Peliculas {

	public static Pelicula masPresupuesto(Set<Pelicula> s) {
		Pelicula result = null;
		Comparator<Pelicula> cmp = new ComparaPeliculaPorPresupuesto();

		for (Pelicula p : s) {
			result = Ordenes.max(p, result, cmp);
		}

		if (result == null) {
			throw new NoSuchElementException();
		}
		return result;
	}

	public static Pelicula masPresupuesto1(Set<Pelicula> s) {
		Pelicula result = null;
		@SuppressWarnings("unused")
		boolean esPrimero = true;

		for (Pelicula p : s) {
			if (result == null) {
				result = p;
				esPrimero = false;
			}

			if (p.getPresupuesto().compareTo(result.getPresupuesto()) > 0) {

			}

		}
		return result;
	}

	public static Boolean hayNacionalidad(Set<Pelicula> s, String nac) {
		Boolean result = false;
		String nacionalidad = nac.toLowerCase();
		for (Pelicula p : s) {
			if (p.getNacionalidad().equals(nacionalidad)) {
				result = true;
				break;
			}
		}
		return result;
	}

	public static SortedSet<Pelicula> grandesProducciones(List<Pelicula> lista,
			Double dinero) {
		Comparator<Pelicula> cmp = new ComparaPeliculaPorNombre();
		SortedSet<Pelicula> result = new TreeSet<Pelicula>(cmp);

		for (Pelicula p : lista) {
			if (p.getPresupuesto().compareTo(dinero) > 0) {
				result.add(p);
			}
		}
		return result;
	}

	public static String[] arrayTitulosOrdenados(List<Pelicula> s) {

		String[] res = new String[s.size()];

		for (int i = 0; i < s.size(); i++) {
			res[i] = s.get(i).getNombre() + "-" + s.get(i).getNacionalidad();
		}
		return res;
	}

	public static Set<Pelicula> candidatas3(Set<Pelicula> s1, Set<Pelicula> s2,
			Set<Pelicula> s3) {

		Set<Pelicula> result = new HashSet<Pelicula>(s1);

		result.retainAll(s2);
		result.retainAll(s3);

		return result;
	}

	public static Integer cuentaCalificacion10(PeliculaOnline p) {
		Integer result = 0;
		for (Integer e : p.getPuntuaciones()) {
			if (e == 10) {
				result++;
			}
		}
		return result;
	}

	public static String peliculaConMas10(List<PeliculaOnline> peliculas) {
		PeliculaOnline pelicula = peliculas.get(0);

		for (PeliculaOnline p : peliculas) {
			if (cuentaCalificacion10(p) > cuentaCalificacion10(pelicula)) {
				pelicula = p;
			}
		}
		String result = pelicula.getNombre();
		return result;
	}

}
