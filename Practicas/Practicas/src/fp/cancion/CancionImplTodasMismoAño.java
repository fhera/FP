package fp.cancion;

public class CancionImplTodasMismoAño extends CancionImpl implements Cancion {

	private static Boolean igual = false;

	public CancionImplTodasMismoAño() {
		super();
		igual = igual || this.getAño().equals(2005);
	}

	public CancionImplTodasMismoAño(String nombre, String interprete,
			Integer duracion, Integer año, Integer numeroReproducciones,
			Genero genero, Double calificacion, Boolean reproducir) {

		super(nombre, interprete, duracion, año, numeroReproducciones, genero,
				calificacion, reproducir);
		igual = igual || this.getAño().equals(2005);

	}

	public CancionImplTodasMismoAño(String cad) {
		super(cad);
		igual = igual || this.getAño().equals(2005);
	}

	public static Boolean todosMismoAño() {
		return igual;
	}

}
