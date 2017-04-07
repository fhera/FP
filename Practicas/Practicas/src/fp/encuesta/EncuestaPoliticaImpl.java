package fp.encuesta;

public class EncuestaPoliticaImpl extends EncuestaImpl implements
		EncuestaPolitica {

	private boolean afiliado;
	private PartidoPolitico voto;
	private Double relevancia;

	public EncuestaPoliticaImpl() {
	}

	public EncuestaPoliticaImpl(String identificador, Integer edad,
			Integer distrito, Double salario, Genero genero, Boolean afiliado,
			PartidoPolitico voto) {

		super(identificador, edad, distrito, salario, genero);
		if (edad < 18)
			throw new EncuestaNoValidaException(
					"La edad mínima para votar es 18 años.");

		this.afiliado = afiliado;
		this.voto = voto;
	}

	public Boolean getAfiliado() {
		return afiliado;
	}

	public PartidoPolitico getVoto() {
		return voto;
	}

	public Double getRelevancia() {
		if (afiliado == true) {
			relevancia = 0.0;
		} else {
			relevancia = 0.15;
		}
		return relevancia;
	}

	public int hashCode() {
		return (this.getIdentificador().hashCode() + this.getDistrito()
				.hashCode()) * 31;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof EncuestaPolitica) {
			result = this.getIdentificador().equals(
					((EncuestaPolitica) o).getIdentificador());
		}
		return result;
	}

	public String toString() {
		return "[" + getIdentificador() + "]" + getVoto();
	}
}
