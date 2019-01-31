
package generales;
public class Circulo {
	private double radio;
	
	public Circulo() {
	}
	
	public Circulo(double radio) {
		this.radio = radio; 
	}
	
	public double calculaArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public double calculaPerim() {
		return 2 * Math.PI * radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio (double nuevaRadio) {
		radio = nuevaRadio;
	}
	
	public String toString() {
		return "Radio:" + radio;
	}
	
}