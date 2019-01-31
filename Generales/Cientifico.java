package generales;

	public class Cientifico {
		private String nombre;
		private String areaEs;



public Cientifico(String nombre, String areaEs) {
	this.nombre = nombre;
	this.areaEs = areaEs;
}

	public Cientifico() {

	}
	public String getNombre() {
		return nombre;
	}

	public String getAreaEs() {
		return areaEs;
	}
	public void setAreaEs(String areaEs) {
		this.areaEs = areaEs;
	}
	boolean equals (Cientifico otro) { 
		if (this.nombre.equals(otro.nombre) && this.areaEs.equals(otro.areaEs)) {
			return true;
		}
		return false;
	}
	public int compareTo (Cientifico o) {

		return (int) (this.nombre.length() - o.nombre.length());
	}
}