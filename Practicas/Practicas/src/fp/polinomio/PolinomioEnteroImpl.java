package fp.polinomio;

import java.util.ArrayList;
import java.util.List;

public class PolinomioEnteroImpl implements PolinomioEntero{
	private List<Integer>coeficientes;
	//private Integer grado;
	
	public PolinomioEnteroImpl(){
	coeficientes=new ArrayList<Integer>();
	}
	public PolinomioEnteroImpl(Integer[]listaCoeficientes){
		for(Integer c: listaCoeficientes){
			coeficientes.add(c);
		}
		eliminaCerosDeCoeficientesMayores();
	}
	private void eliminaCerosDeCoeficientesMayores(){
		if(getCoeficiente(getGrado())==0){
			while(!coeficientes.isEmpty()&&getCoeficiente(getGrado())==0){
					}
		}
		if(coeficientes.isEmpty()){
			coeficientes.add(0);
		}
	}
	public Integer getGrado(){
		return coeficientes.size()-1;
	}
	public Integer getCoeficiente(Integer g){
		if(g<0||g>getGrado()){
			throw new GradoNoValidoException("El grado no puede ser negativo ni superior a "+getGrado()+
					" ha introducido: "+g);
		}
		return coeficientes.get(g);
	}
	public void setCoeficientes(List<Integer>lc){
		coeficientes=lc;
		eliminaCerosDeCoeficientesMayores();
	}
	public void setCoeficiente(Integer c,Integer g){
		if(g<0||g>getGrado()){
			throw new GradoNoValidoException("El grado no puede ser negativo ni superior a "+getGrado()+
					" ha introducido: "+g);
		}
		coeficientes.set(g, c);
		eliminaCerosDeCoeficientesMayores();
	}
	public Double getValor(Double x){
		Double result=0.0;
		for(int i=0;i<=getGrado();i++){
			result+=getCoeficiente(i)*Math.pow(x, i);
		}
		return result;
	}
	public void añadeCoeficiente(Integer c){
		
			coeficientes.add(c);
		
	}
	public void sumaCoeficiente(Integer n, Integer g){
		if(g<0||g>getGrado()){
			throw new GradoNoValidoException("El grado no puede ser negativo ni superior a "+getGrado()+
					" ha introducido: "+g);
		}
		setCoeficiente(getCoeficiente(g)+n,g);
		eliminaCerosDeCoeficientesMayores();
	}
	public void restaCoeficiente(Integer n, Integer g){
		if(g<0||g>getGrado()){
			throw new GradoNoValidoException("El grado no puede ser negativo ni superior a "+getGrado()+
					" ha introducido: "+g);
		}
		setCoeficiente(getCoeficiente(g)-n,g);
		eliminaCerosDeCoeficientesMayores();
	}
	public void multiplicaCoeficientes(Integer r){
		for(int i=0;i<=getGrado();i++){
			setCoeficiente(coeficientes.get(i)*r,i);
		}
		eliminaCerosDeCoeficientesMayores();
	}
	public void sumar(PolinomioEntero p){
		if(getGrado()>=p.getGrado()){
			for(int i=0;i<=this.getGrado();i++){
				sumaCoeficiente(p.getCoeficiente(i),i);
			}
		}else{
			for(int i=0;i<=this.getGrado();i++){
				sumaCoeficiente(p.getCoeficiente(i),i);
			}
			for(int i=this.getGrado();i<=p.getGrado();i++){
				añadeCoeficiente(p.getCoeficiente(i));
			}
		}
		eliminaCerosDeCoeficientesMayores();
	}
	public List<Integer> getCoeficientes() {
		return coeficientes;
	}
	public void derivar() {
		
		for(int i=1;i<=getGrado();i++){
			setCoeficiente(coeficientes.get(i)*i,i-1);
			
		}
		eliminaCerosDeCoeficientesMayores();
	}

	public boolean equals(Object o){
		boolean result = false;
		if (o instanceof PolinomioEntero){
		PolinomioEntero p =(PolinomioEntero)o;
		result = getCoeficientes().equals(p.getCoeficientes());
		}
		return result;
		}
	public int hashCode(){
		int hc = 0;
		for (int i=0; i< this.getGrado(); i++)
		hc+= this.getCoeficiente(i).hashCode();
		return hc;
		}
	public PolinomioEntero clone(){
		PolinomioEntero result=null;
		try{
			result=(PolinomioEntero)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return result;
	}
	public String toString(){
		String s = "";
			for (int i =this.getGrado() ;i>=0; i--){
				
				if(i==0){
					String s1="+"+this.getCoeficiente(i);
					if(i<0){
						s1="("+this.getCoeficiente(i)+")";
					}else if(getCoeficiente(i)==0){
					s1="";
					}
					s=s+s1;
				}
				if(i==1){
					String s2="+"+this.getCoeficiente(i)+"x";
					if(this.getCoeficiente(i)==1){
						s2="+x";
					}else if(this.getCoeficiente(i)<0){
						s2="+("+this.getCoeficiente(i)+"x"+")";
					}else if(this.getCoeficiente(i)==0){
						s2="";
					}
				s=s+s2;
				}
				if(i>1&&i<this.getGrado()){
				String s3= "+" + this.getCoeficiente(i) + "x^"+i;
				if(this.getCoeficiente(i)==1){
					s3="+x^"+i;
				}else if(this.getCoeficiente(i)<0){
					s3="+("+this.getCoeficiente(i)+"x^"+i+")";
				}else if(this.getCoeficiente(i)==0){
					s3="";
				}
				s=s+s3;
				}
				if(i==this.getGrado()){
					String s4=this.getCoeficiente(i)+"x^"+i;
					if(this.getCoeficiente(i)==1){
						s4="x^"+i;
					}else if(this.getCoeficiente(i)<0){
						s4="("+this.getCoeficiente(i)+"x^"+i+")";
					}
					s=s+s4;
				}
				}
				
			return s;
		}
	}
