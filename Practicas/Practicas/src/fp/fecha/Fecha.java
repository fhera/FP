package fp.fecha;

import fp.interfaces.Copiable;

public interface Fecha extends Copiable<Fecha>,Comparable<Fecha>{
	
	public Integer getDia();
	void setDia(Integer nuevoDia);
	public Integer getMes();
	void setMes(Integer nuevoMes);
	public Integer getAño();
	void setAño(Integer nuevoAño);
}
