package generales;

public class Persona {
	private String curp;
	private int a�oNac;
	
	public Persona ( String curp) {
		this.curp = curp;
	}
	
	public int calEdad(int a�oAct) {
		int dig1, dig2;
		dig1 = curp.charAt(4) - '0';
		dig2 = curp.charAt(5) - '0';
		a�oNac = 1900 + dig1 * 10 + dig2;
		if (a�oNac >= 100) 
			a�oNac = a�oNac + 100;
		return a�oAct - a�oNac;
	}
	
	public String genero() {
		String genero;
		if (curp.charAt(10) == 'M') {
			genero = "Mujer";
		}
		
		else 
			genero = "Hombre";
		return genero;
	}
	
	public String nacionalidad( ) {
		String nacionalidad;
		if (curp.charAt(11) == 'N' && curp.charAt(12) == 'E') {
			nacionalidad = "Nacido en el Extranjero";
		}
		
		else 
			nacionalidad = "Nacido en M�xico";
		return nacionalidad;
	}
	
	public String getCurp() {
		return curp;
	}
}
