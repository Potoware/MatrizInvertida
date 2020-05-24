/**
 * PARCIAL 3-C ALGEBRA Y PROGRAMACION LINEAL - ALEJANDRO POTOSI MORENO - WILLIAM GUILLERMO ALBARRACIN
 */
package matriz;

/**
 * @author apotosimo, walbarracinro
 *
 */
public class Determinante {
	long determinante;

	//INICIO CALCULADO DETERMINANTE
	public boolean determinante(int B[][]) {

		try {
			//INICIO DETERMINANTE MATRIZ 3x3
			if (B.length == 3) {
				determinante = (B[0][0] * ((B[1][1] * B[2][2]) - (B[1][2] * B[2][1])))
						- (B[0][1] * ((B[1][0] * B[2][2]) - (B[2][0] * B[1][2])))
						+ (B[0][2] * ((B[1][0] * B[2][1]) - (B[2][0] * B[1][1])));
				System.out.println("Determinate:" + determinante);
			} 
			//FIN DETERMINANTE MATRIZ 3x3
			
			//INICIO DETERMINANTE MATRIZ 2x2
			else {

				determinante = (B[0][0] * B[1][1]) - (B[0][1] * B[1][0]);
				System.out.println("Determinate: " + determinante);
			}
			//FIN DETERMINANTE MATRIZ 2x2
			
			//CONDICIONAL PARA SACAR INVERSA
			if (determinante == 0) {
				return false;
			} else {
				return true;
			}
			
			//FIN CONDICIONAL PARA SACAR INVERSA
			
		} catch (Exception e) {
			System.out.println("Esta matriz no tiene determinante");
			return false;
		}
	}
	//FIN CALCULADO DETERMINANTE

}
