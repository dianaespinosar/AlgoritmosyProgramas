package aplicaciones;

import java.util.ArrayList;

public class Primos {
	
	public static ArrayList datosPosiciones (double [] array) {
		ArrayList res = new ArrayList();
		int n = array.length;
		for (int i = 2; i < n; i++ ) {
			for(int j = 2 * i; j < n; j += i) {
				array[j] = 0;
			}
					
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
