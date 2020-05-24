/**
 * PARCIAL 3-C ALGEBRA Y PROGRAMACION LINEAL - ALEJANDRO POTOSI MORENO - WILLIAM GUILLERMO ALBARRACIN
 */
package matriz;

/**
 * @author apotosimo, walbarracinro
 *
 */
public class Inversa

{

	// CALCULAR INVERSA DE MATRIZ
	public double[][] invertir(double matrizA[][]) {
		
		// DEFINIR VARIABLES
		int tamanoMatriz = matrizA.length;
		double matrizInversa[][] = new double[tamanoMatriz][tamanoMatriz];
		double matrizIdentidad[][] = new double[tamanoMatriz][tamanoMatriz];
		int indice[] = new int[tamanoMatriz];
		// FIN DEFINIR VARIABLES

		// INSTANCIAR CLASES
		GaussJordan gaussJordan = new GaussJordan();
		// FIN INSTANCIAR CLASES

		// CONSTRUIR MATRIZ IDENTIDAD
		for (int i = 0; i < tamanoMatriz; i++) {
			matrizIdentidad[i][i] = 1;
		}
		// FIN CONSTRUIR MATRIZ INDENTIDAD

		// ESCALONAR MATRIZ Y ASIGNAR VALORES
		gaussJordan.gaussJordan(matrizA, indice);

		for (int i = 0; i < tamanoMatriz - 1; i++) {

			for (int j = i + 1; j < tamanoMatriz; j++) {

				for (int k = 0; k < tamanoMatriz; k++) {

					matrizIdentidad[indice[j]][k] = matrizIdentidad[indice[j]][k]
							- matrizA[indice[j]][i] * matrizIdentidad[indice[i]][k];
				}
			}
		}

		// FIN ESCALONAR MATRIZ Y ASIGNAR VALORES

		for (int i = 0; i < tamanoMatriz; i++) {
			matrizInversa[tamanoMatriz - 1][i] = matrizIdentidad[indice[tamanoMatriz - 1]][i]
					/ matrizA[indice[tamanoMatriz - 1]][tamanoMatriz - 1];
			for (int j = tamanoMatriz - 2; j >= 0; j--) {
				matrizInversa[j][i] = matrizIdentidad[indice[j]][i];
				for (int k = j + 1; k < tamanoMatriz; k++) {
					matrizInversa[j][i] = matrizInversa[j][i] - matrizA[indice[j]][k] * matrizInversa[k][i];
				}

				matrizInversa[j][i] = matrizInversa[j][i] / matrizA[indice[j]][j];
			}
		}
		return matrizInversa;
	}
	// FIN CALCULAR INVERSA MATRIZ

}