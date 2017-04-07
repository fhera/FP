package fp.vuelo;

import java.util.List;
import fp.fecha.*;
import fp.interfaces.Copiable;
import fp.persona.*;

public interface Vuelo extends Copiable<Vuelo>,Comparable<Vuelo>{
	public String getCodigoVuelo();
	public String getDestino();
	public Double getPrecio();
	public void setPrecio(Double precio1);
	public Integer getNumeroPlazas();
	public Integer getNumeroPasajeros();
	public Fecha getFechaSalida();
	public Double getRecaudacion();
	public Fecha getFechaReserva();
	public Double getOcupacion();
	public List<Pasajero> getPasajeros();
	public void añadePasajero(Pasajero p);
}
