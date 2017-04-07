package fp.vehiculo;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

public class VehiculoImpl implements Vehiculo {

	private String marca;
	private Integer año;
	private TipoVehiculo tipo;

	public VehiculoImpl() {
		
	}

	public VehiculoImpl(String marca, Integer año, TipoVehiculo tipo) {
		if (año < 1901) {
			throw new IllegalArgumentException("El año no es correcto");
		}

		this.año = año;
		this.marca = marca;
		this.tipo = tipo;
	}
	
	public VehiculoImpl(String cad){
		this();
		Splitter sp=Splitter.on(CharMatcher.anyOf("()"));
		Iterable<String> it= sp.omitEmptyStrings().trimResults().split(cad);
		List<String> parametros =new ArrayList<String>();
		for(String pal: it){
			parametros.add(pal);
		}
		
		if(parametros.size()<2){
			throw new IllegalArgumentException("Formato de cadena no válida");
		}else{
			this.marca= parametros.get(0);
			Integer a= new Integer(parametros.get(1));
			if (a< 1901) {
				throw new IllegalArgumentException("El año no es correcto");
			}
			this.año=a;
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAño() {
		return año;
	}

	public TipoVehiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;

	}
	public int hashCode() {
		return this.getMarca().hashCode() + this.getAño().hashCode()*31;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Vehiculo) {
			Vehiculo v = (Vehiculo) o;
			result = this.getMarca().equals(v.getMarca())
					&& this.getAño().equals(v.getAño());
		}
		return result;
	}

	public String toString() {
		return this.getMarca() + "(" + this.getAño() + ")";
	}

}
