package fp.test;

import java.util.ArrayList;
import java.util.List;
import fp.fecha.FechaImpl;
import fp.foto.*;
import fp.persona.*;

public class TestFotografo extends Test{
	public static void main(String[]args){	
		
		List<Foto>listaFotos=new ArrayList<Foto>();
		
		Fotografo fotografo= new FotografoImpl("31819166-W","Luis Alfredo","Rodiezales Garbo",40,70.5,
				1.78,Genero.Hombre,7568, listaFotos);
		
		Foto f1= new FotoImpl("yo en el campo",fotografo,new FechaImpl(11,2,2004),
				FormatoImagen.JPG,18,18,10,250.3,5.3,false);
		mostrar("yo en el campo",f1);
		
		Foto f2= new FotoImpl("yo en la playa",fotografo,new FechaImpl(25,7,2008),
				FormatoImagen.JPG,18,18,10,250.3,5.3,false);
		mostrar("yo en el campo",f2);
		
		Foto f3= new FotoImpl("yo en el centro",fotografo,new FechaImpl(5,12,2006),
				FormatoImagen.JPG,18,18,10,250.3,5.3,false);
		mostrar("yo en el campo",f3);
		
		listaFotos.add(f1);listaFotos.add(f2);listaFotos.add(f3);
		mostrar("fotografo: ",fotografo);
	}
}
