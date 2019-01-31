package generales;

import java.util.ArrayList;

public class Galeria {
	private ObraArte[] inventario;
	private int tA;
	
	public Galeria() {
		inventario = new ObraArte[100];
		tA = 0;
	}
	
	public boolean altaPint(String nomAutor, String nomObra, char tecnica, double precioBase, double alto, double ancho, int clave) {
		boolean res;
		if (tA < inventario.length) {
			inventario[tA] = new ObraArte(nomObra, nomAutor, tecnica, precioBase, alto, ancho, clave);
			tA++;
			res = true;
		}
		else 
			res = false;
		return res;
	}
	
	public ArrayList consPyT(String pintor, char tecnica) {
		ArrayList res = new ArrayList();
		
		for (int i = 0; i < tA; i++) {
			
			if (inventario[i].getNomAutor().equals(pintor) && inventario[i].getTecnica() == tecnica ) {
				res.add(inventario[i].toString());
			}
		}
		
		if (res.size() == 0) 
			res = null;
		return res;
	}
	
	public boolean consPrecio (double precio) {
		int i = 0;
		while ( i < tA && inventario[i].calPrecio("", 0) >= precio ) {
			i++;
		}
		
		return i < tA;
	}
}
