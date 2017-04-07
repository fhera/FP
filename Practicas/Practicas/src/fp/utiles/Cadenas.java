package fp.utiles;


public class Cadenas {

	public static Integer cuentaVocales(String cadena){
		Integer result=0;
		String vocales="aeiou";
		cadena=cadena.toLowerCase();
		for(int i=0;i<cadena.length();i++){
			if(vocales.contains(cadena.substring(i, i+1)))
				result++;
		}
		return result;
	}
	
	public static String invierteCadena(String cad){
		String result = new String("");

		for (int i = 0; i < cad.length(); i++) {
			result += cad.charAt(cad.length() - i - 1);
		}
		return result;
	}
	
	public static Integer cuentaApariciones(String cad, char c){
		Integer result = 0;
		cad= cad.toLowerCase();
		
		for(int i=0; i<cad.length(); i++){
			if(cad.charAt(i)==c)
				result++;
		}
		return result;
	}
	
}
