package fp.utiles;
import java.util.ArrayList;
import java.util.List;

import fp.persona.*;


public class Alumnos {
	public static Double mediaEdadSexo(List<Alumno>lista,Genero s){
		List<Integer>l=new ArrayList<Integer>();
		for(Alumno a:lista){
			if(a.getSexo().equals(s)){
				l.add(a.getEdad());
			}
		}
		return Enteros.media(l);
	}
	public static Double mediaNotaSexo(List<Alumno>lista,Genero s){
		List<Double>l=new ArrayList<Double>();
		for(Alumno a:lista){
			if(a.getSexo().equals(s)){
				l.add(a.getNotaMedia());
			}
		}
		return Reales.mediaAritmetica(l);
	}
	
}
