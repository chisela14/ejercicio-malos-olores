package main;
/**
 * Imports de diferentes cases que vamos a necesitar en el programa
 * Scanner para obtener datos por teclado
 * Camion y Coche son las clases creadas para este proyecto
 * Utils clase con diferentes herramientas
 */
import java.util.Scanner;

import business.Camion;
import business.Coche;
import utils.Utils;

/**
 * Clase principal de nuestro programa
 * @author Jorge Rodriguez
 *
 */
public class MenuApp {

	/**
	 * Método principal de la clase
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		mostrarPresentacion();
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = sc.nextLine();
		
		mostrarBienvenida(nombre, primerApellido);
		
		System.out.println("Introduce el n�mero de coches : ");
		int numCoches= sc.nextInt();
		Coche[] listaCoches = new Coche[numCoches];
		arrancarCoche(numCoches, listaCoches);
		
		System.out.println("Introduce el n�mero de camiones : ");
		int numCamiones= sc.nextInt();
		Camion[] listaCamiones = new Camion[numCamiones];
		arrancarCamion(numCamiones, listaCamiones);
		
		detenerCoche(listaCoches);
		detenerCamion(listaCamiones);
		
		sc.close();
		
	}

	/**
	 * Método para modificar la lista de camiones (arrancarlos)
	 * @param numCamiones
	 * @param listaCamiones
	 */
	public static void arrancarCamion(int numCamiones, Camion[] listaCamiones) {
		for (int i=0; i<numCamiones; i++) {
			listaCamiones[i] = new Camion();
			listaCamiones[i].acelerarCamion(30);
		}
	}

	/**
	 * Método para modificar la lista de coches (arrancarlos)
	 * @param numCamiones
	 * @param listaCamiones
	 */
	public static void arrancarCoche(int numCoches, Coche[] listaCoches) {
		for (int i=0; i<numCoches; i++) {
			listaCoches[i] = new Coche();
			listaCoches[i].acelerarCoche(15);
		}
	}

	/**
	 * Método para mostrar un mensaje de bienvenida
	 * @param nombre
	 * @param primerApellido
	 */
	public static void mostrarBienvenida(String nombre, String primerApellido) {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fecha_actual() );
		System.out.println("/*** " + Utils.hora_actual() );
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	
	/**
	 * Método para mostrar un mensaje de presentacion
	 * @param nombre
	 * @param primerApellido
	 */
	private static void mostrarPresentacion () {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	/**
	 * Método para modificar la lista de coches (detenerlos)
	 * @param listaCoches
	 */
	private static void detenerCoche(Coche[] listaCoches) {
		for (int i=0; i<listaCoches.length; i++) {
			listaCoches[i].detenerCoche();
		}
	}
	
	/**
	 * Método para modificar la lista de camiones (detenerlos)
	 * @param listaCoches
	 */
	private static void detenerCamion(Camion[] listaCamiones) {
		for (int i=0; i<listaCamiones.length; i++) {
			listaCamiones[i].detenerCamion();
		}
	}

}
