package generales;

public class ObraArte {
	private String nomAutor, nomObra;
	private char tecnica;
	private double precioBase, alto, ancho;
	private int clave;
	private static int serie = 1;

	public ObraArte() {
	}
	
	public ObraArte(String nomAutor, String nomObra, char tecnica, double precioBase, double alto, double ancho, int clave) {
		this.nomAutor = nomAutor;
		this.nomObra = nomObra;
		this.tecnica = tecnica;
		this.precioBase = precioBase;
		this.alto = alto;
		this.ancho = ancho;
		this.clave = serie;
		serie++;
	}
	
	
	public double calPrecio(String autor, double des) {
		double precioVenta;
		switch (tecnica) {
		
		case 'o' : precioVenta = precioBase * 1.25;
		case 'O' : precioVenta = precioBase * 1.2;
		break;
		
		case 'a' : precioVenta = precioBase * 1.2;
		case 'A' : precioVenta = precioBase * 1.2;
		break;
		
		case 'G' : precioVenta = precioBase * 1.18;
		case 'g' : precioVenta = precioBase * 1.18;
		break;
		
		default: precioVenta = precioBase * 1.1;
		}
		if (ancho * alto > 14000) {
			precioVenta = precioVenta * 1.1;
		}
		
		if (nomAutor.equals(autor) ) {
			precioVenta = precioVenta * (1 - des);
		}
		
		return precioVenta;
	}

	public String getNomAutor() {
		return nomAutor;
	}

	public String getNomObra() {
		return nomObra;
	}

	public char getTecnica() {
		return tecnica;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String toString() {
		return "Obra: " + nomObra + "\nAutor: " + nomAutor ;
	}
	public boolean equals(ObraArte otra) {
		return this.clave == otra.clave;
	}
	public int compareTo (ObraArte otra) {
		return this.clave - otra.clave;
	}
}	
	
	