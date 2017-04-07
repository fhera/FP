package fp.test;
import fp.punto3D.*;
import fp.segmento.*;
public class TestSegmento extends Test{
	public static void main(String[]args){
		Segmento s1=new SegmentoImpl(new Punto3DImpl(7.0,1.0,1.2),new Punto3DImpl(0.0,1.7,4.5));
		mostrar("El segmento s1 es:",s1);
	}
}
