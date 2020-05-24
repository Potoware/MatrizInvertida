/**
 * PARCIAL 3-C ALGEBRA Y PROGRAMACION LINEAL - ALEJANDRO POTOSI MORENO - WILLIAM GUILLERMO ALBARRACIN
 */
package matriz;

import java.util.Scanner;

/**
 * @author apotosimo, walbarracinro
 *
 */
public class Main {

	public static void main(String argv[]) {
		
		Pintar pintar = new Pintar();
		Inversa inversa = new Inversa();
		Scanner teclado = new Scanner(System.in);
		Construir construir = new Construir();
		boolean siguiente = false;
		String menu;
		int tamanoMatriz = 0;
		int matrizA[][];

		// MENU TAMAÑO MATRIZ
		while (siguiente == false) {

			System.out.println("MENU");
			System.out.println("Presione 1 para matriz 2x2");
			System.out.println("Presione 2 para matriz 3x3");
			menu = teclado.nextLine();
			try {
				switch (Integer.parseInt(menu)) {
				case 1:
					tamanoMatriz = 2;
					siguiente = true;
					break;
				case 2:
					tamanoMatriz = 3;
					siguiente = true;
					break;
				default:
					System.out.println("Ingrese una opcion valida");
					siguiente = false;
					break;

				}

			} catch (Exception e) {
				System.out.println("Ingrese una opcion valida");
				siguiente = false;
			}
		}
		
		//FIN MENU TAMAÑO MATRIZ
		
		//ASIGNACION DE VALORES A MATRIZ
		matrizA = new int[tamanoMatriz][tamanoMatriz];

		matrizA = construir.GenerarMatriz(matrizA, "A");
		//FIN ASIGNACION DE VALORES A MATRIZ

//MATRIZ INVERTIBLE INT A DOUBLE
		double matrizInvertible[][] = new double[matrizA.length][matrizA[0].length];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				matrizInvertible[i][j] = matrizA[i][j];
			}
		}
//FIN MATRIZ INVERTIBLE INT A DOUBLE

//INVERTIR MATRIZ
		double matrizInvertida[][] = inversa.invertir(matrizInvertible);
//FIN INVERTIR MATRIZ

		//PINTAR MATRICES
		double matrizIRedondeada[][] = new double[tamanoMatriz][tamanoMatriz];
		for (int i = 0; i < tamanoMatriz; ++i) {
			for (int j = 0; j < tamanoMatriz; ++j)
			{
				matrizIRedondeada[i][j] = Math.round(matrizInvertida[i][j] * 100);
				matrizIRedondeada[i][j] = matrizIRedondeada[i][j] / 100;
			}
		}
		//DETERMINANTE Y INVERSA (SI DETERMINANTE ES 0 NO SE REALIZA EL PROCESO)
		System.out.println();
		Determinante determinante = new Determinante();
		pintar.PintarN(matrizA, "DIGITADA");
		System.out.println();
		if((determinante.determinante(matrizA))==false) {
			System.out.println();
			System.out.println("La matriz no es invertible, porque el determinante es 0");
		}
		else {
		pintar.Pintar(matrizIRedondeada, "INVERTIDA");
		}
		//FINDETERMINANTE Y INVERSA (SI DETERMINANTE ES 0 NO SE REALIZA EL PROCESO)
		//FIN PINTAR MATRICES
	}
}
