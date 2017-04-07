package fp.utiles;

import java.util.List;

public class Reales {
	
	public static Double mediaAritmetica(List<Double> datos) {
		return sumaElementos(datos) / datos.size();
	}

	public static Double desviacionEstandar(List<Double> datos) {
		Double result = Math.abs(Math.sqrt(varianza(datos)));
		return result;
	}

	public static Double maximo(List<Double> datos) {
		Double result = datos.get(0);
		
		for (Double a : datos) {
			if (a.compareTo(result) >= 0) {
				result = a;
			}
		}
		return result;
	}

	public static Double minimo(List<Double> datos) {
		Double result = datos.get(0);
		
		for (Double e : datos) {
			if (e.compareTo(result) <= 0) {
				result = e;
			}
		}
		return result;
	}

	public static Boolean hayRuido(List<Double> datos, Double umbral) {
		boolean result = false;
		for (Double e : datos) {
			
			if (!(-Math.abs(umbral) < e && e < Math.abs(umbral))) {
				result = true;
				break;
			}
		}
		return result;
	}
	public static Double sumaElementos(List<Double> datos) {
		Double result = 0.0;
		
		for (Double e: datos) {
			result += e;
		}
		return result;
	}

	public static Double varianza(List<Double> datos) {
		Double result = 0.0;
		
		for (int i = 0; i < datos.size(); i++) {
			Double x = datos.get(i);
			result += Math.pow(x - mediaAritmetica(datos), 2);
		}
		return result;
	}
}
