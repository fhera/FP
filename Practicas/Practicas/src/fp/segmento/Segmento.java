package fp.segmento;

import fp.interfaces.Copiable;
import fp.punto3D.*;

public interface Segmento extends Copiable<Segmento>{
	Punto3D getExtremoA();
	void setExtremoA(Punto3D nuevoExtremoA);
	Punto3D getExtremoB();
	void setExtremoB(Punto3D nuevoExtremoB);
	Double getLongitud();
}
