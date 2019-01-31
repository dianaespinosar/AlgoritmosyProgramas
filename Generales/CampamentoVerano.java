package generales;

public class CampamentoVerano {
	private Persona [] asist;
	private int tA;
	
	public CampamentoVerano() {
		Persona[] asist = new Persona [100];
		tA = 0;
	}
	
	public boolean altaDatos (String curp) {
		boolean res;
		if (tA < asist.length) {
			asist[tA] = new Persona (curp);
			res = true;
			tA++;
		}
		else
			res = false;
		return res;
	}
	
	public boolean bajaAsist(String curp) {
		boolean res;
		int i = 0;
		while (i < tA && !asist[i].getCurp().equals(curp)) {
			i++;
		}
		
		if (i < tA) {
			asist[i] = asist[tA - 1];
			asist [tA - 1] = null;
			tA --;
			res = true;
		}
		
		else 
			res = false;
		return res;
	}
	
	public int[] cuantaPorEdad() {
		int [] canEdades = {0,0,0,0} ;
		
		for (int i = 0; i < tA; i++) {
			if (asist[i].calEdad(2018) < 13) 
				canEdades[0] ++;
			else if (asist[i].calEdad(2018) < 16)
				canEdades[1] ++;
			else if (asist[i].calEdad(2018) < 21 )
				canEdades[2] ++;
			else
				canEdades[3] ++;
		}
		return canEdades;
	}
}
