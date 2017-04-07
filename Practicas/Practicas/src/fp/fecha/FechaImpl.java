package fp.fecha;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

public class FechaImpl implements Fecha {
	private Integer dia;
	private Integer mes;
	private Integer año;

	public FechaImpl() {

	}

	public FechaImpl(Integer dia, Integer mes, Integer año) {

		if (dia > 31 || dia < 1 || mes < 1 || mes > 12)
			throw new IllegalArgumentException("fecha no válida");
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public FechaImpl(String cad) {

		this();
		Splitter sp = Splitter.on(CharMatcher.anyOf("/"));

		Iterable<String> it = sp.omitEmptyStrings().trimResults().split(cad);

		List<String> parametros = new ArrayList<String>();

		for (String pal : it) {
			parametros.add(pal);
		}
		// Iterables.addAll(parametros, it);
		if (parametros.size() > 3) {
			throw new IllegalArgumentException("Formato de cadena no válido");
		} else {

			Integer d = new Integer(parametros.get(0));
			Integer m = new Integer(parametros.get(1));
			Integer a = new Integer(parametros.get(2));

			if (d > 31 || d < 1 || m < 1 || m > 12)
				throw new IllegalArgumentException("fecha no válida");

			this.dia = d;
			this.mes = m;
			this.año = a;
		}
	}

	public Integer getDia() {
		return dia;
	}

	public Integer getMes() {
		return mes;
	}

	public Integer getAño() {
		return año;
	}

	public void setDia(Integer nuevoDia) {
		dia = nuevoDia;
	}

	public void setMes(Integer nuevoMes) {
		mes = nuevoMes;
	}

	public void setAño(Integer nuevoAño) {
		año = nuevoAño;
	}

	public static Boolean comparaFechas(Fecha f1, Fecha f2) {
		Boolean result = true;
		if (f1.getDia() > f2.getDia() && f1.getMes() >= f2.getMes()
				&& f1.getAño() >= f2.getAño() || f1.getMes() > f2.getMes()
				&& f1.getAño() >= f2.getAño() || f1.getAño() > f2.getAño()) {
			result = false;
		}
		return result;
	}

	public Fecha clone() {
		Fecha result = null;
		try {
			result = (Fecha) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int hashCode() {
		return this.getDia().hashCode() + this.getMes().hashCode()
				+ this.getAño().hashCode() * 31;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Fecha) {
			boolean aux1 = this.getDia().equals(((Fecha) o).getDia());
			boolean aux2 = this.getMes().equals(((Fecha) o).getMes());
			boolean aux3 = this.getAño().equals(((Fecha) o).getAño());
			result = aux1 && aux2 && aux3;
		}
		return result;
	}

	public int compareTo(Fecha f) {
		int result;
		result = this.getAño().compareTo(f.getAño());
		if (result == 0) {
			result = this.getMes().compareTo(f.getMes());
			if (result == 0) {
				result = this.getDia().compareTo(f.getDia());
			}
		}
		return result;
	}

	public String toString() {
		return getDia() + "/" + getMes() + "/" + getAño();
	}

}
