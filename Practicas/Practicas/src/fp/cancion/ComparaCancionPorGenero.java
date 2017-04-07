package fp.cancion;

import java.util.Comparator;

public class ComparaCancionPorGenero implements Comparator<Cancion>{
	public int compare(Cancion c1, Cancion c2){
		int result;
		result=c1.getGenero().compareTo(c2.getGenero());
		if(result==0&&!c1.equals(c2)){
			result=1;
		}
		return result;
	}
}