package fp.vehiculo;

import java.util.List;
import java.util.LinkedList;

public class Vehiculos extends VehiculoImpl implements Vehiculo{
	
	private static List<Vehiculo> lista=new LinkedList<Vehiculo>();
	private static Integer numVehiculos;
	private static Integer modelosSigolXX;

	public static Integer getModelosSigolXX() {
		return modelosSigolXX;
	}

	public static Integer getNumVehiculos() {
		return numVehiculos;
	}

	public static Vehiculo create(){
		numVehiculos++;
		return new VehiculoImpl();
	}
	
	public static Vehiculo create(String marca, Integer año, TipoVehiculo tipo){
		numVehiculos++;
		if (año<1901)
		return new VehiculoImpl();
	}
	public static Vehiculo create(String cad){
		numVehiculos++;
		return new VehiculoImpl();
	}
	
	

}
