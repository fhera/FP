package fp.cancion;

public class CancionImplMayorDuracion extends CancionImpl implements Cancion{
	
	private static Cancion mayorDuracion;
	

	public CancionImplMayorDuracion() {
		super();
		actualiza();
	}

	public CancionImplMayorDuracion(String nombre, String interprete,
			Integer duracion, Integer año, Integer numeroReproducciones,
			Genero genero, Double calificacion, Boolean reproducir) {

		super(nombre, interprete, duracion, año, numeroReproducciones, genero,
				calificacion, reproducir);
		actualiza();
	}

	public CancionImplMayorDuracion(String cad) {
		super(cad);
		actualiza();
	}

	private void actualiza() {

		if (mayorDuracion == null) {
			mayorDuracion = this;
		} else {
			if (mayorDuracion.getDuracion().compareTo(this.getDuracion()) > 0)
				mayorDuracion = this;
		}
	}

	public static Cancion elMayor() {
		return mayorDuracion;
	}


}
