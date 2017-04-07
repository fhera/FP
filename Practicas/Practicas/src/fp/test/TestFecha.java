package fp.test;

import java.util.Arrays;
import fp.fecha.*;

public class TestFecha extends Test{
	public static void main(String[]args){
		
		Fecha[]fechas=creaFechas();
		Arrays.sort(fechas);
		
		mostrar("Ordenación natural\n",Arrays.toString(fechas));
		
		Fecha f1=new FechaImpl(8,11,1992);
		mostrar("",f1);
		
		Fecha f2= new FechaImpl(8,11,1993);
		mostrar("",f2);
		
		Boolean comparador=FechaImpl.comparaFechas(f1, f2);
		mostrar("",comparador);
		
		Fecha f3= new FechaImpl(" 27 / 08 / 1986 ");
		mostrar (f3);
	}

	private static Fecha[] creaFechas() {
		Fecha[]fechas={
				new FechaImpl(1,1,2000),
				new FechaImpl(1,1,2001),
				new FechaImpl(1,2,2000),
				new FechaImpl(3,1,2000),
				new FechaImpl(3,1,2001),
				new FechaImpl(1,2,2001),
				new FechaImpl(3,2,2000)};
		return fechas;
	}
}
