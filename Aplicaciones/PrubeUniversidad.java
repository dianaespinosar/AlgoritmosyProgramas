//Diana Espinosa Ruiz 179164
package aplicaciones;

import generales.Universidad;

public class PrubeUniversidad {

	public static void main(String[] args) {
		Universidad itam = new Universidad("itam");
		itam.altaAlum("Diana Espinosa", "Condominio Galaxia", "EIRD000626MSPSZNA6", "Matemáticas Aplicadas");
		itam.altaAlum("Zuriñe Garza", "Jardines del Pedregal", "GARZ990626MCMSZNA6", "Ing. Negocios");
		itam.altaAlum("Naomi Rosales" , "Anaxágoras","GARZ000702MMPSZNA6", "Dirección Financiera");
		itam.altaAlum("Elisa Espinosa", "Cordillera del Marquez", "EIRE000626MSPSZNA6", "Ing. Industrial");
		itam.altaAlum("Fannia Pérez", "Rio Hondo", "PERF000708MSPSZNA6","Administración");
		itam.altaAlum("Aniek Clavel", "Av. Toluca", "CVRA990926MSPSZNA6","Dirección Financiera");
		itam.altaAlum("Alumno Ibero", "Lomas de Santa Fe,", "GTRV990912MSPSZNA6","Relaciones Internacionales");
		
		
		System.out.println("Naomi está: " + itam.buscaAlum("Naomi Rosales"));
		System.out.println("Javier está: " + itam.buscaAlum("Javier"));
		System.out.println("Se subió la calificación: " + itam.altaCali("Diana Espinosa", 9));
		System.out.println("Se subió la calificación: " + itam.altaCali("Diana Espinosa", 9));
		System.out.println("Se subió la calificación: " + itam.altaCali("Diana Espinosa", 8));
		System.out.println("Se subió la calificación: " + itam.altaCali("Diana Espinosa", 10));
		System.out.println("Se subió la calificación: " + itam.altaCali("Javier", 10)); //objetivo regrese false
		System.out.println("Se subió la calificación: " + itam.altaCali("Aniek Clavel", 9));
		System.out.println("Se subió la calificación: " + itam.altaCali("Aniek Clavel", 8));
		System.out.println("Se subió la calificación: " + itam.altaCali("Zuriñe Garza", 10));
		System.out.println("Se cambió la dirección: " + itam.cambiarDomi("Elisa Espinosa", "Condominio Galaxia"));
		System.out.println("Se dio de baja: "  + itam.bajaAlum("Alumno Ibero"));
		System.out.println("Reporte de Diana: " + itam.reporte("Diana Espinosa"));
		System.out.println("Reporte de mayores de 18 años: " + itam.reporteMayorEdad(18));
		System.out.println("Carreras y alumnos en ellas: " + "\n" + itam.personasCarreras());
	}

}
