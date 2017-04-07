package fp.pelicula;

import java.util.Comparator;

public class ComparaPeliculaPorPresupuesto implements Comparator<Pelicula> {

	
	public int compare(Pelicula p1, Pelicula p2) {
		int result=p1.getPresupuesto().compareTo(p2.getPresupuesto());
		if(result==0&&!p1.equals(p2)){
			result=1;
		}
		return result;
	}

}
