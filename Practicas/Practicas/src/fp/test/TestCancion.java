package fp.test;

import fp.cancion.*;

public class TestCancion extends Test {
	public static void main(String[]args){
		
		Cancion c1=new CancionImpl("what goes around...comes around", "Justin Timberlake",
				448,2007,10,Genero.POP,3.0,true);
		mostrar("",c1);
		
		Cancion c2=new CancionImpl("what goes around...comes around", "Justin Timberlake",
				448,2007,10,Genero.POP,3.0,true);
		mostrar("",c2);
		
		Cancion c3=new CancionImpl("what goes around...comes around", "Justin Timberlake",
				448,2007,10,Genero.POP,3.0,true);
		mostrar("",c3);

		Cancion c4=new CancionImpl("what goes around...comes around", "Justin Timberlake",
				448,2007,10,Genero.POP,3.0,true);
		mostrar("",c4);
		//Esta última es con constructor con cadena
		Cancion c5=new CancionImpl("Regret, New Order");
		mostrar(c5);
		
		Cancion c6=new CancionImpl("Somebody to love you, Whitney Houston");
		mostrar(c6);
		
		mostrar(CancionImplAlMenosInterprete.alMenosUno());
	}
}
