package generales;
import java.util.ArrayList;

import generales.Serpiente;
public class Serpentario {
	private Serpiente [][] serpientes;
	private int [] totales;
	private String [] nombres;
	private int tTipos;
	private final int MAX_TIPO = 10; //Renglones
	private final int MAX_SERP_TIPO = 20; //Columnas
	
	public Serpentario() {
		serpientes = new Serpiente[MAX_TIPO][MAX_SERP_TIPO];
		totales = new int [MAX_TIPO];
		nombres = new String [MAX_TIPO];
		tTipos = 0;
	}
	
	public boolean altaTipo(String tipo) {
		boolean res = false;
		tipo = tipo.toUpperCase();
		if (tTipos < nombres.length) {
			int pos = ManejadorArregloGenerico.buscaSecuencial(nombres, tTipos, tipo);
			if (pos < 0 ) {
				res = true;
				nombres[tTipos] = tipo;
				totales[tTipos] = 0;
				tTipos++;
			}
		}
		
		return res;
	}
	
	public boolean altaSer(String tipo, String alimento) {
	boolean res = false;
	tipo = tipo.toUpperCase();
	int pos =  ManejadorArregloGenerico.buscaSecuencial(nombres, tTipos, tipo);
	if (pos >= 0 && totales[pos] < serpientes[pos].length) {
		serpientes[pos][totales[pos]] = new Serpiente(tipo,alimento);
		totales[pos]++;
		res = true;
	}
	return res;
	}
	
	public String consultaSep(int clave) {
		String res = null;
		int ren, col;
		Serpiente aux = new Serpiente(clave);
		ren = 0;
		while (ren < tTipos && res == null) {
			col = 0;
			while (col <totales[ren] && !serpientes[ren][col].equals(aux))
				col++;
			
			if(col < totales[ren])
				res = serpientes[ren][col].toString();
			ren++;
		}
		
		return res;
	}
	
	public int cuentaAli(String alimento) {
		int count, i, j;
		count = 0;
		for (i = 0; i< tTipos; i++) {
			for(j = 0; j< totales[i]; j++) {
				if(serpientes[i][j].getAlimento().equalsIgnoreCase(alimento))
					count++;
			}
		}
		return count;
	}
	
	public boolean eliminaSerp(int clave, String tipo) {
		boolean res = false;
		int pos = ManejadorArregloGenerico.buscaSecuencial(nombres, tTipos, tipo);
		if (pos >= 0) {
			Serpiente aux = new Serpiente(clave);
			int col = 0;
			while (col < totales[pos] && !serpientes[pos][col].equals(aux));
				col++;
			if (col < totales[pos]) { //Sí está
				res = true;
				ManejadorArregloGenerico.recorreIzq(serpientes[pos], totales[pos], col);
				serpientes[pos][totales[pos]-1] = null;
				totales[pos]--;
			}
		}
		return res;
	}
	

