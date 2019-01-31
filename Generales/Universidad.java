//Diana Espinosa Ruiz 179164
package generales;

public class Universidad {

	private String nomUni;
	private Alumno[] alum;
	private int tA;
	private final int max_alum = 100;
	private String[] carrera;
	private int tC;
	private final int max_carreras = 10;
	private int[] alumnosCarrera;
	
	public Universidad() {
		alum = new Alumno[max_alum];
		tA = 0;
		carrera = new String[max_carreras];
		alumnosCarrera = new int[max_carreras];
		tC = 0;
	}
	
	public Universidad(String nomUni) {
		this();
		this.nomUni = nomUni;
		
	}
	public String getNomUni() {
		return nomUni;
	}
	
	public int getTA() {
		return tA;
	}
	
	public boolean altaAlum (String nombre, String domi, String curp, String carrera) {
		boolean res = false;
		if (tA < alum.length) {
			int pos;
			pos = buscaAlum(nombre);
			if (pos <= 0) {
				pos = pos*-1 - 1;
				for (int i = tA; i > pos; i--) {
					alum[i] = alum[i-1];
				}
				
				alum[pos] = new Alumno(nombre,domi, curp, carrera);
				tA++;
				res = true;
			}
		}
		
		return res;
	}
	
	//busca si el alumno está o no está
	public int buscaAlum(String nom) {
		Alumno a = new Alumno (nom, "", "", "");
		int izq, der, cen;
		izq = 0;
		der = tA - 1;
		cen = der / 2;
		
		while (izq <= der && !alum[cen].equals(a)) {
			if (alum[cen].compareTo(a) > 0)
				der = cen - 1;
			else
				izq = cen + 1;
			cen = (izq + der) / 2;	
		}
		
		if (izq > der) 
			cen = (izq  + 1) * -1;
			
		return cen;
		
	}
	
	public boolean altaCali(String nombre, int cal) {
		boolean res = false;
		if (cal >= 6 ) {
			int pos;
			pos = buscaAlum(nombre);
			if (pos >= 0) {
				res = alum[pos].altaCali(cal);
			}
		}
		return res;
	}
	
	public boolean cambiarDomi(String nombre, String domi) {
		boolean res = false;
		int pos = buscaAlum(nombre);
		if (pos >= 0) {
			alum[pos].setDomi(domi);
			res = true;
		}
		return res;
	}
	
	public boolean bajaAlum (String nombre ) {
		boolean res = false;
		int pos = buscaAlum(nombre);
			if (pos >= 0) {
				for (int i = pos; i < tA; i++) {
					alum[i] = alum[i+1];
				}
				tA--;
				res = true;
			}
		
		return res;
	}
	
	public String reporte(String nombre) {
		String res;
		int pos = buscaAlum(nombre);
		if (pos >= 0) {
			res = alum[pos].reporte();
		}
		else
			res = "Alumno no encontrado";
		return res;
	}
	
	public String reporteMayorEdad(int edad) {
		StringBuilder res = new StringBuilder();
		
		for(int i = 0; i < tA; i++) {
			if(alum[i].calEdad() > edad) {
				res.append(alum[i].reporte()).append("\n");
			}
		}
		
		
		return res.toString();
	}
	
	//mi inciso dice cuántas personas hay por carrera
	public void altaCarrera() {
		int j;
		if(tC < carrera.length) {
			for (int i = 0; i < tA; i++) {
				j = 0;
				while(j < tC && !alum[i].getCarrera().equals(carrera[j]))
						j++;
				
				if (j == tC) {
					carrera[tC] = alum[i].getCarrera();
					alumnosCarrera[tC] = 1;
					tC++;
				}
					
				else {
					alumnosCarrera[j]++;
				}
			}
		}
	}
	
	public String personasCarreras() {
		altaCarrera();
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < tC; i++) {
			res.append(carrera[i]).append("tiene ").append(alumnosCarrera[i]).append("\n");
		}
		return res.toString();
	}
}
