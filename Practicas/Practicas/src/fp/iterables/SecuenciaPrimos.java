package fp.iterables;

import java.util.Iterator;
import java.util.NoSuchElementException;

import fp.utiles.Enteros;

public class SecuenciaPrimos implements Iterable<Integer> {

	private Integer end;

	public SecuenciaPrimos(Integer end) {
		// TODO comprobar parámetro
		super();
		this.end = end;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new IteradorSecuenciaPrimos();
	}

	private class IteradorSecuenciaPrimos implements Iterator<Integer> {

		private Integer actual = 1;

		public boolean hasNext() {
			return actual <= end;
		}

		public Integer next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}

			Enteros.esPrimo(actual);
			Integer result = actual;
			result = actual + 1;
			return result;
		}

		public void remove() {
			// TODO elevar la excepcion
			throw new UnsupportedOperationException();
		}

	}
}
