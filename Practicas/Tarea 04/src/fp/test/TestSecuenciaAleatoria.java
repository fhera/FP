package fp.test;

import fp.iterables.*;

public class TestSecuenciaAleatoria extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SecuenciaAleatoria sa= new SecuenciaAleatoria(1,9,6);
		for( Integer n:sa){
			mostrar (n);
		}
	}

}
