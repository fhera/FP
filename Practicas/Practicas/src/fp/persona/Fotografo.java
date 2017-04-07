package fp.persona;

import java.util.List;

import fp.foto.*;

public interface Fotografo extends Persona {
	
	Integer getNumeroDeColegiado();

	List<Foto> getFotos();

	void añadirFoto(Foto f);
}
