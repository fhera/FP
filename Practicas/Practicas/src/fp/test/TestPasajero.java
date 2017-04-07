package fp.test;
import fp.persona.*;
public class TestPasajero extends Test{
	public static void main (String[]args){
		Pasajero Pasajero001=new PasajeroImpl("31819166-W","Luis Alfredo","Rodiezales Garbo",40,70.5,
				1.78,Genero.Hombre,20,'N');
		mostrar("El Pasajero 001 es :"+"\n",Pasajero001);
	}
}
