package fp.vuelo;

import java.util.Comparator;

public class ComparaVueloPorPrecio implements Comparator<Vuelo> {

	public int compare(Vuelo v1, Vuelo v2) {
		int result = v1.getPrecio().compareTo(v2.getPrecio());
		if (result == 0 && !v1.equals(v2)) {
			result = 1;
		}
		return result;
	}
}
