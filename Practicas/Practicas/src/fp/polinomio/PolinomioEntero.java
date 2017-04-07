package fp.polinomio;

import java.util.List;

import fp.interfaces.Copiable;

public interface PolinomioEntero extends Copiable<PolinomioEntero>{
	List<Integer> getCoeficientes();
	Integer getGrado();
	void setCoeficientes(List<Integer>listaCoeficientes);
	Integer getCoeficiente(Integer g);
	void setCoeficiente(Integer c, Integer g);
	void añadeCoeficiente(Integer c);
	void sumaCoeficiente(Integer c, Integer g);
	void multiplicaCoeficientes(Integer r);
	void sumar(PolinomioEntero p);
	void derivar();
	Double getValor(Double x);
}
