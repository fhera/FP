package fp.iterables;

import java.util.Iterator;

public class SecuenciaCaptcha implements Iterable<String> {

	private Integer numChars, numCaptchas;

	public SecuenciaCaptcha(Integer longitud, Integer items) {
		if (longitud.compareTo(2) <= 0 || items.compareTo(2) <= 0)
			throw new IllegalArgumentException("Parametros no validos");

		numChars = longitud;
		numCaptchas = items;
	}

	public Iterator<String> iterator() {
		return new IteradorSecuenciaCaptcha();
	}

	private class IteradorSecuenciaCaptcha implements Iterator<String> {
		private Integer contador = 0;
		private String vActual = crearCaptcha();

		public String next() {

			String res = vActual;
			vActual = crearCaptcha();
			contador++;
			return res;
		}

		public boolean hasNext() {
			return contador.compareTo(numCaptchas) <= 0;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		private String crearCaptcha() {
			Iterable<Integer> sa = new SecuenciaAleatoria(o, 26, numChars);
			String res = "";
			for (Integer x : sa)
				res += ((char) (x + 'a'));//TODO no se exactamente que se hace en esta linea
			return res;
		}
	}
}
