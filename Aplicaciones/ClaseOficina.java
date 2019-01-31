package aplicaciones;
import generales.OficinaGobierno;
import generales.ManejadorArreglo;
public class ClaseOficina {

	public static void main(String[] args) {
		OficinaGobierno mex = new OficinaGobierno();
		mex.altaDatos("San Luis", 530);
		mex.altaDatos("CdMx", 1230);
		
		System.out.println(mex.calPromPob());
	}

}
