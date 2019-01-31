package Gen;

public class Doctores1 {
	private String nombre;
	private String espec;
	private int cu;
	private static int serie = 0;
	
	public Doctores1() {
		cu = serie;
		serie++;
	}
	
	public  Doctores1(String nombre, String espec) {
		this();
		this.nombre = nombre;
		this.espec = espec;	
	}

	public String getNombre() {
		return nombre;
	}

	public String getEspec() {
		return espec;
	}

	public int getCu() {
		return cu;
	}
	
}
