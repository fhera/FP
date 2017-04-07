package fp.test;
import fp.punto3D.*;
public class TestPunto3D extends Test{
public static void main(String[]args){
	Punto3D p1=new Punto3DImpl(0.0,0.0,0.0);
	mostrar("Punto p1:",p1);
	
	Punto3D p2=new Punto3DImpl(7.8,4.1,0.9);
	mostrar("Punto p2:",p2);
	
	Punto3D p3=new Punto3DImpl(2.0,1.1,1.1);
	mostrar("Punto p3:",p3);
	
	Double distancia1=Punto3DImpl.getDistancia(p1, p2);
	mostrar("Distancia entre p1 y p2:",distancia1);
	
	Double distancia2=Punto3DImpl.getDistancia(p1, p3);
	mostrar("Distancia entre p1 y p3:",distancia2);
	
	Double distancia3=Punto3DImpl.getDistancia(p3, p2);
	mostrar("Distancia entre p3 y p2:",distancia3);
}
}
