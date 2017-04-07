package fp.persona;

import java.util.ArrayList;
import java.util.List;

public class EquipoImpl implements Equipo {
	
	private String nombre;
	private List<Persona> componentes = new ArrayList<Persona>();

	public EquipoImpl(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}

	public List<Persona> getComponentes() {
		return componentes;
	}

	public void setComponentes(List<Persona> nuevoComponentes) {
		componentes = nuevoComponentes;
	}

	public void añadeComponente(Persona p) {
		componentes.add(p);
	}

	public Equipo clone() {
		Equipo result = null;
		try {
			result = (Equipo) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int hashCode() {
		return this.getNombre().hashCode() + this.getComponentes().hashCode()
				* 31;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Equipo) {
			boolean aux1 = this.getNombre().equals(((Equipo) o).getNombre());
			boolean aux2 = this.getComponentes().equals(
					((Equipo) o).getComponentes());
			result = aux1 && aux2;
		}
		return result;
	}

	public String toString() {
		return getNombre() + ": " + getComponentes();
	}
}
