package fp.libro;

import fp.fecha.Fecha;
import fp.interfaces.Copiable;
import fp.persona.Persona;

public interface Libro extends Comparable<Libro>, Copiable<Libro>{
	
	String getISBN();
	void setISBN(String isbn);
	String getTitulo();
	void setTitulo(String titulo);
	Persona getAutor();
	void setAutor(Persona autor);
	Fecha getFechaEdicion();
	void setFechaEdicion(Fecha fedicion);
	Integer getNumPaginas();
	void setNumPaginas(Integer numpaginas);

}
