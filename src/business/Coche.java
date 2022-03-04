package business;
/**
 * Clase Coche con herencia de Vehiculo
 * @author Chisela Marien Colas Gil
 *
 */
public class Coche extends Vehiculo {
	
	/**
	 * Atributo especial de la clase Coche
	 */
	private Integer numPlazas;
	
	/**
	 * Constructor vacio
	 */
	public Coche() {
		super();
	}
	
	/**
	 * Metodo para obtener el atributo numPlazas
	 * @return numPlazas
	 */
	public Integer getnumPlazas() {
		return numPlazas;
	}

	/**
	 * metodo para establecer el atributo
	 * @param numPlazas
	 */
	public void setnumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}

	/**
	 * Metodo para acelerar un coche
	 * @param velocidad
	 */
	public void acelerarCoche(Integer velocidad) {
		if (velocidad > 0 && velocidad < 120) {
			System.out.println("El coche est� acelerando y llegar� la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no est� permitida en un coche seg�n la DGT");
		}
	}
	
	/**
	 * Metodo que muestra un mensaje al detener el coche
	 */
	public void detenerCoche() {
		System.out.println("El coche se detendr� en breve, aseg�rese de buscar un lugar adecuado para estacionar");
	}

	/**
	 * Metodo toString de la clase Coche
	 */
	@Override
	public String toString() {
		return "Coche [numPlazas=" + numPlazas + "]";
	}
	

}
