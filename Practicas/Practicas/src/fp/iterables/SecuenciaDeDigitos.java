package fp.iterables;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SecuenciaDeDigitos implements Iterable<Integer> {

	private Integer numero;

	public SecuenciaDeDigitos(Integer num) {
		if (num.compareTo(0) <= 0) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		numero = num;
	}

	public Iterator<Integer> iterator() {
		return new IteradorSecuenciaDigitos();
	}

	private class IteradorSecuenciaDigitos implements Iterator<Integer> {

		private Integer num = numero;
		private Integer vActual = num % 10;

		public Integer next() {
			if (!hasNext())
				throw new NoSuchElementException();

			Integer res = vActual;
			num = num / 10;
			vActual = num % 10;
			return res;
		}

		public boolean hasNext() {
			return num.compareTo(0) > 0;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}
}
