package generales;

public class OficinaGobierno {
	private String director;
	private double [] pob;
	private String [] nomE;
	private int tE;
	
	public OficinaGobierno() {
		pob = new double [40];
		nomE = new String [40];
		tE = 0;
	}
	
	public OficinaGobierno(String director) {
		this.director = director;
	}
	
	public String encEdoMayorPob () {
		String res;
		int pos;
		pos = ManejadorArreglo.maxValor(pob, tE);
		if (pos >= 0)
			res = nomE[pos];
		else
			res = null;
		return res;
	}
	
	public boolean altaDatos(String est, double hab) {
		boolean res = false;
		int pos;
		if (tE < pob.length) {
			pos = ManejadorArreglo.buscaSecuencialString(nomE, tE, est);
			if (pos < 0) {
				nomE[tE] = est;
				pob[tE] = hab;
				tE++;
				res = true;
			}
		
		}
		 return res;
	}
	
	public double calPromPob () {
		return ManejadorArreglo.promArreglo(pob, tE);
	}
}
