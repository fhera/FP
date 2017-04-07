package fp.utiles;

import java.util.ArrayList;
import java.util.List;
import fp.encuesta.*;

public class Encuestas {

	public static List<Encuesta> encuestaDistrito(List<Encuesta> le,
			Integer Distrito) {

		List<Encuesta> listaMismoDistrito = new ArrayList<Encuesta>();

		for (Encuesta elemento : le) {
			if (elemento.getDistrito().equals(Distrito)) {
				listaMismoDistrito.add(elemento);
			}
		}
		return listaMismoDistrito;
	}

	public static List<Encuesta> encuestasEdadMayor(List<Encuesta> le,
			Integer edad) {

		List<Encuesta> listaEdadMayor = new ArrayList<Encuesta>();

		for (Encuesta elemento : le) {
			if (elemento.getEdad() > edad) {
				listaEdadMayor.add(elemento);
			}
		}
		return listaEdadMayor;
	}

	public static Encuesta[] añadeCodigo(Encuesta[] encuesta, String codigo) {
		//TODO: revisar  el código, porque da fallo.
		Encuesta[] result = new Encuesta[encuesta.length];

		for (int i = 0; i < encuesta.length; i++) {
			result[i].getIdentificador().concat(codigo);
		}
		return result;
	}
}
