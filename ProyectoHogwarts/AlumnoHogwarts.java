//Diana Espinosa Ruiz
//Matrícula 000179164
//Proyecto Colegio Hogwarts de Magia y Hechicería

//En esta clase se encuentran los atributos del alumno.
package generales;

import java.util.Random;

public class AlumnoHogwarts implements Comparable <AlumnoHogwarts>{
	private String nombre;
	private String mascota;
	private String patronus;
	private String estatusSangre;
	private String casa;
	private char[] califi;
	/*
	E = Extraordinario 
	S = Supera las expectativas
	A = Aceptable
	I = Insatisfactorio
	D = Desastroso
	T = Troll o Troglodita
	N = No cursa materia
	*/
	private String[] materias;
	
	//Transformaciones, Encantamientos, Pociones, Historia de la Magia, 
	//Defensa Contra las Artes Oscuras, Astronomía y Herbología
	private boolean lentes;
	private int padresMuggles;
	private int puntos;
	private int tM;
	private int clave;
	private final int MAX_MATERIAS = 7;
	private static int generador = 1000;

	

	public AlumnoHogwarts() {
		clave = generador;
		generador++;
		califi =  new char[MAX_MATERIAS];
		materias = new String[MAX_MATERIAS];
		tM = 0;
		puntos = 0;
	}
	
	public AlumnoHogwarts (String nombre) {
		nombre = nombre.toUpperCase();
		this.nombre = nombre;
	}
	
	public AlumnoHogwarts (String nombre, String casa, String mascota, boolean lentes, int padresMuggles) {
		this();
		nombre = nombre.toUpperCase();
		this.nombre = nombre;
		this.casa = casa;
		this.mascota = mascota;
		this.lentes = lentes;
		this.padresMuggles = padresMuggles;
		sacaPatronus();
	
		if (padresMuggles == 0)
			estatusSangre = "Sangre pura";
		else if (padresMuggles == 1)
			estatusSangre = "Sangre mestiza";
		else
			estatusSangre = "Sangre sucia";
	

	}
	
	//Determinar a cuál de las cuatro casas: Gryffindor, Hufflepuff, Ravenclaw o Slytherin
	//debe pertenecer un nuevo estudiante al entrar en Hogwarts

	public boolean altaCalificación (String materia, char cal) {
		
		/*Si escribe la calificación en minúsula la combierte en mayúscula*/
		if(cal >= 'a' && cal <= 'z')
			cal=  (char) (cal - 'a'+ 'A');
		
		boolean res = false;
		if (tM < materias.length) {
			switch (cal) {
				case 'E': res = true;
				setPuntos(puntos + 5);
				break;
				case 'S': res = true;
				setPuntos(puntos + 4);
				break;
				case 'A': res = true;
				setPuntos(puntos + 3);
				break;
				case 'I': res = true;
				setPuntos(puntos + 2);
				break;
				case 'D': res = true;
				setPuntos(puntos + 1);
				break;
				case 'T': res = true;
				setPuntos(puntos + 0);
				break;
				case 'N': res = false;
				break;
				default: throw new NumberFormatException(); //Manda error si la calificación
				//no es ninguna de las opciones
		
			}
			
			
			
			int pos = ManejadorArregloGenerico.buscaSecuencial(materias, tM, materia);
			if (res) {
				
				if (pos < 0) {
					materias[tM] = materia;
					califi[tM] = cal;
					tM++;
				}
				else {
					res = false;
					califi[pos] = cal;
				}
					
			}
			
			
			else if(pos >= 0 && cal == 'N') {
				/*Si la calificación es igual a N y la materia ya existe es que el usuario
				 * se equivocó y dio de alta una materia que no lleva, entonces pone la calificación
				 * en N y actualiza la boleta de calificaiones.
				 */
				materias[pos] = materias[tM - 1];
				califi[pos] = califi[tM - 1];
				materias[tM - 1] = null;
				califi[tM - 1] = '\0';
				tM--;
			}
		
		}

		
		return res;
	}
	
	
	
	public String boletaCalificacion() {
		//Imprime la boleta de calificaciones
		StringBuilder boletaC = new StringBuilder();
		if (tM > 0) {
			for (int i = 0; i < tM; i++) {
				boletaC.append("\n");
				boletaC.append(materias[i]).append(": ").append(califi[i]).append("\n");
			}
		}
		
		else 
			boletaC.append("sin calificaciones.");
		
		
		return boletaC.toString();
	}

	public String informous() {
		//Imprime la información del altumno el .toString
		StringBuilder informacion = new StringBuilder();
		informacion.append("Estudiante: ").append(nombre).append("\nCasa: ").append(casa);
		informacion.append("\nClave única: ").append(clave);
		informacion.append("\nPatronus: ").append(patronus).append("\nEstatus de sangre: ").append(estatusSangre);
		informacion.append("\nMascota: ").append(mascota).append("\nUsa lentes: ").append(lentes);
		informacion.append("\nBoleta de calificaciones: ").append(boletaCalificacion()).append("\n");
		
		
		return informacion.toString();
	}
	
	public void sacaPatronus( ) {
		String[] posiblePatronus = {"Cerdo hormiguero" , "Abraxan caballo con alas", "Sumador", "Tejón", "Murciélago",
				"Basset Hound", "Beagle", "Oso negro","Mamba negro", "Semental negro", "Liebre", "Búho", "Búfalo", 
				"Zopilote", "Cuervo", "Gama", "Delfín", "Galgo", "Dragón", "Ratón de campo", "Águila", "Libélula"};
		Random r = new Random();
		int i = r.nextInt(posiblePatronus.length);
		
		patronus = posiblePatronus[i];
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public String getMascota() {
		return mascota;
	}

	public String getEstatusSangre() {
		return estatusSangre;
	}
	
	public String expectoPatronum() {
		return patronus;
	}
	
	public String getCasa() {
		return casa;
	}
	
	public boolean isLentes() {
		return lentes;
	}


	public int getPadresMuggles() {
		return padresMuggles;
	}

	
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public int gettM() {
		return tM;
	}

	public int getClave() {
		return clave;
	}

	
	
	
	@Override
	public int compareTo(AlumnoHogwarts o) {
		return this.nombre.compareTo(o.nombre);
	
	}

	
	@Override
	public boolean equals(Object  o) {
		AlumnoHogwarts temp=(AlumnoHogwarts)o;
		return this.nombre.equals(temp.nombre);
	}
	
}
