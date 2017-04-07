package fp.test;
import fp.fecha.*;
import fp.foto.*;
import fp.persona.*;
public class TestFoto extends Test{
	public static void main(String[]args){
		Foto f1= new FotoImpl("yo en el campo",
				new PersonaImpl("31819166-W","Luis Alfredo","Rodiezales Garbo",40,70.5,1.78,
				Genero.Hombre),new FechaImpl(11,2,2004),FormatoImagen.JPG,18,18,10,250.3,5.3,false);
		mostrar("",f1);
		
		Foto f2=new FotoImpl("el paco y yo",
				new PersonaImpl("32458792-Q","el Opaco","Paco", 12,50.0,1.62, Genero.Hombre),
				new FechaImpl(8,8,2008),FormatoImagen.BMP,10,10,20,74.6,10.0,true);
		mostrar("",f2);
		
		Foto f3=new FotoImpl("el paco y yo",
				new PersonaImpl("32458792-Q","el Opaco","Paco", 12,50.0,1.62, Genero.Hombre),
				new FechaImpl(8,8,2008),FormatoImagen.BMP,10,10,20,74.6,10.0,true);
		mostrar("",f3);
	}
}
