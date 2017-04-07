package fp.iterables;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SecuenciaAleatoria implements Iterable<Integer>{
	private Integer inicio, fin, cantidad;
	
	public SecuenciaAleatoria(Integer begin, Integer end, Integer cantidad){
		
		this.inicio=begin;
		this.fin=end;
		this.cantidad=cantidad;
	}
	public Iterator<Integer> iterator(){
		return new IteradorSecuenciaAleatoria();
	}
	
	private class IteradorSecuenciaAleatoria implements Iterator<Integer>{
		private Integer actual;
		
		public IteradorSecuenciaAleatoria(){
			actual=inicio;
		}
		
		public boolean hasNext(){
			return actual<=fin;
		}
		

		public Integer next() {
			if(!hasNext()){
				throw new NoSuchElementException();
			}
			Integer result= actual;
			Integer num_aleatorio=(int)(inicio+Math.random()*(fin-inicio));
			actual=num_aleatorio;
			return result;
		}
		
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}

}
