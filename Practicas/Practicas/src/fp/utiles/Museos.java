package fp.utiles;

import java.util.HashSet;
import java.util.Set;

import fp.persona.*;

public class Museos {

	public static Set<Persona> repiten(Set<Persona> anterior,
			Set<Persona> actual) {
		Set<Persona> result = new HashSet<Persona>(actual);
		result.retainAll(anterior);
		return result;
	}

	public static Set<Persona> todo(Set<Persona> anterior, Set<Persona> actual) {
		Set<Persona> result = new HashSet<Persona>(actual);
		result.addAll(anterior);
		return result;
	}

	public static Set<Persona> nuevos(Set<Persona> anterior, Set<Persona> actual) {
		Set<Persona> result = new HashSet<Persona>(anterior);
		result.removeAll(anterior);
		return result;
	}

	public static Set<Persona> españolYOtro(Set<Persona> español,
			Set<Persona> frances, Set<Persona> ingles) {

		Set<Persona> españolFrances = new HashSet<Persona>(español);
		españolFrances.retainAll(frances);

		Set<Persona> españolIngles = new HashSet<Persona>(español);
		españolIngles.retainAll(ingles);

		Set<Persona> españolYOtro = new HashSet<Persona>();
		españolYOtro.addAll(españolFrances);
		españolYOtro.addAll(españolIngles);

		return españolYOtro;
	}

	public static Set<Persona> alMenosDos(Set<Persona> español,
			Set<Persona> frances, Set<Persona> ingles) {
		Set<Persona> alMenosDos = new HashSet<Persona>();
		Set<Persona> españolFrances = new HashSet<Persona>(español);
		españolFrances.retainAll(frances);
		Set<Persona> españolIngles = new HashSet<Persona>(español);
		españolIngles.retainAll(ingles);
		Set<Persona> francesIngles = new HashSet<Persona>(frances);
		francesIngles.retainAll(ingles);
		alMenosDos.addAll(francesIngles);
		alMenosDos.addAll(españolFrances);
		alMenosDos.addAll(españolIngles);
		return alMenosDos;
	}

	public static Set<Persona> todosIdiomas(Set<Persona> español,
			Set<Persona> ingles, Set<Persona> frances) {
		Set<Persona> todosIdiomas = new HashSet<Persona>(español);
		todosIdiomas.retainAll(ingles);
		todosIdiomas.retainAll(frances);
		return todosIdiomas;
	}

	public static Set<Persona> soloUno(Set<Persona> español,
			Set<Persona> ingles, Set<Persona> frances) {
		Set<Persona> soloUno = new HashSet<Persona>();
		soloUno.addAll(ingles);
		soloUno.addAll(frances);
		soloUno.addAll(español);
		soloUno.removeAll(Museos.alMenosDos(español, frances, ingles));
		soloUno.addAll(Museos.todosIdiomas(español, ingles, frances));
		return soloUno;
	}

}
