package generales;

public class Serpiente {
	private String tipo;
	private String alimento;
	private static int folio = 100;
	private int clave;
	
	public Serpiente(String tipo, String alimento) {
		clave = folio;
		folio++;
		this.tipo = tipo;
		this.alimento = alimento;
		
	}
	
	public Serpiente(int clave) {
		this.clave = clave;
	}
	
	public boolean equals(Object o) {
		return this.clave ==  ((Serpiente)o).clave;
	}

	public String getTipo() {
		return tipo;
	}

	public String getAlimento() {
		return alimento;
	}
	
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Tipo de animal: ").append(tipo).append("\n").append("Alimento: ").append(alimento);
		return res.toString();
	}
	
	public int compareTo(Object o) {
		return this.clave - ((Serpiente)o).clave;
	}

}
