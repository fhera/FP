package fp.test;

import java.util.Arrays;

import fp.racional.Racional;
import fp.racional.RacionalImpl;


public class TestRacionales extends Test{
	public static void main(String[]args){
		Racional[]racional=new Racional[10];
		racional=generaRacionales(10);
		mostrar("diez racionales aleatorios: ",Arrays.toString(racional));
		Racional r1=new RacionalImpl(930,577);
		Racional r2=new RacionalImpl(796,30);
		r1.sumar(r2);
		mostrar("r1+r2=",r1);
}
	public static Racional generaRacional(){
		Double n=1+Math.random()*999;
		Double d=1+Math.random()*999;
		return new RacionalImpl(n.intValue(),d.intValue());
	}
	public static Racional[]generaRacionales(int n){
		Racional[]v=new Racional[n];
		for(int i=0;i<n;i++){
			v[i]=generaRacional();
		}
		return v;
	}
}
