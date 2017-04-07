package fp.iterables;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Fibonaci implements Iterable<Integer>{
	
	private Integer cota;

	public Fibonaci( Integer cota) {
		//TODO comprobar parámetros
		super();
		this.cota=cota;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new IteradorFibonaci();
	}
	
	private class IteradorFibonaci implements Iterator<Integer>{

		private Integer actual, anterior;
		
		public IteradorFibonaci (){
			actual=1;
			anterior=1;
		}
		//TODO: return EXPRESION_LOGICA SOBRE actual. Ejemplo:
		//return actual.compareTo(_____)<=0;
		public boolean hasNext() {
			return actual<=cota;
		}

		public Integer next() {			
			if(!hasNext())
				throw new NoSuchElementException();
			//Calculo el que será el siguiente elemento
			Integer result= actual;
			actual+=anterior;
			anterior=result;
			return result;
		}

		public void remove() {
			// TODO elevar excepcion
			
		}
		
	}

}
