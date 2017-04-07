package fp.polinomio;

public class GradoNoValidoException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public GradoNoValidoException(){
		super();
	}
	public GradoNoValidoException(String s){
		super(s);
	}
}
