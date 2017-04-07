package fp.cancion;

import java.util.LinkedList;
import java.util.List;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

public class CancionImpl implements Cancion {

	private String nombre;
	protected String interprete;
	private Integer duracion;
	protected Integer año;
	private Integer numeroReproducciones;
	private Genero genero;
	private Double calificacion;
	private Boolean reproducir;

	public CancionImpl() {

	}

	public CancionImpl(String nombre, String interprete, Integer duracion,
			Integer año, Integer numeroReproducciones, Genero genero,
			Double calificacion, Boolean reproducir) {

		if (duracion < 0 || numeroReproducciones < 0)
			throw new NumeroNegativoException("Error! no puede ser negativo");

		if (calificacion < 0 || calificacion > 10)
			throw new CalificacionNoValidaException(
					"La calificacion debe estar entre 0 y 10");

		this.nombre = nombre;
		this.interprete = interprete;
		this.duracion = duracion;
		this.año = año;
		this.numeroReproducciones = numeroReproducciones;
		this.genero = genero;
		this.calificacion = calificacion;
		this.reproducir = reproducir;
	}

	public CancionImpl(String cad) {
		this();
		Splitter sp = Splitter.on(CharMatcher.anyOf("[,]"));

		Iterable<String> it = sp.omitEmptyStrings().trimResults().split(cad);

		List<String> parametros = new LinkedList<String>();
		for (String pal : it)
			parametros.add(pal);
		
		if(parametros.size()!=2){
			throw new IllegalArgumentException("Cadena no válidos");
		}else{
			this.nombre=parametros.get(0);
			this.interprete=parametros.get(1);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getInterprete() {
		return interprete;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public Integer getAño() {
		return año;
	}

	public Integer getNumeroReproducciones() {
		return numeroReproducciones;
	}

	public void setNumeroReproducciones(Integer nuevoNumeroReproducciones) {

		if (nuevoNumeroReproducciones < 0)
			throw new NumeroNegativoException(
					"El número de reproducciones no puede ser negativo");

		numeroReproducciones = nuevoNumeroReproducciones;
	}

	public Genero getGenero() {
		return genero;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double nuevaCalificacion) {
		if (nuevaCalificacion < 0 || nuevaCalificacion > 10)
			throw new CalificacionNoValidaException(
					"la calificacion debe estar entre 0 y 10");
		this.calificacion = nuevaCalificacion;
	}

	public Boolean getReproducir() {
		return reproducir;
	}

	public void setReproducir(Boolean nuevoReproducir) {
		reproducir = nuevoReproducir;
	}

	public String getDuracionMS() {
		Integer segundos = duracion % 60;
		Integer minutos = (duracion - (duracion % 60)) / 60;
		String result = "(" + minutos + ":" + segundos + ")";
		return result;
	}

	public Cancion clone() {
		Cancion result = null;
		try {
			result = (Cancion) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int hashCode() {
		return this.getNombre().hashCode() + this.getInterprete().hashCode()
				+ this.getAño().hashCode() * 31;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Cancion) {
			Cancion c = (Cancion) o;
			result = this.getNombre().equals(c.getNombre())
					&& this.getInterprete().equals(c.getInterprete())
					&& this.getAño().equals(c.getAño());
		}
		return result;
	}

	public int compareTo(Cancion c) {
		int result;
		result = getNombre().compareTo(c.getNombre());
		if (result == 0) {
			result = getInterprete().compareTo(c.getInterprete());
			if (result == 0) {
				result = getAño().compareTo(c.getAño());
			}
		}
		return result;
	}

	public String toString() {
		return "[" + getNombre() + "," + getInterprete() + "]";
	}

}
