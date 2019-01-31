package generales;
import generales.ManejadorArregloGenerico;
public class AgenciaAutomotriz {
	private String nombre;
	private String dir;
	private Auto[] auto;
	private int tA;
	private final int max_autos = 100;
	private String[] marcas;
	private int tM;
	private final int max_marcas = 10;
	private int[] autosMarca;
	
	
	public AgenciaAutomotriz() {
		auto = new Auto[max_autos];
		tA = 0;
		marcas = new String[max_marcas];
		tM = 0;
		autosMarca = new int[max_marcas];
	}
	
	public AgenciaAutomotriz(String nombre, String dir) {
		this();
		this.nombre = nombre;
		this.dir = dir;
		
	}
	
	public boolean altaAuto (String marca, char color, int año, double precio) {
		Auto auto1 = new Auto(marca, color, año, precio);
		boolean res = false;
		marca = marca.toUpperCase();
		if (ManejadorArregloGenerico.insertaOrdena(auto, tA, auto1) > tA) {
			tA++;
			res = true;
			altaMarca(marca);
		}
		
		return res;
		
	}
	
	public void altaMarca(String marca) {
		ManejadorArregloGenerico.insertaOrdena(marcas, tM, marca);
	}
	
	public String autosMarca() {
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < tM; i++) {
			res.append(marcas[i]).append("tiene ").append(autosMarca[i]).append("\n");
		}
		return res.toString();
	}
}

