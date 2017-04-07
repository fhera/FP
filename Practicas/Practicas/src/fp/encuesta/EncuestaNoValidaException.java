package fp.encuesta;

public class EncuestaNoValidaException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EncuestaNoValidaException(){
		super();
	}
	public EncuestaNoValidaException(String s){
		super(s);
	}
}
