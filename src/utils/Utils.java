package utils;
/**
 * Clase importada
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase con funciones de cálculo (fechas y precios) para el programa principal
 * @author Jorge Rodríguez
 *
 */
public class Utils {
	
	/**
	 * Método para conseguir la hora actual
	 * @return hora actual
	 */
	public static String hora_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Método para conseguir la fecha actual
	 * @return fecha actual
	 */
	public static String fecha_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Método para calcular el precio del alquiler segun los dias
	 * @param dias cantidad de días a calcular
	 * @return result 
	 */
	public static float calcularPrecioAlquilerDia (Integer dias) {
		float result = 0;
		//El coste de un d�a de alquiler son 50� + 21% de IVA
		result = dias * 50 * 1.21f;
		return result;
	}
	
	/**
	 * Método para calcular el precio según los meses
	 * @param meses cantidad de meses a calcular
	 * @return precio total
	 */
	public static float calcularPrecioAlquilerMes (Integer meses ) {
		//El coste de un mes de renting son 750� + 21% IVA
		return meses * 750 * 1.21f;
	}

}
