package fp.libro;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

import fp.fecha.*;
import fp.persona.Persona;

public class LibroImpl implements Libro {

	private String isbn, titulo;
	private Persona autor;
	private Fecha fedicion;
	private Integer numpaginas;

	public LibroImpl() {

	}

	public LibroImpl(String isbn, String titulo, Persona autor, Fecha fedicion,
			Integer numpaginas) {

		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
		this.fedicion = fedicion;
		this.numpaginas = numpaginas;
	}
	
	public LibroImpl(String cad){
		this();
		Splitter sp= Splitter.on(CharMatcher.anyOf("[,]"));
		Iterable<String> it= sp.omitEmptyStrings().trimResults().split(cad);
		
		List<String> parametros = new ArrayList<String>();

		for(String pal: it)
			parametros.add(pal);
		
		if(parametros.size()!=3){
			throw new IllegalArgumentException("Cadena no válida");
		}else{
			this.isbn= parametros.get(0);
			this.titulo= parametros.get(1);
			Fecha fed= new FechaImpl (parametros.get(2));
			
			this.fedicion=fed;
		}
		
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Persona getAutor() {
		return autor;
	}

	public void setAutor(Persona autor) {
		this.autor = autor;
	}

	public Fecha getFechaEdicion() {
		return fedicion;
	}

	public void setFechaEdicion(Fecha fedicion) {
		this.fedicion = fedicion;
	}

	public Integer getNumPaginas() {
		return numpaginas;
	}

	public void setNumPaginas(Integer numpaginas) {
		this.numpaginas = numpaginas;
	}

	public boolean equals(Object o) {
		boolean result = false;

		if (o instanceof Libro) {
			Libro l = (Libro) o;
			result = this.getISBN().equals(l.getISBN())
					&& this.getTitulo().equals(l.getTitulo())
					&& this.getFechaEdicion().equals(l.getFechaEdicion());
		}
		return result;
	}

	public int hashCode() {
		return this.getISBN().hashCode() + this.getTitulo().hashCode()
				+ this.getFechaEdicion().hashCode() * 31;
	}

	public Libro clone() {
		Libro result = null;
		try {
			result = (Libro) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public String toString() {
		return "[" + this.getISBN() + ", " + this.getTitulo() + ", "
				+ this.getFechaEdicion() + "]";
	}

	public int compareTo(Libro l) {
		int result;
		result = this.getTitulo().compareTo(l.getTitulo());
		if (result == 0) {
			result = this.getFechaEdicion().compareTo(l.getFechaEdicion());
			if (result == 0)
				result = this.getISBN().compareTo(l.getISBN());
		}
		return result;
	}
}
