package fp.test;

import java.util.ArrayList;
import java.util.List;

import fp.encuesta.*;
import fp.utiles.*;

public class TestEncuesta extends Test {
	public static void main(String[] args) {

		Encuesta encuesta1 = new EncuestaImpl("2052-E", 20, 5, 1200.0,
				Genero.HOMBRE);

		Encuesta encuesta2 = new EncuestaImpl("2053-E", 40, 2, 1200.0,
				Genero.HOMBRE);

		Encuesta encuesta3 = new EncuestaImpl("2054-E", 58, 10, 1200.0,
				Genero.HOMBRE);

		Encuesta encuesta4 = new EncuestaImpl("2055-E", 42, 11, 1200.0,
				Genero.HOMBRE);

		Encuesta encuesta5 = new EncuestaImpl("2056-E", 18, 10, 1200.0,
				Genero.HOMBRE);

		mostrar("Relevancia de la encuesta 5: ", encuesta5.getRelevancia());

		List<Encuesta> listaEnc = new ArrayList<Encuesta>();
		listaEnc.add(encuesta1);
		listaEnc.add(encuesta2);
		listaEnc.add(encuesta3);
		listaEnc.add(encuesta4);
		listaEnc.add(encuesta5);

		mostrar("lista de encuestas :", listaEnc);

		mostrar("Encuestas del distrito 10: ",
				Encuestas.encuestaDistrito(listaEnc, 10));

		mostrar("Las encuestas a mayores de 25 son :",
				Encuestas.encuestasEdadMayor(listaEnc, 25));

		String codigo = "esp";
		
		Encuesta[] encuestas = new Encuesta[5];
		encuestas[0] = encuesta1;
		encuestas[1] = encuesta2;
		encuestas[2] = encuesta3;
		encuestas[3] = encuesta4;
		encuestas[4] = encuesta5;

		mostrar("Añade el código " + codigo + " al id de las encuestas: ",
				Encuestas.añadeCodigo(encuestas, codigo));
	}
}
