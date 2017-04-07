package fp.encuesta;

public class EncuestaImpl implements Encuesta {

	private String identificador;
	private Double salario;
	final Double FACTOR_RELEVANCIA = 0.15;
	private Integer edad, distrito;
	private Genero genero;

	public EncuestaImpl(String identificador, Integer edad, Integer distrito,
			Double salario, Genero genero) {

		if (distrito < 1 || distrito > 20) {
			throw new EncuestaNoValidaException(
					"El distrito debe estar entre 1 y 20 ha introducido: "
							+ distrito);
		}
		this.identificador = identificador;
		this.salario = salario;
		this.edad = edad;
		this.distrito = distrito;
		this.genero = genero;

	}

	public EncuestaImpl() {
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getIdentificador() {
		return identificador;
	}

	public Double getRelevancia() {
		return FACTOR_RELEVANCIA * edad;
	}

	public Integer getDistrito() {
		if (distrito < 1 || distrito > 20) {
			throw new EncuestaNoValidaException(
					"El distrito debe estar entre 1 y 20 ha introducido: "
							+ distrito);
		}
		return distrito;
	}

	public Genero getGenero() {
		if (genero != Genero.HOMBRE || genero != Genero.MUJER) {
			throw new EncuestaNoValidaException(
					"El genero debe ser Hombre o Mujer" + " ha introducido: "
							+ genero);
		}
		return genero;
	}

	public int hashCode() {
		Integer result = (getIdentificador().hashCode() + getDistrito()
				.hashCode()) * 31;
		return result;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Encuesta) {
			result = this.getIdentificador().equals(
					((Encuesta) o).getIdentificador());
		}
		return result;
	}

	public Encuesta clone() {
		Encuesta result = null;
		try {
			result = (Encuesta) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public String toString() {
		return "[" + getIdentificador() + "]";
	}
}
