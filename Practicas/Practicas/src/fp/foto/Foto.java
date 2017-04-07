package fp.foto;

import fp.fecha.Fecha;
import fp.interfaces.Copiable;
import fp.persona.Persona;



public interface Foto extends Copiable<Foto> {

	String getTitulo();
	Persona getAutor();
	Fecha getFecha();
	FormatoImagen getFormato();
	Integer getAlto();
	Integer getAncho();
	Double getTamaño();
	Double getCalificacion();

	void setCalificacion(Double nuevaCalificacion);
	Boolean getRetocada();
	void setRetocada(Boolean nuevaRetocada);
	Integer getNumVisitas();
	void setNumVisitas(Integer nuevoNumeroDeVisitas);

}
