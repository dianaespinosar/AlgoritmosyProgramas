package proyectoFinal;

public class Hospital {
	private Medico [] medicos;
	private int tM;
	private String nombre, direccion;
	
	public Hospital (String nom, String dir) {
		nombre = nom;
		direccion = dir;
		medicos = new Medico [50];
		tM = 0;
	}
	
	public boolean altaMedico (String nom) {
		boolean res = false;
		if (tM < medicos.length) {
			Medico a = new Medico (nom);
			medicos [tM] = a;
			res = true;
			tM++;
		}
		return res;
	}
	
	public boolean bajaMedico (int clave) {
		boolean res = false;
		int pos ;
		if (tM > 0) {
			Medico aux  = new Medico (clave);
			pos = MAG.eliminaOrden(medicos, tM, aux);
			if (pos < tM) {
				res =true;
				tM = pos;
			}
		}
		return res;
	}
	
	public int contEspecialidad (String esp) {
		int cont = 0;
		for (int i =0; i<tM;i++) {
			if (medicos[i].tieneEsp(esp))
				cont++;
		}
		return cont;
	}
	
	public String imprimeEspecialidades(int clave) {
		String res;
		int pos = MAG.buscaBin(medicos, tM, clave);
		if (pos >= 0) 
			res = medicos[pos].imprimeEsp();
		else
			res = null;
		return res;
	}
	
	

}