package business;

/**
 * Clase Motocicleta con herencia de Vehiculo
 * @author Jorge Rodriguez
 *
 */
public class Motocicleta extends Vehiculo {
	
	/**
	 * Atributo especial de la clase Motocicleta
	 */
	private Integer cilindrada;
	
	/**
	 * Constructor vacío
	 */
	public Motocicleta() {
		super();
	}
	/**
	 * Método para obtener el atributo cilindrada
	 * @return cilindrada
	 */
	public Integer getCilindrada() {
		return cilindrada;
	}
	
	/**
	 * Método para establecer la cilindrada
	 * @param cilindrada
	 */
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * Método pendiente por desarrollar para acelerar una motocicleta
	 * @param velocidad
	 */
	public void acelerarMoto(Integer velocidad) {
		//TO DO
	}
	
	/**
	 * Método pendiente por desarrollar para detener una motocicleta
	 * @param velocidad
	 */
	public void detenerMoto() {
		//TO DO
	}

	/**
	 * Método toString de la clase Motocicleta 
	 */
	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + "]";
	}	

}
