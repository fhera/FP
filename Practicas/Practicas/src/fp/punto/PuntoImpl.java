package fp.punto;

public class PuntoImpl implements Punto {
	
	private Double x;
	private Double y;
	private Double distancia;

	public PuntoImpl(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}

	public static Double distancia(Punto p, Punto q) {
		Double result = Math.sqrt(Math.pow(p.getX() - q.getX(), 2)
				+ Math.pow(p.getY() - q.getY(), 2));
		return result;
	}

	public Double getDistancia() {
		return distancia;
	}

	public void setX(Double nuevoX) {
		x = nuevoX;
	}

	public void setY(Double nuevoY) {
		y = nuevoY;
	}

	public static Boolean distanciaMayorQue(Punto p, Punto q, Double n) {
		Boolean result = false;
		if (PuntoImpl.distancia(p, q) < n) {
			result = true;
		}
		return result;
	}

	public Punto clone() {
		Punto result = null;
		try {
			result = (Punto) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int hashCode() {
		return this.getX().hashCode() + this.getY().hashCode() * 31;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Punto) {
			boolean aux1 = this.getX().equals(((Punto) o).getX());
			boolean aux2 = this.getY().equals(((Punto) o).getY());
			result = aux1 && aux2;
		}
		return result;
	}

	public int compareTo(Punto p) {
		int result;
		
		result = getX().compareTo(p.getX());
		if (result == 0) {
			result = getY().compareTo(p.getY());
		}
		return result;
	}

	public String toString() {
		String s = "(" + getX() + "," + getY() + ")";
		return s;
	}
}
