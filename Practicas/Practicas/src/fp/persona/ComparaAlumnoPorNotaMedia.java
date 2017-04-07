package fp.persona;

import java.util.Comparator;

public class ComparaAlumnoPorNotaMedia implements Comparator<Alumno> {

	public int compare(Alumno a1, Alumno a2) {
		int result = a1.getNotaMedia().compareTo(a2.getNotaMedia());
		if (result == 0 && !a1.equals(a2)) {
			result = 1;
		}
		return result;
	}
}
