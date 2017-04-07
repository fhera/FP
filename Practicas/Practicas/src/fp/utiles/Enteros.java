package fp.utiles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Enteros {
	// Sin atributos "sin privates"
	// Sin constructor
	
	public static Integer maximo(Integer a, Integer b, Integer c) {
		Integer result = a;
		if (b > a) {
			result = b;
		} else {
			result = b;
		}
		if (c > result) {
			result = c;
		}
		return result;
	}

	public static Integer factorial(Integer n) {
		Integer result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static Integer sumMultiplos(Integer a, Integer b, Integer c) {
		Integer result = 0;
		for (int i = b; i <= c; i++) {
			if (i % a == 0) {
				result += i;
			}
		}
		return result;
	}

	public static Boolean esPrimo(Integer n) {
		Boolean result = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				result = false;
			}
		}
		return result;
	}

	public static Integer[] iniArray(Integer tamaño) {
		Integer[] result = new Integer[tamaño];
		for (int i = 0; i < tamaño; i++) {
			result[i] = i + 1;
		}
		return result;
	}

	public static Integer sumaElementos(List<Integer> numeros) {
		Integer result = 0;
		for (Integer elemento : numeros) {
			result = result + elemento;
		}
		return result;
	}

	public static Double media(List<Integer> numeros) {
		return sumaElementos(numeros) / (numeros.size() * 1.0);
	}

	public static Integer[] arrayInverso(Integer[] numeros) {
		Integer[] result= new Integer[numeros.length];
		
		for(int i=0; i<numeros.length; i++){
			result[i]= numeros[numeros.length-i-1];
		}
		return result;
	}

	public static List<Double> listaInversa(List<Double> numeros) {
		List<Double> result= new LinkedList<Double>();
		
		for(double e: numeros){
			result.add(0,e);
		}
		return result;	
	}
	
	public static List<Integer> primosMenores(Integer n){
		List<Integer> result= new LinkedList<Integer>();
		
		for(int i=1; i<n;i++){
			if( Enteros.esPrimo(i))
				result.add(i);
		}
		return result;
	}
	
	public static Integer permutacionesSinRepeticion(Integer n, Integer r) {
		Integer result = 0;
		if (n >= r) {
			result = factorial(n) / factorial(n - r);
		} else {
			throw new IllegalArgumentException("Error al introducir los datos.");
		}
		return result;
	}

	public static Integer permutacionesConRepeticion(Integer n, Integer r) {
		Integer result = 1;
		for (int i = 1; i <= r; i++) {
			result = result * n;
		}
		return result;
	}

	public static Integer combinacionesSinRepeticion(Integer n, Integer r) {
		Integer result = 0;
		if (n >= r) {
			result = factorial(n) / (factorial(r) * (factorial(n - r)));
		} else {
			throw new IllegalArgumentException("error al introducir los datos");
		}
		return result;
	}

	public static Integer combinacionesConRepeticion(Integer n, Integer r) {
		Integer result = 0;
		if (n >= r) {
			result = factorial(n + r - 1) / (factorial(r) * factorial(n - 1));
		} else {
			throw new IllegalArgumentException("error al introducir los datos");
		}
		return result;
	}

	public static Integer numeroDivisores(Integer n) {
		Integer result = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				result++;
		}
		return result;
	}

	public static Integer sumaDivisores(Integer n) {
		Integer result = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				result = result + i;
			}
		}
		return result;
	}

	public static Integer sumaPrimosMenores(Integer n) {
		Integer result = 0;
		for (int i = 2; i < n; i++) {
			if (esPrimo(i)) {
				result = result + i;
			}
		}
		return result;
	}

	public static Double mediaGeometrica(List<Double> lista) {
		Double result = 1.0;
		for (int i = 0; i < lista.size(); i++) {
			Double x = lista.get(i);
			result = result * x;
		}
		Double mediaGeometrica = Math.pow(result, 1.0 / (lista.size() * 1.0));
		return mediaGeometrica;
	}

	public static Double mediaArmonica(List<Double> lista) {
		Double result = 0.0;
		for (int i = 0; i < lista.size(); i++) {
			Double x = lista.get(i);
			result += 1.0 / (x * lista.size());
		}
		Double mediaArmonica = 1.0 / result;
		return mediaArmonica;
	}

	/*
	 * public static Double varianza(List<Double>lista){ Double result=0.0;
	 * for(int i=0;i<lista.size();i++){ Double x=lista.get(i);
	 * result+=Math.pow(x-media(lista),2); } return result; } public static
	 * Double desviacionTipica(List<Double>lista){ Double
	 * result=Math.abs(Math.sqrt(varianza(lista))); return result; }
	 */
	public static List<Integer> creaListaEnteros(Integer n) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			result.add(i);
		}
		return result;
	}

	public static List<Integer> ordenAleatoriaLista(Integer n) {
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> lista = Enteros.creaListaEnteros(n);
		for (Integer i = 0; i < n; i++) {
			Integer x = (int) (Math.random() * n);
			lista.get(i);
			result.add(x, i);
		}
		return result;
	}
}
