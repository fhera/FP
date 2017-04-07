package fp.test;

import java.util.Arrays;

import fp.punto.*;
public class TestPunto extends Test{
	private static final int MAX=20;
public static void main(String[]args){
	Punto[]puntos=crearPuntos();
	Arrays.sort(puntos);
	mostrar("\nOrden natural","");
	mostrar("",Arrays.toString(puntos));
	
	Punto p1= new PuntoImpl(1.0,1.0);
	mostrar("Punto p1:",p1);
	
	Punto p2= new PuntoImpl(7.2,1.2);
	mostrar("Punto p2:",p2);
	
	Punto p3=new PuntoImpl(0.0,0.0);
	mostrar("Punto p3;",p3);
	
	Double dist0=PuntoImpl.distancia(p1,p2);
	mostrar("Distancia entre los puntos p1 y p2:",dist0);
	
	Double dist1=PuntoImpl.distancia(p2,p1);
	mostrar("Distancia entre los puntos p2 y p1:",dist1);
	
	Double dist2=PuntoImpl.distancia(p1, p3);
	mostrar("Distancia entre los puntos p1 y p3:",dist2);
	
	Boolean distMayorQue1=PuntoImpl.distanciaMayorQue(p1, p2, 6.0);
	mostrar("�Es 6 mayor que la distancia entre p1 y p2?: ",distMayorQue1);
	
	Boolean distMayorQue2=PuntoImpl.distanciaMayorQue(p1, p2, 6.5);
	mostrar("�Es 6.5 mayor que la distancia entre p1 y p2?: ",distMayorQue2);
}
private static Punto[] crearPuntos() {
	Punto[]puntos=new Punto[MAX];
	for(int i=0;i<MAX;i++){
		puntos[i]=new PuntoImpl(5*Math.random(),5*Math.random());
	}
	return puntos;
}
}
