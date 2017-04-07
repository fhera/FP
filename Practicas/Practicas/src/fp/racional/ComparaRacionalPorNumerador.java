package fp.racional;

import java.util.Comparator;

public class ComparaRacionalPorNumerador implements Comparator<Racional>{
	public int compare(Racional r1,Racional r2){
		int result=r1.getNumerador().compareTo(r2.getNumerador());
		if(result==0){
			result=r1.getDenominador().compareTo(r2.getDenominador());
		}else if(result==0&&!r1.equals(r2)){
			result=1;
		}
		return result;
	}
}
