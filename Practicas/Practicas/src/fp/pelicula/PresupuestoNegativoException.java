package fp.pelicula;

public class PresupuestoNegativoException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PresupuestoNegativoException(){
		super();
	}
	
	public PresupuestoNegativoException(String s){
		super(s);
	}

}
