package fp.pelicula;

import java.util.Comparator;


public class ComparaPeliculaPorNombre implements Comparator<Pelicula> {

	
	public int compare(Pelicula p1, Pelicula p2) {
		int result=p1.getNombre().compareTo(p2.getNombre());
		if(result==0&&!p1.equals(p2)){
			result=1;
		}
		return result;
	}
}