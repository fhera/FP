package fp.punto3D;

import fp.interfaces.Copiable;

public interface Punto3D extends Copiable<Punto3D>{
	Double getX();
	void setX(Double nuevoX);
	Double getY();
	void setY(Double nuevoY);
	Double getZ();
	void setZ(Double nuevoZ);
	Double getDistancia();
}
