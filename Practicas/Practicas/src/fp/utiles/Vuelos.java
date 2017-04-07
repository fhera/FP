package fp.utiles;

import java.util.ArrayList;
import java.util.List;

import fp.vuelo.Vuelo;

public class Vuelos {

	public static Vuelo primerVuelo(List<Vuelo> lv, String destino) {
		Vuelo result = lv.get(0);
		String dest = destino.toLowerCase();
		List<Vuelo> lista = new ArrayList<Vuelo>();
		for (Vuelo v : lv) {
			v.getCodigoVuelo().toLowerCase();
			if (v.getCodigoVuelo().equals(dest)) {
				lista.add(v);
			}
		}
		result = lista.get(0);
		return result;
	}

	public static Double sumaRecaudacionVuelosCompletos(List<Vuelo> lv) {
		Double result = 0.0;
		for (Vuelo v : lv) {
			if (v.getOcupacion().compareTo(100.0) <= 0) {
				result += v.getRecaudacion();
			}
		}
		return result;
	}

	public static List<Vuelo> listaVuelosConDestino(List<Vuelo> lv,
			String destino) {
		List<Vuelo> result = new ArrayList<Vuelo>();
		String dest = destino.toLowerCase();
		for (Vuelo v : lv) {
			if (v.getCodigoVuelo().toLowerCase().equals(dest)) {
				result.add(v);
			}
		}
		return result;
	}

	public static Vuelo vueloDestinoConMasPlazas(List<Vuelo> lv, String destino) {
		List<Vuelo> lista = Vuelos.listaVuelosConDestino(lv, destino);
		Vuelo result = lista.get(0);
		for (Vuelo v : lista) {
			if (v.getNumeroPlazas().compareTo(result.getNumeroPlazas()) >= 0) {
				result = v;
			}
		}
		return result;
	}

	public static Vuelo vueloMasBarato(List<Vuelo> lv) {
		Vuelo result = lv.get(0);
		for (Vuelo v : lv) {
			if (v.getPrecio().compareTo(result.getPrecio()) <= 0) {
				result = v;
			}
		}
		return result;
	}

	public static Integer numeroVuelosCompletosDestino(List<Vuelo> lv,
			String destino) {
		Integer result = 0;
		List<Vuelo> lista = Vuelos.listaVuelosConDestino(lv, destino);
		for (Vuelo v : lista) {
			if (v.getOcupacion().equals(100.0)) {
				result++;
			}
		}
		return result;
	}

	public static Double recaudacionVuelosDestino(List<Vuelo> lv, String destino) {
		Double result = 0.0;
		List<Vuelo> lista = Vuelos.listaVuelosConDestino(lv, destino);
		for (Vuelo v : lista) {
			result += v.getRecaudacion();
		}
		return result;
	}

	public static Boolean plazasLibresDestino(List<Vuelo> lv, String destino) {
		Boolean result = false;
		List<Vuelo> lista = Vuelos.listaVuelosConDestino(lv, destino);
		for (Vuelo v : lista) {
			if (!v.getOcupacion().equals(100.0)) {
				result = true;
				break;
			}
		}
		return result;
	}
}
