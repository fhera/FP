package fp.pelicula;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

public class PeliculaImpl implements Pelicula {

	protected String nombre, nacionalidad;
	protected Integer año;
	protected Double presupuesto;
	protected Genero genero;

	public PeliculaImpl() {

	}

	public PeliculaImpl(String nombre, String nacionalidad, Genero genero,
			Double presupuesto, Integer año) {

		if (presupuesto < 0) {
			throw new PresupuestoNegativoException(
					"El presupuesto no puede ser negativo");
		}

		if (año < 1985) {
			throw new IllegalArgumentException(
					"El año no puede ser anterior a 1895");
		}
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.genero = genero;
		this.presupuesto = presupuesto;
		this.año = año;
	}

	// TODO: Aquí podemos estudiar el constructor a partir de cadena.
	
	public PeliculaImpl(String cad) {
		// Formato: getNombre()+"("+ getAño()+")";
		// Creamos una pelicula vacía
		
		this();
		
		// Partimos la cadena y la almacenamos en un iterador
		
		Splitter sp = Splitter.on(CharMatcher.anyOf("()"));
		Iterable<String> it = sp.omitEmptyStrings().trimResults().split(cad);
		
		// Recorremos el iterador y almacenamos en una lista
		
		List<String> parametros = new ArrayList<String>();
		
		for (String pal : it) {
			parametros.add(pal);
		}
		// En el caso de que no sean dos parámetros, damos un nuevo valor
		if (parametros.size() != 2) {
			throw new IllegalArgumentException("Formato de cadena no válido");
		} else {
			this.nombre = parametros.get(0);
			Integer a = new Integer(parametros.get(1));
			if (a < 1985) {
				throw new IllegalArgumentException(
						"El año no puede ser anterior a 1895");
			}
			this.año = a;
		}
	}

	public int compareTo(Pelicula p) {
		int result;

		result = getNombre().compareTo(p.getNombre());
		if (result == 0) {
			result = getAño().compareTo(p.getAño());
		}

		return result;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public Genero getGenero() {
		return genero;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double pres) {

		if (presupuesto < 0) {
			throw new PresupuestoNegativoException(
					"El presupuesto no puede ser negativo");
		}
		presupuesto = pres;
	}

	public Integer getAño() {
		return año;
	}

	public int hashCode() {
		return this.getNombre().hashCode() + this.getAño().hashCode() * 31;
	}

	public Pelicula clone() {
		Pelicula result = null;

		try {
			result = (Pelicula) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Pelicula) {
			Pelicula p = (Pelicula) o;
			result = this.getNombre().equals(p.getNombre())
					&& this.getAño().equals(p.getAño());
		}
		return result;
	}

	public String toString() {
		return getNombre() + " (" + getAño() + ")";
	}

}
