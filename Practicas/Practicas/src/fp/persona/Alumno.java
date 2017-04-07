package fp.persona;

import java.util.List;

import fp.asignatura.Asignatura;


public interface Alumno extends Persona{
	Titulacion getTitulacion();
	List<Asignatura>getMatriculadas();
	List<Asignatura>getAprobadas();
	Double getNotaMedia();
	Double getTotalCreditos();
	void aprobar(Asignatura a, Double n);
	void matricular(Asignatura a);
}
