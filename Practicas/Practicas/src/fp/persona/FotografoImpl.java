package fp.persona;

import java.util.List;

import fp.foto.Foto;

public class FotografoImpl extends PersonaImpl implements Fotografo {
	private Integer numeroDeColegiado;
	private List<Foto> fotos;

	public FotografoImpl(String DNI, String nombre, String apellidos,
			Integer edad, Double peso, Double estatura, Genero sexo,
			Integer numeroDeColegiado, List<Foto> fotos) {
		super(DNI, nombre, apellidos, edad, peso, estatura, sexo);
		this.numeroDeColegiado = numeroDeColegiado;
		this.fotos = fotos;
	}

	public Integer getNumeroDeColegiado() {
		return numeroDeColegiado;
	}

	public List<Foto> getFotos() {
		return fotos;
	}

	public void añadirFoto(Foto f){
		if(f.getAutor().equals(this)){
			fotos.add(f);
		}else{
			throw new AutorDistintoException("El autor de la foto es distinto a: "+this);
		}
	}
	public Fotografo clone(){
		Fotografo result=null;
		result=(Fotografo)super.clone();
		return result;
	}
	public int hashCode(){
		return this.getNumeroDeColegiado().hashCode()*31;
	}
	public boolean equals(Object o){
		boolean result=false;
		if(o instanceof Fotografo){
			boolean aux1=this.getDNI().equals(((Fotografo) o).getDNI());
			boolean aux2=this.getNombre().equals(((Fotografo) o).getNombre());
			boolean aux3=this.getApellidos().equals(((Fotografo) o).getApellidos());
			boolean aux4=this.getNumeroDeColegiado().equals(((Fotografo)o).getNumeroDeColegiado());
			result=aux1&&aux2&&aux3&&aux4;
		}
		return result;
	}
	public String toString(){
		return super.toString()+" / n� de colegiado: "+getNumeroDeColegiado()+" / n� de fotos: "+
		getFotos().size();
	}
}
