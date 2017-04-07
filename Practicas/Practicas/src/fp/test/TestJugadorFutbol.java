package fp.test;

import fp.persona.*;
public class TestJugadorFutbol extends Test{
	public static void main(String[]args){
	JugadorFutbol IagoFalque=new JugadorFutbolImpl("37119166-X","Iago","Falqu� Silva",21,68.5,
				1.74,Genero.Hombre,"Iago Falqu�",23 ,PosicionCampo.ENGANCHE);
		mostrar("el jugador Iago Falque :"+"\n",IagoFalque);

	}
	
}
