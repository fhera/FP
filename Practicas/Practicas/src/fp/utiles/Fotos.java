package fp.utiles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import fp.foto.*;

public class Fotos {

	public static List<Foto> fotosConCalificacion(List<Foto> lf, Double cal) {
		List<Foto> result = new LinkedList<Foto>();

		for (Foto e : lf) {
			if (e.getCalificacion().equals(cal)) {
				result.add(e);
			}
		}
		return result;
	}

	public static Foto fotoMasVisitada(List<Foto> lf) {
		Foto result = lf.get(0);

		for (Foto e : lf) {
			if (e.getNumVisitas().compareTo(result.getNumVisitas()) > 0)
				result = e;
		}
		return result;
	}

	public static List<Foto> fotosResolucion(List<Foto> lf,
			Integer[] intervaloAncho, Integer[] intervaloAlto) {

		List<Foto> listaFotos = new ArrayList<Foto>();

		for (Foto foto : lf) {

			if (foto.getAncho() >= intervaloAncho[0]
					&& foto.getAncho() <= intervaloAncho.length
					&& foto.getAlto() >= intervaloAlto[0]
					&& foto.getAlto() <= intervaloAlto.length) {
				listaFotos.add(foto);
			}
		}
		return listaFotos;
	}

	public static List<Foto> fotosRetocadas(List<Foto> lf) {
		List<Foto> listaFotos = new ArrayList<Foto>();

		for (Foto f : lf) {
			if (f.getRetocada() == true)
				listaFotos.add(f);
		}
		return listaFotos;
	}

	public static Double mediaVisitas(List<Foto> lf) {
		Double result = 0.0;

		for (Foto f : lf) {
			result += f.getNumVisitas();
		}

		Double media = result / lf.size() * 1.0;
		return media;
	}
}
