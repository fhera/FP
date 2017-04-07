package fp.racional;

public class ValorNoValidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public ValorNoValidoException(String s){
		super(s);
	}
	public ValorNoValidoException(){
		super();
	}
}
