package fp.libro;

import java.util.Comparator;

public class ComparaLibroFechaEdicion implements Comparator<Libro> {

	public int compare(Libro l1, Libro l2) {
		int result;
		result = l1.getFechaEdicion().compareTo(l2.getFechaEdicion());
		if (result == 0 && !l1.equals(l2))
			result = 1;
		return result;
	}

}
