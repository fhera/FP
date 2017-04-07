package fp.test;

import fp.vehiculo.*;

public class TestVehiculo extends Test{

	public static void main(String[] args) {

		Vehiculo v1=new VehiculoImpl();
		mostrar(v1);
		
		Vehiculo v2=new VehiculoImpl("Ford", 1985, TipoVehiculo.AUTOMOVIL);
		mostrar(v2);
		
		Vehiculo v3= new VehiculoImpl("Citroen(1986)");
		
		mostrar(v3);
		
		Vehiculo v4= new Vehiculos();
	}

}
