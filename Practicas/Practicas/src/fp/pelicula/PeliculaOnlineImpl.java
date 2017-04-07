package fp.pelicula;

import java.util.LinkedList;
import java.util.List;

public class PeliculaOnlineImpl extends PeliculaImpl implements PeliculaOnline {

	private String link;
	private List<Integer> puntuaciones;
	private Double puntuacion;
	
	public PeliculaOnlineImpl(String link, List<Integer> puntuaciones){
		super();
		this.link=link;
		this.puntuaciones= new LinkedList<Integer>();
	}

	public String getLinkYoutube() {
		return link;
	}

	public void setLinkYoutube(String link) {
		this.link = link;
	}

	public List<Integer> getPuntuaciones() {
		return puntuaciones;
	}

	public void setPuntuaciones(List<Integer> puntuaciones) {
		this.puntuaciones = puntuaciones;
	}

	public Double getPuntuacionMedia() {
		return puntuacion;
	}

	
	public void añadePuntuacion(Integer punt) {
		puntuaciones.add(punt);
	}
	
}