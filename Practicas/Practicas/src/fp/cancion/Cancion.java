package fp.cancion;

import fp.interfaces.Copiable;

public interface Cancion extends Copiable<Cancion>,Comparable<Cancion>{
	String getNombre();
	String getInterprete();
	Integer getDuracion();
	Integer getAño();
	Genero getGenero();
	Integer getNumeroReproducciones();
	Double getCalificacion();
	void setCalificacion(Double nuevaCalificacion);
	Boolean getReproducir();
	void setReproducir(Boolean nuevoReproducir);
	String getDuracionMS();
}


