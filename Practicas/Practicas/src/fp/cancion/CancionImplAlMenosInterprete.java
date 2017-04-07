package fp.cancion;

public class CancionImplAlMenosInterprete extends CancionImpl implements
		Cancion {

	private static Boolean existe = false;

	public CancionImplAlMenosInterprete() {
		super();
		existe = existe || this.getInterprete().equals("Whitney Houston");

	}

	public CancionImplAlMenosInterprete(String nombre, String interprete,
			Integer duracion, Integer año, Integer numeroReproducciones,
			Genero genero, Double calificacion, Boolean reproducir) {

		super(nombre, interprete, duracion, año, numeroReproducciones, genero,
				calificacion, reproducir);

		existe = existe || this.getInterprete().equals("Whitney Houston");

	}

	public CancionImplAlMenosInterprete(String cad) {
		super(cad);
		existe = existe || this.getInterprete().equals("Whitney Houston");

	}

	public static Boolean alMenosUno() {
		return existe;
	}

}
