package fp.utiles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fp.persona.Persona;

public class Personas {

	public static Double alturaMaxima(List<Persona> lista) {
		List<Double> altura = new ArrayList<Double>();

		for (Persona p : lista) {
			altura.add(p.getEstatura());
		}
		Double result = Reales.maximo(altura);
		return result;
	}

	public static Boolean personasMayor(Set<Persona> l, Integer e) {
		Boolean result = true;

		for (Persona p : l) {
			if (p.getEdad().compareTo(e) < 0) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static Double mediaEdad(Set<Persona> grupo) {
		List<Double> media = new ArrayList<Double>();
		for (Persona p : grupo) {
			media.add(p.getEstatura());
		}
		Double result = Reales.mediaAritmetica(media);
		return result;
	}

	public static List<String> listaDNI(Set<Persona> grupo) {
		List<String> result = new ArrayList<String>();
		for (Persona p : grupo) {
			result.add(p.getDNI());
		}
		return result;
	}

	public static Set<Persona> agrupaATodos(Set<List<Persona>> red) {
		Set<Persona> result = new HashSet<Persona>();
		for (List<Persona> e : red) {
			result.addAll(e);
		}
		return result;
	}
}
