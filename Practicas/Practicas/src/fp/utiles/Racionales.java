package fp.utiles;

import fp.racional.*;

public class Racionales {

	public static Racional sumar(Racional r1, Racional r2) {
		Integer d = r1.getDenominador() * r2.getDenominador();
		Integer n = r1.getNumerador() * r2.getDenominador() + r2.getNumerador()
				* r1.getDenominador();
		return new RacionalImpl(n, d);
	}

	public static Racional restar(Racional r1, Racional r2) {
		Integer n = r1.getNumerador() * r2.getDenominador() - r2.getNumerador()
				* r1.getDenominador();
		Integer d = r1.getDenominador() * r2.getDenominador();
		return new RacionalImpl(n, d);
	}

	public Racional generaRacional() {
		Double n = 1 + Math.random() * 999;
		Double d = 1 + Math.random() * 999;
		return new RacionalImpl(n.intValue(), d.intValue());
	}

	public Racional[] generaRacionales(int n) {
		Racional[] v = new Racional[n];
		for (int i = 0; i < n; i++) {
			v[i] = generaRacional();
		}
		return v;
	}
}
