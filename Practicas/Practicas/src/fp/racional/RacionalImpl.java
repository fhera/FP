package fp.racional;

public class RacionalImpl implements Racional {

	private Integer denominador, numerador;

	public RacionalImpl() {
		numerador = 1;
		denominador = 1;
	}

	public RacionalImpl(Integer numerador) {
		if (numerador < 0) {
			throw new ValorNoValidoException(
					"EL NUMERADOR NO PUEDE SER MENOR QUE CERO, HA INTRODUCIDO: "
							+ numerador);
		}
		this.numerador = numerador;
		denominador = 1;
	}

	public RacionalImpl(Integer numerador, Integer denominador) {
		if (denominador.equals(0) || numerador < 0) {
			throw new ValorNoValidoException("ERROR AL INTRODUCIR LOS DATOS");
		}
		this.denominador = denominador;
		this.numerador = numerador;

	}

	public Integer getDenominador() {
		return denominador;
	}

	public void setDenominador(Integer denominador) {
		if (denominador <= 0) {
			throw new ValorNoValidoException(
					"ERROR AL INTRODUCIR LOS DATOS, EL DENOMINADOR NO PUEDE SER MENOR QUE CERO, HA INTRODUCIDO: "
							+ denominador);
		}
		this.denominador = denominador;
	}

	public Integer getNumerador() {
		return numerador;
	}

	public void setNumerador(Integer numerador) {
		if (numerador < 0) {
			throw new ValorNoValidoException(
					"EL NUMERADOR NO PUEDE SER MENOR QUE CERO, HA INTRODUCIDO: "
							+ numerador);
		}
		this.numerador = numerador;
	}

	public void sumar(Racional r) {
		Integer d = this.denominador * r.getDenominador();
		Integer n = this.numerador * r.getDenominador() + r.getNumerador()
				* denominador;
		numerador = n;
		denominador = d;
	}

	public void restar(Racional r) {
		Integer d = this.denominador * r.getDenominador();
		Integer n = this.numerador * r.getDenominador() - r.getNumerador()
				* this.getNumerador();
		setNumerador(n);
		setDenominador(d);
	}

	public void multiplicar(Racional r) {
		numerador = this.numerador * r.getNumerador();
		denominador = this.denominador * r.getDenominador();
	}

	public void dividir(Racional r) {
		numerador = this.numerador * r.getDenominador();
		denominador = this.denominador * r.getNumerador();
	}

	public Double valor() {
		return numerador / (denominador * 1.0);
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Racional) {
			Racional r = (Racional) o;
			Integer p1 = numerador * r.getDenominador();
			Integer p2 = denominador * r.getNumerador();
			result = p1.equals(p2);
		}
		return result;
	}

	public int compareTo(Racional r) {
		int result = this.valor().compareTo(r.valor());
		return result;
	}

	public Racional clone() {
		Racional result = null;
		try {
			result = (Racional) super.clone();
		} catch (CloneNotSupportedException error) {
			error.printStackTrace();
		}
		return result;
	}

	public int hashCode() {
		int result = getDenominador().hashCode() + getNumerador().hashCode()
				* 31;
		return result;
	}

	public String toString() {
		String result = "";
		if (getDenominador().equals(1)) {
			result = "" + getNumerador();
		} else {
			result = getNumerador() + "/" + getDenominador();
		}
		return result;
	}

}
