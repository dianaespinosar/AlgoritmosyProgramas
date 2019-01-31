package generales;

public class LoteAcciones {
	private int dia;
	private int numLote;
	private static int folio = 500;
	
	public LoteAcciones(int dia) {
		this.dia = dia;
		numLote = folio;
		folio++;
	}
}
