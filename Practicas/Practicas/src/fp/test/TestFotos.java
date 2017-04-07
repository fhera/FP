package fp.test;

import java.util.ArrayList;
import java.util.List;

import fp.fecha.FechaImpl;
import fp.foto.*;
import fp.persona.Genero;
import fp.persona.PersonaImpl;
import fp.utiles.Fotos;

public class TestFotos extends Test {

	public static void main(String[] args) {

		Foto f1 = new FotoImpl("yo en el campo", new PersonaImpl("31819166-W",
				"Luis Alfredo", "Rodiezales Garbo", 40, 70.5, 1.78,
				Genero.Hombre), new FechaImpl(11, 2, 2004), FormatoImagen.JPG,
				18, 18, 120, 250.3, 0.0, false);

		Foto f2 = new FotoImpl("el paco y yo", new PersonaImpl("32458792-Q",
				"Antonio", "Roldan Santo", 12, 50.0, 1.62, Genero.Hombre),
				new FechaImpl(8, 8, 2008), FormatoImagen.BMP, 10, 10, 318,
				74.6, 0.0, true);

		Foto f3 = new FotoImpl("la piscina", new PersonaImpl("32458792-Q",
				"Paco", "Murube Falcon", 12, 50.0, 1.62, Genero.Hombre),
				new FechaImpl(8, 8, 2008), FormatoImagen.BMP, 5, 5, 250, 74.6,
				7.5, false);

		Foto f4 = new FotoImpl("waterpolo", new PersonaImpl("32458792-Q",
				"Paco", "Murube Falcon", 12, 50.0, 1.62, Genero.Hombre),
				new FechaImpl(8, 8, 2008), FormatoImagen.BMP, 7, 8, 284, 74.6,
				5.0, true);

		List<Foto> listaFotos = new ArrayList<Foto>();
		listaFotos.add(f1);
		listaFotos.add(f2);
		listaFotos.add(f3);
		listaFotos.add(f4);

		mostrar("La lista de fotos es: ", listaFotos);

		Double cal = 0.0;

		mostrar("Las fotos con calificacion " + cal + " son: ",
				Fotos.fotosConCalificacion(listaFotos, cal));

		mostrar("La foto mas visitada es: ", Fotos.fotoMasVisitada(listaFotos));

		Integer[] intervaloAncho = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer[] intervaloAlto = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		mostrar("Las fotos que tienen tamaño adecuado son: ",
				Fotos.fotosResolucion(listaFotos, intervaloAncho,
						intervaloAlto));

		mostrar("Las fotos retocadas son: ", Fotos.fotosRetocadas(listaFotos));

		mostrar("La media de visitas es: ", Fotos.mediaVisitas(listaFotos));
	}
}
