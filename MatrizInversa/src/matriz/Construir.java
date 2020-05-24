/**
 * PARCIAL 3-C ALGEBRA Y PROGRAMACION LINEAL - ALEJANDRO POTOSI MORENO - WILLIAM GUILLERMO ALBARRACIN
 */
package matriz;

import java.util.Scanner;

/**
 * @author apotosimo, walbarracinro
 *
 */
public class Construir {

	public int[][] GenerarMatriz(int matriz[][], String lMatriz) {
		
		// DEFINICION CLASES Y VARIABLES GENERALES
		Scanner teclado = new Scanner(System.in);
		int nFilas = matriz.length;
		int nColumnas = matriz[0].length;
		String tempDatos;
		Validar validar = new Validar();
		// FIN DEFINICION CLASES Y VARIABLES GENERALES
		
		System.out.println("\nA continuacion ingrese los valores que desea asignar a la matriz "+lMatriz);
		// INSERTAR VALORES MATRIZ
		// RECORRIDO FILAS
		for (int ifil = 0; ifil < nFilas; ifil++) {

			// RECORRIDO COLUMNAS
			for (int jcol = 0; jcol < nColumnas; jcol++) {

				// SOLICITAR Y VERIFICAR VALORES
				System.out.println("_____________\nValor para Fila " + (ifil + 1) + " Columna " + (jcol + 1));
				tempDatos = teclado.nextLine();
				validar.validadorDatos(tempDatos);

				if (validar.informacion == "error") {
					System.out
							.println("No se pudo cargar el valor, debido a que no es de tipo int. Intente nuevamente");
					jcol = jcol - 1;

				} else {
					matriz[ifil][jcol] = validar.valorValidado;
					System.out.println("Se asigno el valor indicado\n");

				}
				// FIN SOLICITAR Y VERIFICAR VALORES
			}
			// FIN RECORRIDO COLUMNAS

		}
		// FIN RECORRIDO FILAS
		// FIN INSERTAR VALORES MATRIZ

		return matriz;

	}
	
	
}
