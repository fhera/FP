package fp.test;

import java.util.ArrayList;
import java.util.List;

import fp.utiles.Reales;

public class TestReales extends Test{
	public static void main(String[]args){
		
	List<Double>reales1=new ArrayList<Double>();
	reales1.add(5.6);
	reales1.add(9.2);
	reales1.add(4.0);
	reales1.add(50.0);
	
	mostrar("El maximo es: ",Reales.maximo(reales1));
	
	mostrar("El minimo es: ",Reales.minimo(reales1));
	}
}
