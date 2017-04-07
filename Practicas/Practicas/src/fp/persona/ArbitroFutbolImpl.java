package fp.persona;

public class ArbitroFutbolImpl extends PersonaImpl implements ArbitroFutbol{
	private PosicionArbitro posicionArbitroCampo;
	
	public ArbitroFutbolImpl(String DNI, String nombre, String apellidos, Integer edad,Double peso,
			Double estatura, Genero sexo,PosicionArbitro posicionArbitroCampo){
		super(DNI, nombre, apellidos, edad,peso,estatura,sexo);
		this.posicionArbitroCampo=posicionArbitroCampo;
	}
	public PosicionArbitro getPosicionArbitroCampo(){
		return posicionArbitroCampo;
	}
	public void setPosicionArbitroCampo(PosicionArbitro nuevaPosicionArbitroCampo){
		nuevaPosicionArbitroCampo=posicionArbitroCampo;
	}
	public String toString(){
		return super.toString()+": "+getPosicionArbitroCampo();
	}
}
