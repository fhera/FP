package fp.asignatura;

import fp.interfaces.Copiable;

public interface Asignatura extends Copiable<Asignatura>{
	CodigoAsignatura getCodigo();
	Double getNumeroCreditos();
	Double getNota();
	void setNota(Double n);

}
