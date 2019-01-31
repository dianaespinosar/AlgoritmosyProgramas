//Diana Espinosa Ruiz 179164
package generales;

public class Alumno {
	private String nombre;
	private String domi;
	private String curp;
	private String carrera;
	private int[] califi;
	private int tMA;
	private final int max = 50;
	
	public Alumno() {
		califi = new int[max];
		tMA = 0;
	}
	public Alumno (String nombre, String domi, String curp, String carrera) {
		this();
		this.nombre = nombre;
		this.carrera = carrera;
		this.domi = domi;
		this.curp = curp;
	}
	
	public String getDomi() {
		return domi;
	}
	public String getCurp() {
		return curp;
	}
	public int gettMA() {
		return tMA;
	}
	public boolean equals (Alumno o) {
		return nombre.equals(o.nombre);
	}
	
	public int compareTo(Alumno o) {
		return nombre.compareTo(o.nombre);
	}
	
	public boolean altaCali(int cal) {
		boolean res = false;
		if(tMA < califi.length) {
			califi[tMA] = cal;
			tMA ++;
			res = true;
		}
		
		return res;
	}
	
	public double promedio() {
		double prom;
		int suma = 0;
		for (int i = 0; i < tMA ; i++) {
			suma = suma + califi[i];
		}
		if (tMA > 0)
			prom = suma / tMA;
		else
			prom = 0;
		return prom;
	}
	
	public int calEdad() {
		int dig1, dig2, añoNac;
		dig1 = curp.charAt(4) - '0';
		dig2 = curp.charAt(5) - '0';
		añoNac = 1900 + dig1 * 10 + dig2;
		if (dig1 == 0 || dig1 == 1)
			añoNac = añoNac + 100;
		
		return 2018 - añoNac;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setDomi(String domi) {
		this.domi = domi;
	}
	
	public String reporte() {
		StringBuilder res = new StringBuilder();
		res.append("\n");
		res.append("Nombre: ").append(nombre).append("\nCURP: ").append(curp);
		res.append("\nTotal materias aprobadas: ").append(tMA).append("\nPromedio: ").append(promedio());
		return res.toString();
	}
	
}
