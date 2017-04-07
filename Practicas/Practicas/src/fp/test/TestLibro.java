package fp.test;

import fp.fecha.FechaImpl;
import fp.libro.*;
import fp.persona.Genero;
import fp.persona.PersonaImpl;

public class TestLibro extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro l1 = new LibroImpl(
				"978-1-4058-8243-9",
				"The Firm",
				new PersonaImpl("John", "Grisham", "47558918-R", Genero.Hombre),
				new FechaImpl("1/1/2008"), 82);
		mostrar(l1);

		Libro l2 = new LibroImpl("978-1-4058-8243-9, The Firm, 1/1/2008");
		mostrar(l2);

	}

}
