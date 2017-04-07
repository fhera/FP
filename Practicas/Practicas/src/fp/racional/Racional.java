package fp.racional;

import fp.interfaces.Copiable;

public interface Racional extends Copiable<Racional>,Comparable<Racional>{
	Integer getNumerador();
	Integer getDenominador();
	void setNumerador(Integer nuevoNumerador);
	void setDenominador(Integer nuevoDenominador);
	void sumar(Racional r);
	void restar(Racional r);
	void multiplicar(Racional r);
	void dividir(Racional r);
	Double valor();
}
