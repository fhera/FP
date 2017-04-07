package fp.pelicula;

public class PeliculaImplPresupuestosAcumulado extends PeliculaImpl implements
		Pelicula {

	private static Double presupuestosAcumulados = 0.0;

	public PeliculaImplPresupuestosAcumulado() {
		super();
	}

	public PeliculaImplPresupuestosAcumulado(String nombre,
			String nacionalidad, Genero genero, Double presupuesto, Integer año) {

		super(nombre, nacionalidad, genero, presupuesto, año);

		presupuestosAcumulados = presupuestosAcumulados + presupuesto;
	}

	public PeliculaImplPresupuestosAcumulado(String s) {
		super(s);
		presupuestosAcumulados = presupuestosAcumulados
				+ super.getPresupuesto();
	}

	// Se hace referencia a un cambio del presupuesto, pues tenemos que ponerlo
	// aqui tambien
	public void setPresupuesto(Double x) {
		presupuestosAcumulados -= getPresupuesto();
		presupuestosAcumulados += x;
		super.setPresupuesto(x);
	}

	public static Double getPresupuestosAcumulados() {
		return presupuestosAcumulados;
	}

}
