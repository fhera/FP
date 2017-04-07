package fp.equipo;

import java.util.List;
import fp.interfaces.Copiable;
import fp.persona.Persona;

public interface Equipo extends Copiable<Equipo>{
	String getNombre();
	void setNombre(String nuevoNombre);
	List<Persona>getComponentes();
	void setComponentes(List<Persona>nuevoComponentes);
	void añadeComponente(Persona p);
}
