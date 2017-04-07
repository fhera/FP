package fp.cancion;

public class CancionImplMenorAño extends CancionImpl implements Cancion {

	private static Cancion menorAño;

	public CancionImplMenorAño() {
		super();
		actualiza();
	}

	public CancionImplMenorAño(String nombre, String interprete,
			Integer duracion, Integer año, Integer numeroReproducciones,
			Genero genero, Double calificacion, Boolean reproducir) {

		super(nombre, interprete, duracion, año, numeroReproducciones, genero,
				calificacion, reproducir);
		actualiza();
	}

	public CancionImplMenorAño(String cad) {
		super(cad);
		actualiza();
	}

	private void actualiza() {

		if (menorAño == null) {
			menorAño = this;
		} else {
			if (menorAño.getAño().compareTo(this.getAño()) > 0)
				menorAño = this;
		}
	}

	public static Cancion elMenor() {
		return menorAño;
	}

}
