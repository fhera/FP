package fp.libro;

import java.util.Comparator;

public class ComparaLibroNumPaginas implements Comparator<Libro> {

	public int compare(Libro l1, Libro l2) {
		int result;
		result = l1.getNumPaginas().compareTo(l2.getNumPaginas());
		if (result == 0 && !l1.equals(l2))
			result = 1;
		return result;
	}

}
