package fp.test;
import fp.persona.*;
public class TestArbitroFutbol extends Test{
public static void main(String[]args){
	ArbitroFutbol Mejuto=new ArbitroFutbolImpl("30992400-P","Jos�","Mejuto Gonz�lez",40,
			70.5,1.78,Genero.Hombre,PosicionArbitro.PRINCIPAL);
	mostrar("El arbitro Mejuto: ",Mejuto);
}
}
