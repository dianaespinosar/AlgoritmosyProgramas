package generales;

public class Seminario {
	private String []asist;
	private int tA;
	private final int MAX = 20;
	
	public Seminario() {
		asist = new String[MAX];
		tA = 0;
	}
	
	public boolean altaAsist(String nombre) {
		boolean res = false;
		nombre = nombre.toUpperCase();
		if (ManejadorArregloGenerico.insertaOrdena(asist, tA, nombre) > tA) {
			tA++;
			res = true;
		}
		
		return res;
	}
	
	public String generaRepoAsist() {
		return ManejadorArregloGenerico.imprimeArray(asist,tA);
	}
	
	public boolean asistencia(String nombre) {
		boolean res = false;
		nombre = nombre.toUpperCase();
		if (ManejadorArregloGenerico.buscaBin(asist, tA, nombre) >= 0 )
			res = true;
		return res;
	}
	
	public boolean bajaAsist(String nombre) {
		boolean res = false;
		nombre = nombre.toUpperCase();
		if (ManejadorArregloGenerico.eliminaOrdena(asist, tA, nombre) < tA) {
			res = true;
			tA--;
		}
		
		return res;
	}
}
