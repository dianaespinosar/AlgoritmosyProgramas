//Diana Espinosa Ruiz
//Matrícula 000179164
//Proyecto Colegio Hogwarts de Magia y Hechicería
//Clase que contiene los atributos y métodos de la escuela

package generales;

import java.util.ArrayList;

public class Hogwarts {
	private String nombre; //Colegio Hogwarts de Magia y Hechicería
	private String ubicacion; //Reino Unido
	private int tC;
	private AlumnoHogwarts [][] casas;
	private int [] totalesCasa;
	private String [] nombreCasa;
	private final int MAX_CASAS = 4;
	private final int MAX_ALUMNOS = 15;
	
	
	public Hogwarts() {
		casas = new AlumnoHogwarts [MAX_CASAS][MAX_ALUMNOS];
		totalesCasa = new int [MAX_CASAS];
		nombreCasa = new String [MAX_CASAS];
		tC = 0;
	}
	
	public Hogwarts(String nombre, String ubicacion) {
		this();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public boolean altaCasa(String casa) {
		boolean res = false;
		casa = casa.toUpperCase();
		if (tC < nombreCasa.length) {
			totalesCasa[tC] = 0;
			nombreCasa[tC] = casa;
			tC++;
			res = true;
		}
		
		return res;
	}
	
	public String sombreroSeleccionador(String nombre, int padresMuggles) {
		//El sombrero se encarga de decir a que casa deberá pertenecer el alumno
		int inicial = nombre.charAt(0) - 'A';
		
		int largoNombre = nombre.indexOf(" ");
		int largoApellido = nombre.length() - largoNombre - 1;
		int casa = (largoNombre + largoApellido * 3 + (inicial % 7)) % 4;
		String house = null;
		
		switch (casa) {
			case 3: house = "GRYFFINDOR";
			break;
			case 2: house = "SLYTHERIN";
			break;
			case 1: house = "HUFFLEPUFF";
			break;
			case 0: house = "RAVENCLAW";
			break;
			
			
		}
		return house;
	}
	
	public String nuevoIngreso (String nombre, String mascota, boolean lentes, int padresMuggles) {
		//Da de alta al alumno y si es true, regresa  "La casa a la que pertenece el alumno 
		//si no se dio de alta regresa que se trató, pero es un muggle
		StringBuilder admitido = new StringBuilder();
		nombre = nombre.toUpperCase();
		String casa = sombreroSeleccionador(nombre, padresMuggles);
		AlumnoHogwarts pocionMultijugos = new AlumnoHogwarts(nombre);
		int posCasa = ManejadorArregloGenerico.buscaSecuencial(nombreCasa, tC, casa);
		int posAl = ManejadorArregloGenerico.buscaSecuencial(casas[posCasa], totalesCasa[posCasa], pocionMultijugos );
		if (posAl < 0 && posCasa >= 0 && totalesCasa[posCasa] < casas[0].length) {
			casas[posCasa][totalesCasa[posCasa]] = new AlumnoHogwarts(nombre, casa, mascota, lentes, padresMuggles);
			totalesCasa[posCasa]++;
			admitido.append(casa);
		}
		
		else if (posAl >= 0)
			admitido.append("El alumno ya había sido admitido.");
		
		else
			admitido.append("Intento de ").append(casa).append(", pero es un MUGGLE.");
		return admitido.toString();
	}
	
	public String mapaDelMerodeador (String nombre) {
		//Se encarga de dar la ubicación del alumno en String
		nombre = nombre.toUpperCase();
		AlumnoHogwarts pocionMultijugos = new AlumnoHogwarts(nombre);
		//Da en arreglo de 2x1 la ubicación del alumno en la matriz casas
		int[] pos = ManejadorArregloGenerico.encuentraPosicion(casas, MAX_CASAS, MAX_ALUMNOS,pocionMultijugos , totalesCasa);
		StringBuilder ubi = new StringBuilder();
		//pos[0] es la posición de la casa
		//pos[1] es la posición del alumno en la casa
		if (pos[0] == -1)
			ubi.append("No se encontró a ").append(nombre).append(" en Hogwarts. A lo mejor se encuentra en la Sala de los Menesteres.");
			
		else {
			ubi.append("Se encuentra en la Sala Común de ").append(nombreCasa[pos[0]]).append(" en el cuarto ").append(pos[1] + 1);
		}
			
		return ubi.toString();
	}
	
	public String ataqueDementor(String nombre) {
		//Regresa el patronus del alumno
		StringBuilder hechizoDefensiva = new StringBuilder();
		nombre = nombre.toUpperCase();
		AlumnoHogwarts pocionMultijugos = new AlumnoHogwarts(nombre);
		int[] pos = ManejadorArregloGenerico.encuentraPosicion(casas, MAX_CASAS, MAX_ALUMNOS,pocionMultijugos , totalesCasa);
		//pos[0] es la posición de la casa
		//pos[1] es la posición del alumno en la casa
		if (pos[0] == -1)
			hechizoDefensiva.append("No existe la persona atacada por dementores.");
		
		else {
			casas[pos[0]][pos[1]].setPuntos(casas[pos[0]][pos[1]].getPuntos() + 50); //Un ataque Dementor otorga al alumno 50 puntos por valentía
			hechizoDefensiva.append("Expecto Patronum: ").append(casas[pos[0]][pos[1]].expectoPatronum());
		}
		
		return hechizoDefensiva.toString();
	}
	
	public ArrayList estatusSangreLista(String tipoSangre) {
		//Se encarga de dar un ArrayList con el nombre de las personas con un tipo  
		//de esatos de sangre en específico
		tipoSangre = tipoSangre.toLowerCase();
		ArrayList sangre = new ArrayList();
		
		for (int i = 0; i < tC ; i++)
			for(int j = 0; j < totalesCasa[i]; j++)
				if(casas[i][j].getEstatusSangre().equals(tipoSangre))
					sangre.add(casas[i][j].getNombre());
		
		return sangre;
	}
	
	public String estatusSangre(String nombre) {
		String res;
		nombre = nombre.toUpperCase();
		AlumnoHogwarts pocionMultijugos = new AlumnoHogwarts(nombre);
		int[] pos = ManejadorArregloGenerico.encuentraPosicion(casas, MAX_CASAS, MAX_ALUMNOS,pocionMultijugos , totalesCasa);
		if (pos[0] >= 0)
			res = casas[pos[0]][pos[1]].getEstatusSangre();
		else
			res = "No se encontró a " + nombre;
		
		return res;
	}
	
	
	public boolean altaCalificación (String nombre, String materia, char cal) {
		//Se encarga de dar de alta la calificación de un alumno
		nombre = nombre.toUpperCase();
		materia = materia.toUpperCase();
		boolean res = false;
	
		AlumnoHogwarts pocionMultijugos = new AlumnoHogwarts(nombre);
		int[] pos = ManejadorArregloGenerico.encuentraPosicion(casas, MAX_CASAS, MAX_ALUMNOS,pocionMultijugos , totalesCasa);
		StringBuilder ubi = new StringBuilder();
		//pos[0] es la posición de la casa
		//pos[1] es la posición del alumno en la casa
		
		if (pos[0] >= 0 && casas[pos[0]][pos[1]].altaCalificación(materia, cal)) {
			
			res = true;
		}
		
		return res;

	}
	
	public boolean avadaKedavra(String nombre) {
		//Se encarga de dar de baja a los alumnos
		boolean res = false;
		nombre = nombre.toUpperCase();
		AlumnoHogwarts pocionMultijugos = new AlumnoHogwarts(nombre);
		int[] pos = ManejadorArregloGenerico.encuentraPosicion(casas, MAX_CASAS, MAX_ALUMNOS,pocionMultijugos , totalesCasa);
		//pos[0] es la posición de la casa
		//pos[1] es la posición del alumno en la casa
		if(pos[0] >= 0) {
			ManejadorArregloGenerico.recorreIzq(casas[pos[0]], totalesCasa[pos[0]], pos[1]);
			casas[pos[0]][totalesCasa[pos[0] - 1]] = null;
			totalesCasa[pos[0]]--;
			res = true;
		}
		
		return res;
	}
	
	public String copaCasas() {
		StringBuilder res = new StringBuilder();
		int puntosG = 0;
		int puntosS = 0;
		int puntosR = 0;
		int puntosH = 0;
	
		int posG = ManejadorArregloGenerico.buscaSecuencial(nombreCasa, tC, "GRYFFINDOR");
		int posS = ManejadorArregloGenerico.buscaSecuencial(nombreCasa, tC, "SLYTHERIN");
		int posR = ManejadorArregloGenerico.buscaSecuencial(nombreCasa, tC, "RAVENCLAW");
		int posH = ManejadorArregloGenerico.buscaSecuencial(nombreCasa, tC, "HUFFLEPUFF");
		String casaM1;
		String casaM2;
		String casaMP;
		
		for (int i = 0; i < totalesCasa[posG]; i++)
			puntosG += casas[posG][i].getPuntos();
		
		for (int i = 0; i < totalesCasa[posS]; i++)
			puntosS += casas[posS][i].getPuntos();
		
		for (int i = 0; i < totalesCasa[posR]; i++)
			puntosR += casas[posR][i].getPuntos();
		
		for (int i = 0; i < totalesCasa[posH]; i++)
			puntosH += casas[posH][i].getPuntos();
		
		int puntosM1 = Math.max(puntosG, puntosS); 
		int puntosM2 = Math.max(puntosR, puntosH);
		int puntosMP = Math.max(puntosM1, puntosM2);
		
		if ( puntosM1 == puntosG) 
			casaM1 = "GRYFFINDOR";
		else
			casaM1 = "SLYTHERIN";
		
		if ( puntosM2 == puntosR)
			casaM2 = "RAVENCLAW";
		else
			casaM2 = "HUFFLEPUFF";
		
		
		if (puntosMP == puntosM2)
			casaMP = casaM2;
		else
			 casaMP = casaM1;
		
		if (puntosMP == 0) {
			res.append("Ninguna casa tiene puntos.");
		}
		
		else {
			res.append("Gryffindor: ").append(puntosG).append("\nSlytherin: ").append(puntosS).append("\nRavenclaw: ").append(puntosR).append("\nHufflepuff: ").append(puntosH);
			res.append("\nLa Copa de las Casas de este año se la lleva ").append(casaMP).append(" con ").append(puntosMP).append(" puntos.");
		}
		
		return res.toString();
	}
	
	public ArrayList<String> dueñosMascota(String mascota) {
		mascota = mascota.toUpperCase();
		ArrayList<String> dueños = new ArrayList<String>();
		for (int i = 0; i < tC; i++) {
			for (int j = 0; j < totalesCasa[i] ; j++) {
				if (casas[i][j].getMascota().equalsIgnoreCase(mascota))
					dueños.add(casas[i][j].getNombre());
				
			}
		}
		
		return dueños;
	}
	
	public ArrayList<String> integrantesCasa(String casa) {
		casa = casa.toUpperCase();
		ArrayList<String> integrantes = new ArrayList<String>();
		int posC = ManejadorArregloGenerico.buscaSecuencial(nombreCasa, tC, casa);
		
		if (posC >= 0) {
			for (int i = 0; i < totalesCasa[posC]; i++) {
				integrantes.add(casas[posC][i].getNombre());
			}
		}
		
		else
			integrantes.add("No existe la casa " + casa);
		
		
		return integrantes;
	}
	
	public boolean traicion(String casa) {
		//Se encarga de dar de baja una casa
		casa = casa.toUpperCase();
		boolean res = false;
		int posCasa = ManejadorArregloGenerico.buscaSecuencial(nombreCasa, tC, casa);
		
		if(posCasa >= 0) {
			for (int i = 0; i < MAX_ALUMNOS; i++) {
				casas[posCasa][i] = casas[tC - 1][i];
				casas[tC - 1][i] = null;
			}
			totalesCasa[posCasa] = totalesCasa[tC - 1];
			totalesCasa[tC - 1] = (Integer) null;
			res = true;
		}
		
		return res;	
		
	}
	
	public String boletaCalificacion(String nombre) {
		//Imprime la boleta de calificación de un alumno en específico
		nombre = nombre.toUpperCase();
		String res;
		AlumnoHogwarts pocionMultijugos = new AlumnoHogwarts(nombre);
		int[] pos = ManejadorArregloGenerico.encuentraPosicion(casas, MAX_CASAS, MAX_ALUMNOS,pocionMultijugos , totalesCasa);
		//pos[0] es la posición de la casa
		//pos[1] es la posición del alumno en la casa
		if(pos[0] >= 0) {
			res = casas[pos[0]][pos[1]].boletaCalificacion();
		}
		
		else
			res = "No existe el alumno.";
		
		return res;
	}
	
	public String informousHogwarts() {
		//Imprime la información de toda la escuela
		StringBuilder informous = new StringBuilder();
		
		informous.append(nombre).append("\nUbicada en ").append(ubicacion).append(".\n");
		informous.append("\nCasa: \n");
		
		for (int i = 0; i < MAX_CASAS; i++) {
			informous.append(nombreCasa[i]).append(" con ").append(totalesCasa[i]).append(" alumnos.\n");
			informous.append("\n");
			for (int j = 0; j < totalesCasa[i]; j++)
				informous.append(casas[i][j].informous()).append("\n");
			
		}
		
		
		
		return informous.toString();
	}
	
}