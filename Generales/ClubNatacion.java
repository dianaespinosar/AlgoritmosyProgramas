package generales;

public class ClubNatacion {
	private Rectangulo [] albs;
	private int tA;
	
	public ClubNatacion () {
		albs = new Rectangulo[10];
		tA = 0;
	}
	
	public boolean altaAlberca (double b, double h) {
		boolean res;
		if (tA < albs.length) {
			albs[tA] = new Rectangulo (b,h);
			res = true;
			tA++;
		}
		else
			res = false;
		return res;
	}
	
	public double calcCosto (double precio) {
		double areas = 0;
		double costo =0;
		
		for (int i = 0; i < tA; i++) {
			areas = areas + albs[i].calA();
		}
		
		costo = areas * precio;
		return costo;
	}
}
