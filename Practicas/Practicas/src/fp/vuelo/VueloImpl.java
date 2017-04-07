package fp.vuelo;

import java.util.ArrayList;
import java.util.List;
import fp.fecha.*;
import fp.persona.*;

public class VueloImpl implements Vuelo {

	private String codigoVuelo;
	private String destino;
	private Double precio;
	private Integer numeroPlazas;
	private Integer numeroPasajeros;
	private Fecha fechaSalida, fechaReserva;
	private List<Pasajero> pasajeros = new ArrayList<Pasajero>();

	public VueloImpl(String codigoVuelo, String destino, Double precio,
			Integer numeroPlazas, Fecha fechaSalida, Fecha fechaReserva) {

		if (precio < 0)
			throw new IllegalArgumentException("Error al introducir los datos");

		Integer numeroPasajeros = pasajeros.size();
		if (numeroPasajeros > numeroPlazas) {
			throw new IllegalArgumentException(
					"El número de pasajeros no puede ser mayor al de plazas");
		}

		if (fechaSalida.getDia() < fechaReserva.getDia()
				&& fechaSalida.getMes() <= fechaReserva.getMes()
				&& fechaSalida.getAño() <= fechaReserva.getAño())
			throw new IllegalArgumentException("Error al introducir el día");

		if (fechaSalida.getMes() < fechaReserva.getMes()
				&& fechaSalida.getAño() <= fechaReserva.getAño())
			throw new IllegalArgumentException("Error al introducir el mes");

		if (fechaSalida.getAño() < fechaReserva.getAño())
			throw new IllegalArgumentException("Error al introducir el año");

		this.codigoVuelo = codigoVuelo;
		this.destino = destino;
		this.precio = precio;
		this.numeroPlazas = numeroPlazas;
		this.fechaSalida = fechaSalida;
		this.fechaReserva = fechaReserva;
	}

	public String getCodigoVuelo() {
		return codigoVuelo;
	}

	public String getDestino() {
		return destino;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		if (precio < 0)
			throw new IllegalArgumentException(
					"El precio no puede ser negativo");
		this.precio = precio;
	}

	public Integer getNumeroPlazas() {
		return numeroPlazas;
	}

	public Integer getNumeroPasajeros() {
		Integer numeroPasajeros = pasajeros.size();
		if (numeroPasajeros > numeroPlazas) {
			throw new IllegalArgumentException("El número de pasajeros "
					+ "no puede ser mayor al de plazas");
		}
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(Integer numeroPasajeros) {
		if (numeroPasajeros > numeroPlazas)
			throw new IllegalArgumentException(
					"no puede haber mas pasajeros que plazas");

		this.numeroPasajeros = numeroPasajeros;
	}

	public Fecha getFechaSalida() {
		return fechaSalida;
	}

	public Double getRecaudacion() {
		return precio * numeroPasajeros;
	}

	public Double getOcupacion() {
		return numeroPasajeros * 100.0 / numeroPlazas;
	}

	public Fecha getFechaReserva() {
		return fechaReserva;
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void añadePasajero(Pasajero p) {
		this.pasajeros.add(p);
	}

	public Vuelo clone() {
		Vuelo result = null;
		try {
			result = (Vuelo) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int hashCode() {
		return this.getCodigoVuelo().hashCode();
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Vuelo) {
			result = this.getCodigoVuelo().equals(((Vuelo) o).getCodigoVuelo());
		}
		return result;
	}

	public int compareTo(Vuelo v) {
		int result = this.getCodigoVuelo().compareTo(v.getCodigoVuelo());
		return result;
	}

	public String toString() {
		return getCodigoVuelo() + " " + "(" + getDestino() + ")" + " - "
				+ getFechaSalida();
	}

}
