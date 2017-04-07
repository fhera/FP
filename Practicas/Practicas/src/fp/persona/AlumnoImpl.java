package fp.persona;

import java.util.ArrayList;
import java.util.List;

import fp.asignatura.Asignatura;
import fp.utiles.*;

public class AlumnoImpl extends PersonaImpl implements Alumno {
	private Titulacion titulacion;
	private List<Asignatura> aprobadas, matriculadas;
	private Double notaMedia, totalCreditos;

	public AlumnoImpl(String nombre, String apellidos, String DNI,
			Integer edad, Double estatura, Genero sexo, Titulacion titulacion) {
		super(nombre, apellidos, DNI, edad, estatura, sexo);
		this.titulacion = titulacion;
		aprobadas = getAprobadas();
		matriculadas = getMatriculadas();
	}

	public Titulacion getTitulacion() {
		return titulacion;
	}

	public List<Asignatura> getAprobadas() {
		for (Asignatura a : getMatriculadas()) {
			if (a.getNota().compareTo(5.0) >= 0) {
				aprobadas.add(a);
			}
		}
		return aprobadas;
	}

	public List<Asignatura> getMatriculadas() {
		return matriculadas;
	}

	public Double getNotaMedia() {
		List<Double> AsAp = new ArrayList<Double>();
		for (Asignatura a : getAprobadas()) {
			AsAp.add(a.getNota());
		}
		notaMedia = Reales.mediaAritmetica(AsAp);
		return notaMedia;
	}

	public Double getTotalCreditos() {
		totalCreditos = 0.0;
		for (Asignatura a : getMatriculadas()) {
			totalCreditos += a.getNumeroCreditos();
		}
		return totalCreditos;
	}

	public void aprobar(Asignatura a, Double n) {
		if (n < 5) {
			throw new IllegalArgumentException(
					"La nota no puede ser menor de 5.0");
		}
		Asignatura asig = a.clone();
		getAprobadas().add(asig);
		asig.setNota(n);

	}

	public void matricular(Asignatura a) {
		getMatriculadas().add(a);
	}

	public String toString() {
		return super.toString() + "\n" + getTitulacion() + ", "
				+ getNotaMedia() + "\n" + getMatriculadas() + "\n"
				+ getAprobadas();
	}
}
