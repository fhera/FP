package fp.test;

import java.util.Arrays;
import fp.fecha.*;
import fp.persona.*;
import fp.vuelo.*;

public class TestVuelo extends Test {
	public static void main(String[] args) {

		Vuelo[] vuelos = creaVuelos();
		mostrar("Ordenacion natural: \n", Arrays.toString(vuelos));
		
		mostrar("\nOrdenacion por Fecha: ");
		Arrays.sort(vuelos, new ComparaVueloPorFecha());
		
		String result = "";
		for (Vuelo v : vuelos) {
			result += "[" + v.getCodigoVuelo() + "," + v.getFechaSalida() + "]";
		}
		
		mostrar("", result);
		
		Pasajero Pasajero001 = new PasajeroImpl("32081485-Q", "Monica",
				"García Romero", 18, 50.0, 1.68, Genero.Mujer, 1, 'A');
		Pasajero Pasajero002 = new PasajeroImpl("32078018-X", "Julio",
				"Conejo Benavides", 19, 74.5, 1.78, Genero.Hombre, 2, 'A');
		Pasajero Pasajero003 = new PasajeroImpl("31469103-W", "Isabel María",
				"Barea Sánchez", 18, 54.7, 1.60, Genero.Mujer, 3, 'A');

		Pasajero Pasajero004 = new PasajeroImpl("32008779-A", "Diana",
				"Sánchez Becerra", 18, 50.5, 1.62, Genero.Mujer, 4, 'B');
		Pasajero Pasajero005 = new PasajeroImpl("31888621-W",
				"Francisco Manuel", "Cortés Garcia", 20, 76.5, 1.81,
				Genero.Hombre, 5, 'B');
		Pasajero Pasajero006 = new PasajeroImpl("32855695-L", "Daniel",
				"Estremar Formento", 19, 63.5, 1.70, Genero.Hombre, 6, 'B');

		Pasajero Pasajero007 = new PasajeroImpl("32744967-C", "Alberto",
				"Romero Holgado", 19, 80.5, 1.87, Genero.Hombre, 7, 'C');
		Pasajero Pasajero008 = new PasajeroImpl("32558192-V", "Mario",
				"Lopez Parra", 19, 70.5, 1.81, Genero.Hombre, 8, 'C');
		Pasajero Pasajero009 = new PasajeroImpl("32991234-K", "Alberto",
				"Doval Ramírez", 19, 68.5, 1.83, Genero.Hombre, 9, 'C');

		Pasajero Pasajero010 = new PasajeroImpl("32596663-P", "Paula",
				"Martínez Báez", 19, 56.5, 1.60, Genero.Mujer, 10, 'D');
		Pasajero Pasajero011 = new PasajeroImpl("32883790-O", "Carlos",
				"Rubio Risquet", 19, 66.5, 1.68, Genero.Hombre, 11, 'D');
		Pasajero Pasajero012 = new PasajeroImpl("32756988-G", "Fernando",
				"Gallego Piñero", 19, 68.5, 1.75, Genero.Hombre, 12, 'D');
		Pasajero Pasajero013 = new PasajeroImpl("32849658-H", "Carlos",
				"Jiménez López", 19, 72.4, 1.72, Genero.Hombre, 13, 'E');
		Pasajero Pasajero014 = new PasajeroImpl("32526981-E", "Iñigo",
				"Espinar Mateos", 19, 76.4, 1.92, Genero.Hombre, 14, 'E');
		Pasajero Pasajero015 = new PasajeroImpl("32569826-S", "Luis",
				"Sullivan Aranega", 19, 74.7, 1.87, Genero.Hombre, 15, 'E');

		Vuelo v1 = new VueloImpl("IB2349", "Madrid", 19.81, 22, new FechaImpl(
				1, 8, 2012), new FechaImpl(1, 7, 2012));

		v1.añadePasajero(Pasajero001);
		v1.añadePasajero(Pasajero002);
		v1.añadePasajero(Pasajero003);
		v1.añadePasajero(Pasajero004);
		v1.añadePasajero(Pasajero005);
		v1.añadePasajero(Pasajero006);
		v1.añadePasajero(Pasajero007);
		v1.añadePasajero(Pasajero008);
		v1.añadePasajero(Pasajero009);
		v1.añadePasajero(Pasajero010);
		v1.añadePasajero(Pasajero011);
		v1.añadePasajero(Pasajero012);
		mostrar("\n", v1);
		mostrar(v1.getPasajeros());

		Vuelo v2 = new VueloImpl("IB2133", "Jerez-las Viñas", 100.2, 104,
				new FechaImpl(25, 10, 2011), new FechaImpl(20, 10, 2010));
		v2.añadePasajero(Pasajero001);
		v2.añadePasajero(Pasajero002);
		v2.añadePasajero(Pasajero003);
		v2.añadePasajero(Pasajero004);
		v2.añadePasajero(Pasajero005);
		v2.añadePasajero(Pasajero006);
		v2.añadePasajero(Pasajero007);
		v2.añadePasajero(Pasajero008);
		v2.añadePasajero(Pasajero009);
		v2.añadePasajero(Pasajero010);
		v2.añadePasajero(Pasajero011);
		v2.añadePasajero(Pasajero012);
		v2.añadePasajero(Pasajero013);
		v2.añadePasajero(Pasajero014);
		v2.añadePasajero(Pasajero015);
		mostrar("\n", v2);
		mostrar(v2.getPasajeros());
	}

	private static Vuelo[] creaVuelos() {
		Vuelo[] vuelos = {
				new VueloImpl("IB-84658", "Praga", 200.0, 150, new FechaImpl(1,
						8, 2012), new FechaImpl(1, 7, 2012)),
				new VueloImpl("IB-84658", "Praga", 200.0, 150, new FechaImpl(4,
						6, 2012), new FechaImpl(29, 3, 2012)),
				new VueloImpl("IB-84658", "Praga", 200.0, 150, new FechaImpl(
						17, 8, 2012), new FechaImpl(1, 7, 2012)) };
		return vuelos;
	}
}
