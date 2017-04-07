package fp.persona;

public class PasajeroImpl extends PersonaImpl implements Pasajero{
	
	private Integer numeroAsiento;
	private Character letraAsiento;
	
	public PasajeroImpl(String DNI,  String nombre,  String apellidos,  Integer edad,
			Double peso,  Double estatura,  Genero sexo, Integer numeroAsiento,
			Character letraAsiento){
		super(DNI,nombre,apellidos,edad,peso,estatura,sexo);
		this.letraAsiento=letraAsiento;
		this.numeroAsiento=numeroAsiento;
	}

	public Integer getNumeroAsiento() {
		return numeroAsiento;
	}

	public Character getLetraAsiento() {
		return letraAsiento;
	}

	public String toString(){
		return super.toString()+" - "+getNumeroAsiento()+", "+getLetraAsiento();
	}
}
