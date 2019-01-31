package generales;

public class Zoologico1 {
	private Animales [] animal;
	private int tA;
	private String nombre;
	private String dirección;
	
	public Zoologico1 () {
		animal = new Animales [20];
		tA = 0;
	}
	public Zoologico1 (String nombre, String direccion) {
		animal = new Animales [20];
		tA = 0;
	}
	
	public boolean altaDatos(String nombre, int edad, String raza) {
		boolean res;
		if (tA < animal.length) {
			animal[tA] = new Animales (nombre, edad, raza);
			res = true;
			tA++;
		}
		
		else
			res = false;
		return res;
	}
	
	public double promedioEdades() {
		double suma = 0;
		double prom;
		for (int i = 0; i < tA; i ++) {
			suma = animal[i].getEdad() + suma;
		}
		
		prom = suma / tA;
		
		return prom;
	}
}
