package fp.libro;

import java.util.Comparator;

public class ComparaLibroAutor implements Comparator<Libro>{
	
	public int compare(Libro l1, Libro l2){
		int result;
		
		result= l1.getAutor().compareTo(l2.getAutor());
		if (result == 0 && !l1.equals(l2)) {
			result = 1;
			}
		return result;
	}
}
