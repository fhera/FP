package fp.test;
import fp.persona.*;

public class TestEquipo extends Test{
	public static void main(String[]args){
		
		JugadorFutbol Gomes=new JugadorFutbolImpl("20548102-H","Heurelho","da Silva Gomes",30,91.1,
				1.91,Genero.Hombre,"Gomes",1 ,PosicionCampo.PORTERO);
		mostrar("el jugador Gomes :"+"\n",Gomes);

		JugadorFutbol Corluka=new JugadorFutbolImpl("84625920-X","Vedran","Corluka",25,88.5,
				1.93,Genero.Hombre,"Corluka",22 ,PosicionCampo.LATERAL);
		mostrar("el jugador Corluka :"+"\n",Corluka);

		JugadorFutbol Bale=new JugadorFutbolImpl("85621142-L","Gareth","Bale",22,78.1,
				1.83,Genero.Hombre,"Bale",3 ,PosicionCampo.LATERAL);
		mostrar("el jugador Bale :"+"\n",Bale);

		JugadorFutbol Dawson=new JugadorFutbolImpl("65986578-U","Michael Richard","Dawson",27,86.6,
				1.90,Genero.Hombre,"Dawson",20 ,PosicionCampo.DEFENSA);
		mostrar("el jugador Dawson :"+"\n",Dawson);

		JugadorFutbol King=new JugadorFutbolImpl("71222555-X","Ledley Brenton","King",30,89.4,
				1.88,Genero.Hombre,"King",26 ,PosicionCampo.DEFENSA);
		mostrar("el jugador King :"+"\n",King);

		JugadorFutbol VanDerVaart=new JugadorFutbolImpl("32668569-X","Rafael Ferdinand","van der Vaart",
				28,69.5,1.76,Genero.Hombre,"van der Vaart",11 ,PosicionCampo.PIVOTE);
		mostrar("el jugador van der Vaart :"+"\n",VanDerVaart);

		JugadorFutbol Modric=new JugadorFutbolImpl("37119166-X","Luka","Modric",26,78.1,
				1.73,Genero.Hombre,"Modric",14 ,PosicionCampo.CENTROCAMPISTA);
		mostrar("el jugador Modric :"+"\n",Modric);

		JugadorFutbol Lennon=new JugadorFutbolImpl("67558962-T","Aaron","Lennon",24,63.7,
				1.65,Genero.Hombre,"Lennon",7 ,PosicionCampo.INTERIOR);
		mostrar("el jugador Lennon :"+"\n",Lennon);

		JugadorFutbol DosSantos=new JugadorFutbolImpl("31002659-G","Giovani","dos Santos Ramírez",22,69.5,
				1.75,Genero.Hombre,"Dos Santos",17 ,PosicionCampo.INTERIOR);
		mostrar("el jugador Dos Santos :"+"\n",DosSantos);

		JugadorFutbol IagoFalque=new JugadorFutbolImpl("37119166-X","Iago","Falque Silva",21,68.5,
				1.74,Genero.Hombre,"Iago Falqué",27 ,PosicionCampo.ENGANCHE);
		mostrar("el jugador Iago Falque :"+"\n",IagoFalque);
		
		JugadorFutbol Pavliuchenko=new JugadorFutbolImpl("37119166-X","Román Anatálievich ",
				"Pavliuchenko",29,85.0,1.88,Genero.Hombre,"Pavliuchenko",9 ,PosicionCampo.ARIETE);
		mostrar("el jugador Pavliuchenko:"+"\n",Pavliuchenko);
		
		Equipo Tottenham= new EquipoImpl("Tottenham Hotspur");
		Tottenham.añadeComponente(Gomes);
		Tottenham.añadeComponente(Corluka);
		Tottenham.añadeComponente(Bale);
		Tottenham.añadeComponente(Dawson);
		Tottenham.añadeComponente(King);
		Tottenham.añadeComponente(VanDerVaart);
		Tottenham.añadeComponente(Modric);
		Tottenham.añadeComponente(Lennon);
		Tottenham.añadeComponente(DosSantos);
		Tottenham.añadeComponente(IagoFalque);
		Tottenham.añadeComponente(Pavliuchenko);
		mostrar("El equipo Tottenham está compuesto por : "+"\n",Tottenham);
	}
}
