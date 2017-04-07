package fp.punto;

import fp.interfaces.Copiable;

public interface Punto extends Copiable<Punto>, Comparable<Punto>{
Double getX();
Double getY();
Double getDistancia();
void setX(Double nx);
void setY(Double ny);
}
