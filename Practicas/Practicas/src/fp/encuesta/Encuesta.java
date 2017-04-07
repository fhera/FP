package fp.encuesta;

import fp.interfaces.Copiable;

public interface Encuesta extends Copiable<Encuesta> {

	String getIdentificador();

	Double getSalario();

	void setSalario(Double nuevoSalario);

	Integer getEdad();

	void setEdad(Integer nuevaEdad);

	Genero getGenero();

	Integer getDistrito();

	Double getRelevancia();
}
