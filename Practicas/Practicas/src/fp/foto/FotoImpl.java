package fp.foto;

import fp.fecha.*;
import fp.persona.*;

public class FotoImpl implements Foto {
	private String titulo;
	private Persona autor;
	private Fecha fecha;
	private FormatoImagen formato;
	private Integer alto, ancho, numeroDeVisitas;
	private Double tamaño, calificacion;
	private Boolean retocada;

	public FotoImpl(String titulo, Persona autor, Fecha fecha,
			FormatoImagen formato, Integer alto, Integer ancho,
			Integer numeroDeVisitas, Double tamaño, Double calificacion,
			Boolean retocada) {
		if (alto < 0 || ancho < 0 || tamaño < 0 || numeroDeVisitas < 0)
			throw new NumeroNegativoException("error al introducir los datos,"
					+ "el numero no puede ser negativo");
		if (calificacion < 0.0 || calificacion > 10.0)
			throw new CalificacionNoValidaException(
					"la calificación debe estar comprendida entre 0 y 10");
		this.titulo = titulo;
		this.autor = autor;
		this.fecha = fecha;
		this.formato = formato;
		this.alto = alto;
		this.ancho = ancho;
		this.numeroDeVisitas = numeroDeVisitas;
		this.tamaño = tamaño;
		this.calificacion = calificacion;
		this.retocada = retocada;
	}

	public String getTitulo() {
		return titulo;
	}

	public Persona getAutor() {
		return autor;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public FormatoImagen getFormato() {
		return formato;
	}

	public Integer getAlto() {
		return alto;
	}

	public Integer getAncho() {
		return ancho;
	}

	public Integer getNumVisitas() {
		return numeroDeVisitas;
	}

	public void setNumVisitas(Integer nuevoNumeroDeVisitas) {
		if (nuevoNumeroDeVisitas < 0)
			throw new NumeroNegativoException(
					"el numero de visitas no puede ser negativo");
		numeroDeVisitas = nuevoNumeroDeVisitas;
	}

	public Double getTamaño() {
		return tamaño;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double nuevaCalificacion) {
		if (nuevaCalificacion < 10 || nuevaCalificacion > 0)
			throw new CalificacionNoValidaException(
					"la calificacion tiene que estar entre 0 y 10");
		calificacion = nuevaCalificacion;
	}

	public Boolean getRetocada() {
		return retocada;
	}

	public void setRetocada(Boolean nuevaRetocada) {
		retocada = nuevaRetocada;
	}

	public Foto clone() {
		Foto result = null;
		try {
			result = (Foto) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int hashCode() {
		return this.getTitulo().hashCode() + this.getAutor().hashCode()
				+ this.getCalificacion().hashCode() * 31;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Foto) {
			boolean a = this.getTitulo().equals(((Foto) o).getTitulo());
			boolean b = this.getAutor().equals(((Foto) o).getAutor());
			boolean c = this.getCalificacion().equals(
					((Foto) o).getCalificacion());
			result = a && b && c;
		}
		return result;
	}

	public String toString() {
		return "[ " + getTitulo() + ", " + getAutor() + ", "
				+ getCalificacion() + "]";
	}
}
