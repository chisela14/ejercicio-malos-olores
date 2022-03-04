package business;

/**
 * Superclase Vehículo
 * @author Jorge Rodríguez
 *
 */
public class Vehiculo {
	
	/**
	 * Atributos
	 */
	private String matricula;
	private String color;
	private String combustible;
	private String nombreConductor;
	private String dniConductor;

	/**
	 * Constructor vacio
	 */
	public Vehiculo() {
		super();
	}
	
	/**
	 * Metodo para obtener el atributo matricula
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	
	/**
	 * Método para establecer el atributo matricula
	 * @return matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * Método para obtener el atributo color
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Método para establecer el atributo color
	 * @return color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Método para obtener el atributo combustible
	 * @return combustible
	 */
	public String getCombustible() {
		return combustible;
	}

	/**
	 * Método para establecer el atributo combustible
	 * @return combustible
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	/**
	 * Método para obtener el atributo conductor
	 * @return nombreConductor
	 */
	public String getNombreConductor() {
		return nombreConductor;
	}
	
	/**
	 * Método para establecer el atributo conductor
	 * @return nombreConductor
	 */
	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	/**
	 * Método para obtener el atributo dni
	 * @return dniConductor
	 */
	public String getDniConductor() {
		return dniConductor;
	}

	/**
	 * Método para establecer el atributo dni
	 * @return dniConductor
	 */
	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}
	/**
	 * Método toString de la clase Vehiculo
	 */
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible
				+ ", nombreConductor=" + nombreConductor + ", dniConductor=" + dniConductor + "]";
	}

}