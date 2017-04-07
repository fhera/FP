package fp.persona;

public class PersonaImpl implements Persona {
	private String DNI, nombre, apellidos;
	private Integer edad;
	private Double peso, estatura;
	private Genero sexo;

	public PersonaImpl(String DNI, String nombre, String apellidos,
			Integer edad, Double peso, Double estatura, Genero sexo) {
		if (peso < 0.0 || estatura < 0.0 || edad < 0)
			throw new IllegalArgumentException("ERROR AL INTRODUCIR LOS DATOS");
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
		this.sexo = sexo;

	}

	public PersonaImpl(String DNI, String nombre, String apellidos,
			Integer edad, Double estatura, Genero sexo) {
		if (peso < 0.0 || estatura < 0.0 || edad < 0)
			throw new IllegalArgumentException("ERROR AL INTRODUCIR LOS DATOS");
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.estatura = estatura;
		this.sexo = sexo;

	}

	public PersonaImpl(String nombre, String apellidos, String DNI, Genero sexo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
	}

	public String getDNI() {
		return DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Genero getSexo() {
		return sexo;
	}

	public Double getIMC() {
		return peso / Math.pow(estatura, 2);
	}

	public Persona clone() {
		Persona result = null;
		try {
			result = (Persona) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int hashCode() {
		return this.getDNI().hashCode() + this.getNombre().hashCode()
				+ this.getApellidos().hashCode() * 31;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Persona) {
			boolean aux1 = this.getDNI().equals(((Persona) o).getDNI());
			boolean aux2 = this.getNombre().equals(((Persona) o).getNombre());
			boolean aux3 = this.getApellidos().equals(
					((Persona) o).getApellidos());
			result = aux1 && aux2 && aux3;
		}
		return result;
	}

	public int compareTo(Persona p) {
		int result;
		result = this.getApellidos().compareTo(p.getApellidos());
		if (result == 0) {
			result = this.getNombre().compareTo(p.getNombre());
			if (result == 0) {
				result = this.getDNI().compareTo(p.getDNI());
			}
		}
		return result;
	}

	public String toString() {
		return getApellidos() + ", " + getNombre() + " (" + getDNI() + ")";
	}

}
