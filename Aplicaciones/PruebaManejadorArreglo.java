package aplicaciones;
import generales.ManejadorArreglo;
import java.util.*;
public class PruebaManejadorArreglo {

	public static void main(String[] args) {
		Scanner lee = new Scanner (System.in);
		int i, m;
		double suma;
		double []temp;
		int pos;
		temp = new double [31];
		double [] nuevo;
		nuevo = new double [10];
		nuevo [0] = 2;
		nuevo [1] = 6;
		nuevo [2] = 9;
		/*int n;
		do  {
			System.out.println("Días");
			n = lee.nextInt();
		} while (n < 1 || n > 31);
		
		for (i = 0; i < n; i++) {
			System.out.println("Temperatura" + (i+1));
			temp[i] = lee.nextDouble();
		}
		suma = ManejadorArreglo.sumaArreglo(temp, n);
		System.out.println("Suma: " + suma);
		System.out.println("Promedio: " + ManejadorArreglo.promArreglo(temp, n));
		System.out.println("Máximo Valor: " + ManejadorArreglo.maxValor(temp, n));
		pos = ManejadorArreglo.buscaSecuencial(temp, n, 18);
		if (pos >= 0) {
			System.out.println("Sí hubo temperatura de 18°");
		}
		else
			System.out.println("No hubo día con 18°");
		//System.out.println("Cambio de número " + ManejadorArreglo.eliminarDesord(temp, n, 16) + "\n" + ManejadorArreglo.infoArray(temp, (n - 1)));
		System.out.println("Agregar número: " + ManejadorArreglo.insetaDesord(temp, n , 25) + "\n" + ManejadorArreglo.infoArray(temp, (n+ 1)));
		System.out.println();
		*/
		
		
		m = ManejadorArreglo.insertaOrd(nuevo, 3, 2.9);
		System.out.println("Arreglo: \n" + ManejadorArreglo.infoArray(nuevo, m));
	}

}
