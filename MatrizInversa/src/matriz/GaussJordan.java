/**
 * PARCIAL 3-C ALGEBRA Y PROGRAMACION LINEAL - ALEJANDRO POTOSI MORENO - WILLIAM GUILLERMO ALBARRACIN
 */
package matriz;

/**
 * @author apotosimo, walbarracinro
 *
 */
public class GaussJordan {

	// INICIO GAUSSJORDAN - ESCALONAR MATRIZ
	public void gaussJordan(double matrizA[][], int indice[]) {

		int n = indice.length;
		double temp[] = new double[n];

		for (int i = 0; i < n; ++i) {
			indice[i] = i;
		}

		for (int i = 0; i < n; ++i) {
			double tempA = 0;
			for (int j = 0; j < n; ++j) {
				double tempB = Math.abs(matrizA[i][j]);
				if (tempB > tempA)
					tempA = tempB;
			}
			temp[i] = tempA;
		}

		int k = 0;
		for (int j = 0; j < n - 1; ++j) {
			double pivoteU = 0;
			for (int i = j; i < n; ++i) {

				double pivoteC = Math.abs(matrizA[indice[i]][j]);
				pivoteC /= temp[indice[i]];
				if (pivoteC > pivoteU) {
					pivoteU = pivoteC;
					k = i;
				}
			}

			int tempI = indice[j];
			indice[j] = indice[k];
			indice[k] = tempI;
			for (int i = j + 1; i < n; ++i) {
				double pj = matrizA[indice[i]][j] / matrizA[indice[j]][j];

				matrizA[indice[i]][j] = pj;

				for (int l = j + 1; l < n; ++l) {
					matrizA[indice[i]][l] = matrizA[indice[i]][l] - pj * matrizA[indice[j]][l];
				}
			}
		}
	}
	// FIN GAUSSJORDAN - ESCALONAR MATRIZ
}
