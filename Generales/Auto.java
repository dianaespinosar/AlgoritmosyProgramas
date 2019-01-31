package generales;

public class Auto implements Comparable <Auto> {

	private String marca;
	private char color;
	private double precio;
	private int a�o;
	private int clave;
	static int serie = 1000;
	
	
	public Auto() {
		clave = serie;
		serie ++;
	}
	
	public Auto (String marca, char color, int a�o, double precio) {
		this();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		this.a�o = a�o;
	}
	
	
	public boolean equals (Object o) {
		return this.clave == o.clave;
	}
	
	public int compareTo(Auto o) {
		return this.clave-o.clave;
	}
	
	
	
	public String reporte() {
		StringBuilder res = new StringBuilder();
		res.append("\n");
		res.append("Marca: ").append(marca).append("\nA�o: ").append(a�o);
		res.append("\nColor ").append(color).append("\nclave ").append(clave);
		return res.toString();
	}

	public String getMarca() {
		return marca;
	}

	public char getColor() {
		return color;
	}

	public double getPrecio() {
		return precio;
	}

	public int getA�o() {
		return a�o;
	}
	
}