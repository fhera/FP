package fp.persona;

public interface JugadorFutbol extends Persona{
	String getApodo();
	void setApodo(String nuevoApodo);
	Integer getDorsal();
	void setDorsal(Integer nuevoDorsal);
	PosicionCampo getPosicionJuego();
	void setPosicionJuego(PosicionCampo nuevaPosicionJuego);
	
}
