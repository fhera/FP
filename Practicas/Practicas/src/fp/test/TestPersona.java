package fp.test;

import java.util.Arrays;

import fp.persona.*;
public class TestPersona extends Test{
	public static void main (String[]args){
		Persona personas[]=creaPersonas();
		Arrays.sort(personas);
		mostrar("\nOrdenaci�n natural","");
		mostrar(Arrays.toString(personas),"");
		Persona p=new PersonaImpl("31819166-W","Luis Alfredo","Rodiezales Garbo",40,70.5,1.78,
				Genero.Hombre);
		mostrar("",p);
	}
	private static Persona[]creaPersonas(){
		Persona[]personas={
				new PersonaImpl("Julio","Conejo","12345678",Genero.Hombre),
				new PersonaImpl("Julio","Conejo","12345678",Genero.Hombre),
				new PersonaImpl("Julio","Conejo","12345678",Genero.Hombre),
				new PersonaImpl("Julio","Conejo","12345678",Genero.Hombre),
				new PersonaImpl("Julio","Conejo","12345678",Genero.Hombre),
				new PersonaImpl("Julio","Conejo","12345678",Genero.Hombre),
				new PersonaImpl("Julio","Conejo","12345678",Genero.Hombre),
				new PersonaImpl("Julio","Conejo","12345678",Genero.Hombre),
				new PersonaImpl("Julio","Conejo","12345678",Genero.Hombre),
				new PersonaImpl("Julio","Conejo","12345678",Genero.Hombre)};
		return personas;
	}
}