package business;

/**
 * Clase Camion con herencia de Vehiculo
 * @author Chisela Marien Colas Gil
 *
 */
public class Camion extends Vehiculo {
	
	/**
	 * Atributo especial de la clase Camion
	 */
	private String tipoCarnet;
	
	/**
	 * Constructor vacio
	 */
	public Camion() {
		super();
	}
	
	/**
	 * Metodo para obtener el atributo TipoCarnet
	 * @return TipoCarnet
	 */
	public String getTipoCarnet() {
		return tipoCarnet;
	}

	/**
	 * metodo para establecer el atributo
	 * @param tipoCarnet
	 */
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}
	
	/**
	 * Metodo en proceso que no devuelve nada, de momento muestra un mensaje
	 * @param velocidad
	 */
	public void acelerarCamion(Integer velocidad) {
		System.out.println("La aceleraci�n del cami�n se realizar� progresivamente para conservar sus neum�ticos");
		
		//TO DO
		//Incluir l�gica de movimiento
	}
	
	/**
	 * Metodo que muestra un mensaje al detener el camion
	 */
	public void detenerCamion() {
		System.out.println("CUIDADO!! La detenci�n de un veh�culo de gran tama�o puede ocasionar accidentes de tr�fico");
	}
	
	/**
	 * Metodo toString de la clase Camion
	 */
	@Override
	public String toString() {
		return "Camion [tipoCarnet=" + tipoCarnet + "]";
	}
	
	
}
