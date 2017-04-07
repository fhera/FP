package fp.cancion;

public class CancionImplDuracionAcumulada extends CancionImpl implements
		Cancion {

	private static Double acumulada;

	public CancionImplDuracionAcumulada() {
		super();
		acumulada += this.getDuracion();
	}

	public CancionImplDuracionAcumulada(String nombre, String interprete,
			Integer duracion, Integer año, Integer numeroReproducciones,
			Genero genero, Double calificacion, Boolean reproducir) {

		super(nombre, interprete, duracion, año, numeroReproducciones, genero,
				calificacion, reproducir);

		acumulada += this.getDuracion();
	}
	
	public CancionImplDuracionAcumulada(String cad){
		super(cad);
		acumulada+=this.getDuracion();
	}
	
	public static Double valorDuracionAcumulada(){
		return acumulada;
	}
}
