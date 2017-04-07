package fp.iterables;

import java.util.Iterator;

public class SecuenciaGeometrica implements Iterable<Integer> {
	
	private Integer begin, end, ratio;

	public SecuenciaGeometrica(Integer begin, Integer end, Integer ratio) {		
		//TODO: comprobar parámetros
		super();
		this.begin = begin;
		this.end = end;
		this.ratio = ratio;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new IteradorSecuenciaGeometrica();
	}
	
	private class IteradorSecuenciaGeometrica implements Iterator<Integer>{
		
		private Integer actual;

		public IteradorSecuenciaGeometrica(){
			actual=begin;
		}
		
		public boolean hasNext() {
			return actual<=end;
		}

		public Integer next() {
			// TODO comprobar que existe el siguiente

			Integer result;
			result= actual*ratio;
			actual=result;
			return result;
		}

		@Override
		public void remove() {
			// TODO elevar excepcion
			
		}
		
	}

}
