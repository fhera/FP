package fp.pelicula;

import java.util.List;

public interface PeliculaOnline extends Pelicula {
	
	String getLinkYoutube();
	void setLinkYoutube(String link);
	List <Integer> getPuntuaciones();
	Double getPuntuacionMedia();
	
	void añadePuntuacion(Integer punt);

}
