package fp.pelicula;

import fp.interfaces.Copiable;

public interface Pelicula extends Copiable<Pelicula>, Comparable<Pelicula> {
	
	String getNombre();
	String getNacionalidad();
	Genero getGenero();
	Double getPresupuesto();
	void setPresupuesto(Double pres);
	Integer getAño();
}
