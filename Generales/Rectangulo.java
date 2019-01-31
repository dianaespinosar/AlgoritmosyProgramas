package generales;

public class Rectangulo {
	private double base;
	private double altura;
		
	public Rectangulo() {

	}
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura= altura;
	}
	
	public double calA() {
		return base * altura;
	}
	
	public double calP() { 
		return 2 * (base + altura);
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double nuevaBase) {
		base = nuevaBase;
	}
	
	public void setAltura (double nuevaAltura) {
		altura = nuevaAltura;
	}
	
	public String toString() {
		return "Base: " + base + "\nAltura: "+ altura ;
	}
}