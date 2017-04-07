package fp.test;

import fp.iterables.*;

public class TestIterables extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		SecuenciaPrimos p=new SecuenciaPrimos(10);
		for(Integer d:p){
		mostrar(d); 
		}*/
	
	
		Fibonaci f= new Fibonaci(10);
	
		for(Integer n: f) {
			mostrar(n);
		}
	}
}
