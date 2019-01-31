package generales;

import java.io.File;
import java.util.Scanner;

public class Compañia {
	private String nom;
	private double[][] ventas;
	private final int MESES = 12;
	private final int DEPTOS = 4;
	
	public Compañia() {
		ventas = new double[MESES][DEPTOS];  //meses en Y deptos en X
	}
	
	public Compañia(String nom) {
		this();
		this.nom = nom;
	}
	
	public int encMesMaxUta(int dep) {
		int mes;
		if (dep >= 1 && dep <= DEPTOS) {
			mes = ManejadorArregloBidimensional.mayorCol(ventas, MESES, dep) + 1;
		}
		else 
			mes = -1;
		return mes;
	}
	
	public double promMes(int mes) {
		double prom;
		if(mes>= 1 && mes <= MESES) {
			prom = ManejadorArregloBidimensional.sumaRen(ventas, mes, DEPTOS) / DEPTOS;
		}
		else 
			prom = -1;
		return prom;
	}
	
	public boolean cargaDatos(String nom) {
		boolean res;
		try {
			File file = new File(nom);
			Scanner lee = new Scanner(file);
			int i,j;
			for(i = 0; i< MESES; i++) {
				for(j = 0; j < DEPTOS; j++) {
					ventas[i][j] = lee.nextDouble();
				}
			}
			res = true;
			lee.close();
		} catch (Exception e) {
			res = false;
		}
		return res;
	}
	
}
