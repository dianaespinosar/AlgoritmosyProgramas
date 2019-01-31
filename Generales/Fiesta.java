package generales;

import java.util.ArrayList;

public class Fiesta {
	private String fecha;
	private String lugar;
	private String[] nomInv;
	private int tI;
	 
	public Fiesta() {
		nomInv = new String[100];
		tI = 0;
	}
	
	public Fiesta(String fecha, String lugar) {
		this.fecha = fecha;
		this.lugar = lugar;
		nomInv = new String[100];
		tI = 0;
	}
	
	public boolean altaDatos(String nombre) {
		boolean res = false;
		if (tI < nomInv.length) {
			nombre = nombre.toUpperCase();
			int pos;
			pos = buscaInv(nombre);
			if (pos < 0) {
				pos = pos * (-1) - 1;
				recorreDer(pos);
				nomInv[pos] = nombre;
				res = true;
				tI++;
			}
		
		}
		return res;
		
	}
	
	public int buscaInv(String nombre) {
		int i = 0;
		while (i < tI && nombre.compareTo(nomInv[i]) > 0)
			i++;
		if (i == tI || nombre.compareTo(nomInv[i]) < 0) {
			i = (i + 1) * -1;
		}
		
		return i;
	}
	
	private void recorreDer (int pos) {
		for (int i = tI; i >  pos; i--) {
			nomInv [i] = nomInv[i-1];
		}
	}
	
	public boolean bajaInv (String nombre) {
		boolean res;
		nombre = nombre.toUpperCase();
		int pos = buscaInv(nombre);
		if (pos >= 0) {
			recorreIzq(pos);
			tI--;
			res = true;
		}
		
		else 
			res = false;
		return res;
	}
	
	private void recorreIzq(int pos) {
		for (int i = pos; i <tI; i++) {
			nomInv [i] = nomInv[i+1];
		}
	}
	
	public String getPrimerInv () {
		String res;
		if (0 < tI)
			res = nomInv[0];
		else
			res = null;
		return res;
	}
	
	public String lista() {
		StringBuilder lista = new StringBuilder();
		
		lista.append("Fecha: ").append(fecha).append(" Lugar: ").append(lugar);
		
		for (int i = 0; i < tI; i++) {
			lista.append(nomInv[i]);
		}
		
		return lista.toString();
	}
	
	public ArrayList <String> generaListaPorApellido(String apell) {
		ArrayList lista = new ArrayList();
		String aux = nomInv[0].substring(0, nomInv[0].indexOf(" "));
		int i = 0;
		int n = apell.length();
		int k = tI - 1;
		while (i < k && apell.compareTo(aux) >=0) {
			
			if (apell.equals(aux)) {
				lista.add(nomInv[i]);
			}
			i++;
			aux = nomInv[i].substring(0, nomInv[i].indexOf(" "));
		}
		
		if (aux.equals(apell))
			lista.add(nomInv[i]);
		return lista;
	}
}
