package aplicaciones;
import java.util.Scanner;
public class Partidos {

	public static void main(String[] args) {
		 int pan, pri,prd, mor, votos, vAbs, i, n, voto, max;  
		 char votar; 
		 Scanner lee = new Scanner(System.in); 
		 pan = 0; 
		 pri = 0; 
		 prd = 0; 
		 mor = 0; 
		 votos = 0; 
		 vAbs = 0; 
		 
		 System.out.println("Ingresa participantes" ); 
		 n = lee.nextInt(); 
		 
		 for (i = 0; i < n; i++) { 
			 System.out.println("¿Vas a votar?" ); 
			 votar = lee.next().charAt(0); 
		 
		 	if ( votar == 'S' || votar == 's') { 
		 		System.out.println("¿Por qué partido? "); 
		 		voto = lee.nextInt(); 
		 		switch (voto) { 
		 		case 1: pan = pan + 1; 
		 		break; 
		 		case 2: pri = pri + 1; 
		 		break; 
		 		case 3: prd = prd + 1; 
		 		break;		 
		 		case 4: mor = mor+ 1; 
		 		break; 
		 		}	 
			 votos = votos + 1;
			} 
		 	else {
		 		vAbs = vAbs + 1; 
			}
		 	
		 }
		 
		 System.out.println("\n% de Abstinencia:  " + vAbs * 100 / n); 
		 if (votos != 0 ) { 
			 System.out.println("\nPorcentaje de cada partido: "); 
			 System.out.println("\nPAN " + pan * 100 / votos + "%"); 
			 System.out.println("\nPRI " + pri * 100 / votos + "%"); 
			 System.out.println("\nPRD " + prd * 100 / votos + "%"); 
			 System.out.println("\nMOR " + mor * 100 / votos + "%"); 
			 max = Math.max(Math.max(pan, pri), Math.max(prd, mor)); 
			 System.out.println("\nFavorito: "); 
			 
			 if (max == pan) 
				 System.out.println("PAN ");
			 if (max == pri)
				 System.out.println("PRI "); 
			 if (max == prd) 
				 System.out.println("PRD "); 
			 if (max == mor) 
				 System.out.println("MOR "); 
			 if (pan == 0) 
				 System.out.println("\nPAN tiene 0 votos"); 
			 if (pri == 0) 
				 System.out.println("\nPRI tiene 0 votos"); 
			 if (prd == 0) 
				 System.out.println("\nPRD tiene 0 votos"); 
			 if (mor == 0) 
				 System.out.println("\nMOR tiene 0 votos");
		}
		 else { 
			 System.out.println("\nNadie voto ");
			 System.out.println("\nNinguno es favorito "); 
			 System.out.println("\nPAN, PRI, PRD y MORENA obtuvieron 0 votos");

		 }
	}

}
