package generales;

public class Animales {
	private String nombre;
	private int edad;
	private  String raza;
	
	public Animales() {
		
	}
	
	public Animales(String nombre, int edad, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getRaza() {
		return raza;
	}
	
}
