/**
 * PARCIAL 3-C ALGEBRA Y PROGRAMACION LINEAL - ALEJANDRO POTOSI MORENO - WILLIAM GUILLERMO ALBARRACIN
 */
package matriz;

/**
 * @author apotosimo, walbarracinro
 *
 */
public class Validar {
	// DEFINICION VARIABLES
	String informacion;
	int valorValidado;
	// FIN DEFINICION VARIABLES

	// VALIDAR DATOS
	public void validadorDatos(String valor) {
		try {
			if ((Integer.parseInt(valor) >= 0) || ((Integer.parseInt(valor) <= 0))) {
				valorValidado = Integer.parseInt(valor);
				informacion = "El valor " + valor + " se asigno correctamente";
			}
		} catch (Exception e) {
			informacion = "error";
		}

	}
	// FIN VALIDAR DATOS

	// VALIDAR TAMAÑO MATRIZ
	public boolean validadorTamano(String valor) {
		try {
			if (Integer.parseInt(valor) > 0) {
				valorValidado = Integer.parseInt(valor);
				return true;
			} else {
				System.out.println("\nError, el valor debe ser numero entero mayor a 0\n");
				return false;

			}

		} catch (Exception e) {
			System.out.println("\nError, el valor debe ser numero entero mayor a 0\n");
			return false;
		}
	}
	// FIN VALIDAR TAMAÑO MATRIZ


}
