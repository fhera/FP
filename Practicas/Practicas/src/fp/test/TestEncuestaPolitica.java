package fp.test;

import java.util.ArrayList;
import java.util.List;

import fp.encuesta.*;

public class TestEncuestaPolitica extends Test{
	public static void main(String[]args){
		EncuestaPolitica encuestaPolitica1=new EncuestaPoliticaImpl("2052-E",20,5,1200.0,Genero.HOMBRE,
				true,PartidoPolitico.IU);
		mostrar("encuesta1: ",encuestaPolitica1);
		
		EncuestaPolitica encuestaPolitica2=new EncuestaPoliticaImpl("2052-E",40,2,1200.0,Genero.HOMBRE,
				false,PartidoPolitico.PSOE);
		mostrar("encuesta2: ",encuestaPolitica2);
		
		EncuestaPolitica encuestaPolitica3=new EncuestaPoliticaImpl("2054-E",58,10,1200.0,Genero.HOMBRE,
				false,PartidoPolitico.PP);
		mostrar("encuesta3: ",encuestaPolitica3);
		
		EncuestaPolitica encuestaPolitica4=new EncuestaPoliticaImpl("2055-E",18,11,1200.0,Genero.HOMBRE,
				true,PartidoPolitico.IU);
		mostrar("encuesta4: ",encuestaPolitica4);
		
		EncuestaPolitica encuestaPolitica5=new EncuestaPoliticaImpl("2056-E",18,10,1200.0,Genero.HOMBRE,
				true,PartidoPolitico.UPYD);
		mostrar("encuesta5: ",encuestaPolitica5);
		
		mostrar("relvancia de la encuesta 5: ",encuestaPolitica5.getRelevancia());
		
		Boolean Igualdad1=encuestaPolitica1.equals(encuestaPolitica2);
		Boolean Igualdad2=encuestaPolitica1.equals(encuestaPolitica3);
		
		mostrar("�La encuesta 1 es igual que la 2? = ",Igualdad1);
		mostrar("�La encuesta 1 es igual que la 3? = ",Igualdad2);
		
		List<Encuesta>listaEncPolitica=new ArrayList<Encuesta>();
			listaEncPolitica.add(encuestaPolitica1);
			listaEncPolitica.add(encuestaPolitica2);
			listaEncPolitica.add(encuestaPolitica3);
			listaEncPolitica.add(encuestaPolitica4);
			listaEncPolitica.add(encuestaPolitica5);
			mostrar("lista de encuestas :",listaEncPolitica);
	}
}
