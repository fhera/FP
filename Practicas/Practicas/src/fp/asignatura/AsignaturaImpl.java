package fp.asignatura;


public class AsignaturaImpl implements Asignatura{
	private CodigoAsignatura codigo;
	private Double nota, numeroCreditos;
	
	public AsignaturaImpl(CodigoAsignatura codigo, Double numeroCreditos){
		this.numeroCreditos=numeroCreditos;
		this.codigo=codigo;
	}

	
	public Double getNota() {
		return nota;
	}


	public void setNota(Double nota) {
		this.nota = nota;
	}


	public CodigoAsignatura getCodigo() {
		return codigo;
	}


	public Double getNumeroCreditos() {
		return numeroCreditos;
	}

	public boolean equals(Object o){
		boolean result=false;
		if(o instanceof Asignatura){
			boolean a=this.getCodigo().equals(((Asignatura) o).getCodigo());
			boolean b=this.getNumeroCreditos().equals(((Asignatura) o).getNumeroCreditos());
			result=a&&b;
		}
		return result;
	}
	public Asignatura clone(){
		Asignatura result=null;
		try{
			result=(Asignatura)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return result;
	}
	public String toString() {
		return getCodigo()+"("+getNumeroCreditos()+")";
	}
}
