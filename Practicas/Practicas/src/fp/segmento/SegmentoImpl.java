package fp.segmento;

import fp.punto3D.*;
public class SegmentoImpl implements Segmento{
	Punto3D extremoA, extremoB;
	Double longitud;
	
	public SegmentoImpl(Punto3D extremoA,Punto3D extremoB){
		if(extremoA==null||extremoB==null){
			throw new ExtremoNoValidoException("El extremo no puede ser null");
		}
		this.extremoA=extremoA;
		this.extremoB=extremoB;
		
	}
	public Punto3D getExtremoA(){
		return extremoA;
	}
	public void setExtremoA(Punto3D nuevoExtremoA){
		if(nuevoExtremoA==null){
			throw new ExtremoNoValidoException("El extremo no puede ser null");
		}
		extremoA=nuevoExtremoA;
	}
	public Punto3D getExtremoB(){
		return extremoB;
	}
	public void setExtremoB(Punto3D nuevoExtremoB){
		if(nuevoExtremoB==null){
			throw new ExtremoNoValidoException("El extremo no puede ser null");
		}
		extremoB=nuevoExtremoB;
	}
	public Double getLongitud(){
		/*longitud=Math.sqrt(Math.pow(extremoA.getX()-extremoB.getX(), 2)
				+Math.pow(extremoA.getY()-extremoB.getY(), 2)
				+Math.pow(extremoA.getZ()-extremoB.getZ(), 2));*/
		longitud=Punto3DImpl.getDistancia(extremoA, extremoB);
		return longitud;
	}
	public Segmento clone(){
		Segmento result=null;
		try{
			result=(Segmento)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return result;
	}
	public int hashCode(){
		return this.getExtremoA().hashCode()+this.getExtremoB().hashCode()*31;
	}
	public boolean equals(Object o){
		boolean result=false;
		if(o instanceof Segmento){
			boolean a=this.getExtremoA().equals(((Segmento) o).getExtremoA());
			boolean b=this.getExtremoB().equals(((Segmento) o).getExtremoB());
			result=a&&b;
		}
		return result;
	}
	public String toString(){
		return "["+getExtremoA()+","+getExtremoB()+"]";
	}
	
}
