package fp.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestBP10ImplementacionesListas extends Test {

	private static final int NUM_INSERCIONES = 1000000;
	private static final int NUM_INSERCIONES_PRINCIPIO = 10000;
	private static final int NUM_BUSQUEDAS = 5000;
	private static final int NUM_BORRADOS = 5000;
	private static final int NUM_ACCESSOS = 5000;
	private static final int MAX_VALUE = 100000;
	private static Random rand = new Random();
	private static long tiempoAntes, tiempoDespues;

	public static void main(String[] args) {
		List<Integer> arrayList, linkedList;
		arrayList = new ArrayList<Integer>();
		linkedList = new LinkedList<Integer>();
		mostrar("TEST DE INSERCIÓN SECUENCIAL========================");
		mostrar("Vamos a insertar " + NUM_INSERCIONES
				+ " elementos secuencialmente...");
		testInsercion(arrayList);
		testInsercion(linkedList);
		mostrar("TEST DE INSERCIÓN AL PRINCIPIO======================");
		mostrar("Vamos a insertar " + NUM_INSERCIONES_PRINCIPIO
				+ " elementos al principio...");
		testInsercionPrincipio(arrayList);
		testInsercionPrincipio(linkedList);
		mostrar("TEST DE BÚSQUEDA AL AZAR============================");
		mostrar("Vamos a buscar " + NUM_BUSQUEDAS + " elementos al azar...");
		testBusqueda(arrayList);
		testBusqueda(linkedList);
		mostrar("TEST DE ACCESO AL AZAR==============================");
		mostrar("Vamos a acceder a " + NUM_ACCESSOS + " elementos al azar...");
		testAcceso(arrayList);
		testAcceso(linkedList);
		mostrar("TEST DE BORRADO ELEMENTOS INICIALES===================");
		mostrar("Vamos a borrar " + NUM_BORRADOS
				+ " elementos del principio...");
		testBorrado(arrayList);
		testBorrado(linkedList);
	}

	private static void testInsercionPrincipio(List<Integer> l) {
		tiempoAntes = System.currentTimeMillis();
		for (int i = 0; i < NUM_INSERCIONES_PRINCIPIO; i++) {
			l.add(0, rand.nextInt(MAX_VALUE));
		}
		tiempoDespues = System.currentTimeMillis();
		mostrar(l.getClass().getName() + ":\t" + "(" + tiempoDespues + " -"
				+ tiempoAntes + ")" + " milisegundos");
	}

	private static void testInsercion(List<Integer> l) {
		tiempoAntes = System.currentTimeMillis();
		for (int i = 0; i < NUM_INSERCIONES; i++) {
			l.add(rand.nextInt(MAX_VALUE));
		}
		tiempoDespues = System.currentTimeMillis();
		mostrar(l.getClass().getName() + ":\t" + "(" + tiempoDespues + " -"
				+ tiempoAntes + ")" + " milisegundos");
	}

	private static void testBusqueda(List<Integer> l) {
		tiempoAntes = System.currentTimeMillis();
		for (int i = 0; i < NUM_BUSQUEDAS; i++) {
			l.contains(rand.nextInt(MAX_VALUE));
		}
		tiempoDespues = System.currentTimeMillis();
		mostrar(l.getClass().getName() + ":\t" + "(" + tiempoDespues + " -"
				+ tiempoAntes + ")" + " milisegundos");
	}

	private static void testAcceso(List<Integer> l) {
		tiempoAntes = System.currentTimeMillis();
		Integer n = 0;
		for (int i = 0; i < NUM_ACCESSOS; i++) {
			n = l.get(rand.nextInt(NUM_INSERCIONES));
			n++; // por hacer algo con la variable
		}
		tiempoDespues = System.currentTimeMillis();
		mostrar(l.getClass().getName() + ":\t" + "(" + tiempoDespues + " -"
				+ tiempoAntes + ")" + " milisegundos");
	}

	private static void testBorrado(List<Integer> l) {
		tiempoAntes = System.currentTimeMillis();
		for (int i = 0; i < NUM_BORRADOS; i++) {
			l.remove(i);
		}
		tiempoDespues = System.currentTimeMillis();
		mostrar(l.getClass().getName() + ":\t" + "(" + tiempoDespues + " -"
				+ tiempoAntes + ")" + " milisegundos");
	}
}