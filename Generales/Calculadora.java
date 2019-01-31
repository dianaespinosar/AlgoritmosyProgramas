package generales;

public class Calculadora {
	private int a;
	private int b;
	
	public Calculadora() {
		
	}
	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static double calPot(double num, int i) {
		double potencia = 1;
		int pow;
		
		for (pow = 1; pow <= i; pow ++) {
			potencia = potencia * num;
		}
		return potencia;
		
	}
	
	public static String generaCN (int n) {
		StringBuilder cad = new StringBuilder();
		int suma = 0;
		int impar = 1;
		int i, j;
		
		for(i = 1; i<=n; i++) {
			for (j = i; j <= i; j++) {
				suma = suma + impar;
				impar = impar + 2;
			}
	}
	cad.append(i).append("n3 = ").append(suma).append("'\n");
	return cad.toString();
	}
	
	public static int calMCD(int A, int B) {
		int Dividendo;
	    int Divisor;
	    int Resto;
	 
	    {
	    System.out.println("Introduce el valor de A y B");
	    if(A > B)
	        {
	            Dividendo = A;
	            Divisor = B;
	        }
	    else
	        {
	            Dividendo = B;
	            Divisor = A;
	        }
	    Resto = Dividendo  %  Divisor;
	    do
	        {
	            Dividendo = Divisor;
	            Divisor = Resto;
	            Resto = Dividendo  %  Divisor;
	        }
	    while (Resto!= 0);
	 
	System.out.println("El MCD de A y B es" +Divisor);
	    }
	return Divisor;
	 
	}
}
