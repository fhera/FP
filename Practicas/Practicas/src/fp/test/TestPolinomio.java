package fp.test;
import fp.polinomio.*;
public class TestPolinomio extends Test{
	public static void main(String[]args){
		
	PolinomioEntero p=new PolinomioEnteroImpl();
	p.añadeCoeficiente(4);
	p.añadeCoeficiente(1);
	p.añadeCoeficiente(-2);
	p.añadeCoeficiente(0);
	p.añadeCoeficiente(3);
	mostrar("p=", p);
	
	PolinomioEntero p1=new PolinomioEnteroImpl();
	p1.añadeCoeficiente(0);
	p1.añadeCoeficiente(1);
	p1.añadeCoeficiente(0);
	p1.añadeCoeficiente(-7);
	p1.añadeCoeficiente(2);
	//p1.añadeCoeficiente(8);
	mostrar("p1=",p1);
	
	PolinomioEntero p2=new PolinomioEnteroImpl();
	p2.añadeCoeficiente(1);
	p2.añadeCoeficiente(1);
	p2.añadeCoeficiente(1);
	p2.añadeCoeficiente(1);
	mostrar("p2=",p2);
	
	p2.multiplicaCoeficientes(8);
	mostrar("p2*8=",p2);
	
	p2.sumaCoeficiente(2,3);
	mostrar("nuevo p2=", p2);
	
	p1.sumar(p);
	mostrar("p+p1=",p1);
	
	PolinomioEntero p3=new PolinomioEnteroImpl();
	p3.añadeCoeficiente(1);
	p3.añadeCoeficiente(1);
	p3.añadeCoeficiente(1);
	p3.añadeCoeficiente(1);
	mostrar("p3=",p3);
	
	p3.sumar(p);
	mostrar("p3+p =",p3);
	mostrar("p=",p);
	
	p.derivar();
	mostrar("p'=",p);
	}
}
