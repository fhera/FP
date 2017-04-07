package fp.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fp.utiles.Enteros;

public class TestEnteros extends Test{
	public static void main(String[]args){
		List<Integer>veinteEnteros=new ArrayList<Integer>();
		for(int i=1;i<=20;i++){
			veinteEnteros.add(i);
		}
		/*mostrar("los primeros 20 enteros son: ",veinteEnteros);
		Double mediaArmonica=Enteros.mediaArmonica(veinteEnteros);
		mostrar("la media armonica de los 20 primeros enteros es: ",mediaArmonica);
		
		Double mediaGeometrica=Enteros.mediaGeometrica(veinteEnteros);
		mostrar("la media geometrica de los 20 primeros enteros es: ",mediaGeometrica);
		
		*/
		List<Integer>treintaEnteros=Enteros.creaListaEnteros(30);
		mostrar("30 enteros: ",treintaEnteros);
		
		mostrar("orden aleatorio 30 canciones: ",Enteros.ordenAleatoriaLista(30));
		
		Integer[]v1={1,2,3,4,5};
		mostrar("el array v1 es: ",Arrays.toString(v1));
		
		Integer[]v1alReves=Enteros.arrayInverso(v1);
		mostrar("el array v1 al reves es: ",Arrays.toString(v1alReves));
	 
		
		/*List<Double>numeros1= new ArrayList<Double>();
		numeros1.add(1.0);
		numeros1.add(2.0);
		numeros1.add(3.0);
		numeros1.add(4.0);
		Double media=Enteros.media(numeros1);
		mostrar("la media de 1,2,3,4 es: ",media);*/
		
		List<Double>numeros2= new ArrayList<Double>();
		numeros2.add(1.0);
		numeros2.add(2.0);
		numeros2.add(3.0);
		numeros2.add(4.0);
		List<Double> listaInversa=Enteros.listaInversa(numeros2);
		mostrar("la lista inversa es: ",listaInversa);
		
		Integer n=Enteros.numeroDivisores(10);
		mostrar("10 tiene ",n+" divisores");
		
		Integer n2=Enteros.numeroDivisores(724023);
		mostrar("724023 tiene ",n2+" divisores");
		
		Integer sumaDivisores1=Enteros.sumaDivisores(10);
		mostrar("los divisores de 10 suman: ",sumaDivisores1);
		
		Integer sumaDivisores2=Enteros.sumaDivisores(100);
		mostrar("los divisores de 100 suman: ",sumaDivisores2);
		
		Integer sumaPrimosMenores20=Enteros.sumaPrimosMenores(20);
		mostrar("la suma de los divisores menores que 20 es: ",sumaPrimosMenores20);
		
		Integer p= Enteros.permutacionesConRepeticion(4,5);
		mostrar("permutaciones", p);
		
		Boolean primo=Enteros.esPrimo(70);
		mostrar ("pimo",primo);
		
		Integer fact=Enteros.factorial(10);
		mostrar("10!=",fact);
		
		Integer max=Enteros.maximo(7, 15, 14);
		mostrar("el maximo entre 7,15 y 14:",max);
		
		Integer smult= Enteros.sumMultiplos(4, 3, 5);
		mostrar("la suma de los multiplos",smult);
		
		Integer psr=Enteros.permutacionesSinRepeticion(10, 2);
		mostrar("permutaciones sin repeticion entre 10 y 2:",psr);
		
		Integer pcr=Enteros.permutacionesConRepeticion(10, 2);
		mostrar("permutaciones con repeticion entre 10 y 2:",pcr);
		
		Integer csr=Enteros.combinacionesSinRepeticion(10, 2);
		mostrar("combinaciones sin repeticion entre:",csr);
		
		Integer ccr=Enteros.combinacionesConRepeticion(10, 2);
		mostrar("combinaciones con repeticion entre 10 y 2:",ccr);
		
		Boolean primo0=Enteros.esPrimo(20);
		mostrar ("�20 es primo?:",primo0);
		
		Boolean primo1=Enteros.esPrimo(3);
		mostrar ("�3 es primo?:",primo1);
		
		Boolean primo2=Enteros.esPrimo(11);
		mostrar ("�11 es primo?:",primo2);
		
		Boolean primo3=Enteros.esPrimo(999990);
		mostrar ("�999990 es primo?:",primo3);
		
		Boolean primo4=Enteros.esPrimo(591);
		mostrar ("�591 es primo?:",primo4);
		
		Boolean primo5=Enteros.esPrimo(330);
		mostrar ("�330 es primo?:",primo5);
		
		Boolean primo6=Enteros.esPrimo(5);
		mostrar ("�5 es primo?:",primo6);
		
		Boolean primo7=Enteros.esPrimo(3567);
		mostrar ("�3567 es primo?:",primo7);
		
		Boolean primo8=Enteros.esPrimo(672395761);
		mostrar ("�672395761 es primo?:",primo8);
		
		Boolean primo9=Enteros.esPrimo(645640);
		mostrar ("�645640 es primo?:",primo9);
		
		List<Integer>primosMenoresQue20=Enteros.primosMenores(20);
		mostrar("los primos menores que 20 son:",primosMenoresQue20);
		
		List<Integer>primosMenoresQue100=Enteros.primosMenores(100);
		mostrar("los primos menores que 100 son:",primosMenoresQue100);
		
		List<Integer>primosMenoresQue1000=Enteros.primosMenores(1000);
		mostrar("los primos menores que 1000 son:",primosMenoresQue1000);
		
		
	}

}
