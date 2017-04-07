package fp.utiles;

import fp.fecha.Fecha;

public class Fechas {
	
	public static Boolean esBisiesto(Integer n) {
		Boolean result = false;
		if (n % 4 == 0 && n % 100 != 0) {
			result = true;
		}
		return result;
	}

	public static Integer numeroDiasDelMes(Fecha f) {
		Integer result = 0;
		
		switch (f.getMes()) {
		case 1:
			result = 31;
			break;
		case 2:
			if (Fechas.esBisiesto(f.getAño()))
				result = 29;
			else
				result = 28;
			break;
		case 3:
			result = 31;
			break;
		case 4:
			result = 30;
			break;
		case 5:
			result = 31;
			break;
		case 6:
			result = 30;
			break;
		case 7:
			result = 31;
			break;
		case 8:
			result = 31;
			break;
		case 9:
			result = 30;
			break;
		case 10:
			result = 31;
			break;
		case 11:
			result = 30;
			break;
		case 12:
			result = 31;
			break;

		}
		return result;
	}
}
