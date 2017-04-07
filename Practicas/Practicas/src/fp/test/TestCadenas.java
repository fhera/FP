package fp.test;

import fp.utiles.Cadenas;

public class TestCadenas extends Test {
	public static void main(String[] args) {

		String nombre = "Otorrinolaringologo";
		
		mostrar("Hay ", Cadenas.cuentaVocales(nombre) + " vocales en " + nombre);

		mostrar("Invierte cadena: ", Cadenas.invierteCadena(nombre));

		String nombre2= "el perro de san roque no tiene rabo";
		
		mostrar("Erres en el texto: ", Cadenas.cuentaApariciones(nombre2, 'r'));
		mostrar("Erres en el texto: ", Cadenas.cuentaApariciones(nombre, 'r'));

	}
}
