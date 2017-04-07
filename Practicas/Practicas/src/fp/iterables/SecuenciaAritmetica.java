package fp.iterables;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SecuenciaAritmetica implements Iterable<Double>{
	
	private Double inicio, fin, diferencia;
	
	public SecuenciaAritmetica(Double begin, Double end, Double dif){
		
		if (begin< end && dif <= 0)
			throw new IllegalArgumentException("SecuenciaAritmetica.SecuenciaAritmetica:Diferencia negativa");
		
		if(begin>end && dif>=0)
			throw new IllegalArgumentException("SecuenciaAritmetica.SecuenciaAritmetica:Diferencia positiva");
		
		inicio=begin;
		fin=end;
		diferencia=dif;
	}

	public Iterator<Double> iterator(){
		return new IteradorSecuenciaAritmetica();
	}
	
	private class IteradorSecuenciaAritmetica implements Iterator<Double>{
		private Double actual;
		
		public IteradorSecuenciaAritmetica(){
			actual=inicio;
		}
		
		public boolean hasNext(){
			//return actual.compareTo(fin)<=0;
			return actual<= fin;
		}
		
		public Double next() {
			if(!hasNext()){
				throw new NoSuchElementException();
			}
			
			Double result=actual;
			actual+= diferencia;
			return result;
		}
		
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}
}
