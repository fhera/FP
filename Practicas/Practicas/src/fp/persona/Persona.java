package fp.persona;

import fp.interfaces.Copiable;

public interface Persona extends Copiable<Persona>,Comparable<Persona>{
	String getDNI();
	String getNombre();
	String getApellidos();
	Integer getEdad();
	void setEdad(Integer edad);
	Double getEstatura();
	void setEstatura(Double estatura);
	Double getPeso();
	void setPeso(Double peso);
	Genero getSexo();
	Double getIMC();
}
