package fp.punto3D;




public class Punto3DImpl implements Punto3D{
	private Double x, y, z,distancia;
	
	public Punto3DImpl(Double x, Double y, Double z){
		if(x==null||y==null||z==null){
			throw new CoordenadaNoValidaException("la coordenada no puede ser null");
		}
		this.x=x;
		this.y=y;
		this.z=z;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		if(x==null){
			throw new CoordenadaNoValidaException("la coordenada no puede ser null");
		}
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		if(y==null){
			throw new CoordenadaNoValidaException("la coordenada no puede ser null");
		}
		this.y = y;
	}

	public Double getZ() {
		return z;
	}

	public void setZ(Double z) {
		if(z==null){
			throw new CoordenadaNoValidaException("la coordenada no puede ser null");
		}
		this.z = z;
	}
	public Double getDistancia(){
		return distancia;
	}
	public static Double getDistancia(Punto3D p, Punto3D q){
		Double result=Math.sqrt(Math.pow(p.getX()-q.getX(), 2)
				+Math.pow(p.getY()-q.getY(), 2)+Math.pow(p.getZ()-q.getZ(), 2));
		return result;
	}
	public Punto3D clone(){
		Punto3D result=null;
		try{
			result=(Punto3D)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return result;
	}
	public int hashCode(){
		return this.getX().hashCode()+this.getY().hashCode()+this.getZ().hashCode()*31;
	}
	public boolean equals(Object o){
		boolean result=false;
		if(o instanceof Punto3D){
			boolean aux1=this.getX().equals(((Punto3D) o).getX());
			boolean aux2=this.getY().equals(((Punto3D) o).getY());
			boolean aux3=this.getZ().equals(((Punto3D) o).getZ());
			result=aux1&&aux2&&aux3;
		}
		return result;
	}
	public String toString(){
		return "("+getX()+","+getY()+","+getZ()+")";
	}
}
