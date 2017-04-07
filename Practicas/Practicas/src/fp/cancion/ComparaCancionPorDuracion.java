package fp.cancion;

import java.util.Comparator;

public class ComparaCancionPorDuracion implements Comparator<Cancion>{
	public int compare(Cancion c1, Cancion c2){
		int result=c1.getDuracion().compareTo(c2.getDuracion());
		if(result==0&&!c1.equals(c2)){
			result=1;
		}
		return result;
	}
}
