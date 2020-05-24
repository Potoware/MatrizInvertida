/**
 * PARCIAL 3-C ALGEBRA Y PROGRAMACION LINEAL - ALEJANDRO POTOSI MORENO - WILLIAM GUILLERMO ALBARRACIN
 */
package matriz;

/**
 * @author apotosimo, walbarracinro
 *
 */
public class Pintar {
	
	public void Pintar(double[][] matriz, String lMatriz) {
		try {
		int nFilas = matriz.length;
		int nColumnas = matriz[0].length;
		
	// PINTAR MATRIZ
		System.out.println("\nMatriz " + lMatriz);
		// RECORRIDO FILAS
		for (int ifil = 0; ifil < nFilas; ifil++) {
			System.out.print("|");
			// RECORRIDO COLUMNAS
			for (int jcol = 0; jcol < nColumnas; jcol++) {
				System.out.print(matriz[ifil][jcol]+" ");
				if (jcol != nFilas - 1) {
					System.out.print("\t");
				}
			}
			// FIN RECORRIDO COLUMNAS
			System.out.println("|");
		}
		// FIN RECORRIDO FILAS

		// FIN PINTAR MATRIZ
	}catch(Exception e) {
		System.out.println("No se puede pintar la matriz");	
	}
		
	}

	public void PintarN(int[][] matriz, String lMatriz) {
		try {
		int nFilas = matriz.length;
		int nColumnas = matriz[0].length;
		
	// PINTAR MATRIZ
		System.out.println("\nMatriz " + lMatriz);
		// RECORRIDO FILAS
		for (int ifil = 0; ifil < nFilas; ifil++) {
			System.out.print("|");
			// RECORRIDO COLUMNAS
			for (int jcol = 0; jcol < nColumnas; jcol++) {
				System.out.print(matriz[ifil][jcol]+" ");
				if (jcol != nFilas - 1) {
					System.out.print("\t");
				}
			}
			// FIN RECORRIDO COLUMNAS
			System.out.println("|");
		}
		// FIN RECORRIDO FILAS

		// FIN PINTAR MATRIZ
	}catch(Exception e) {
		System.out.println("No se puede pintar la matriz");	
	}
		
	}
	
}
