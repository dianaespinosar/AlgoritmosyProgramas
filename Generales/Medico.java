package proyectoFinal;

public class Medico implements Comparable <Medico>{
	private String nombre;
	private String []especialidades;
	private int tE;
	private int clave;
	private static int folio = 100;
	
	public Medico (String nom){
		especialidades = new String [10];
		nombre = nom;
		clave = folio;
		tE =0;
		folio = folio + 10;
	}
	public Medico (int clave) {
		this.clave = clave;
	}
	
	public boolean altaEsp (String esp) {
		boolean res = false;
		if (tE < especialidades.length) {
			res = true;
			especialidades[tE] = esp;
			tE++;
		}
		return res;	
	}
	
	public boolean tieneEsp (String esp) {
		boolean res = false;
		int index = MAG.buscaSec(especialidades, tE, esp);
		if (index >= 0)
			res = true;
		return res;
	}
	
	public String imprimeEsp () {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < tE; i ++)
			res.append(especialidades[i]).append(" ");
		return res.toString();
	}

	public String getNombre() {
		return nombre;
	}

	public int gettE() {
		return tE;
	}

	public int getClave() {
		return clave;
	}
	
	public int compareTo(Medico a) {
		return this.clave - a.clave;
	}
	public boolean equals (Object o) {
		return this.clave == ((Medico)o).clave;
	}
	
	
}
