package fp.persona;

public class JugadorFutbolImpl extends PersonaImpl implements JugadorFutbol{
	private String apodo;
	private Integer dorsal;
	private PosicionCampo posicionJuego;
	
	public JugadorFutbolImpl(String DNI, String nombre, String apellidos, Integer edad,Double peso,
			Double estatura, Genero sexo, String apodo, Integer dorsal,PosicionCampo posicionJuego ){
		super(DNI,nombre, apellidos, edad, peso, estatura, sexo);
		this.apodo=apodo;
		this.dorsal=dorsal;
		this.posicionJuego=posicionJuego;
	}
	public String getApodo(){
		return apodo;
	}
	public void setApodo(String nuevoApodo){
		nuevoApodo=apodo;
	}
	public Integer getDorsal(){
		return dorsal;
	}
	public void setDorsal(Integer nuevoDorsal){
		nuevoDorsal=dorsal;
	}
	public PosicionCampo getPosicionJuego(){
		return posicionJuego;
	}
	public void setPosicionJuego(PosicionCampo nuevaPosicionJuego){
		nuevaPosicionJuego=posicionJuego;
	}
	public String toString(){
		return super.toString()+", "+getDorsal()+", "+getApodo();
	}
	
	
	
}
