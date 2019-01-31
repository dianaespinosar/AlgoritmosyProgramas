//Diana Espinosa Ruiz
//Matrícula 000179164
//Proyecto Colegio Hogwarts de Magia y Hechicería
//Controlador donde se escribe la información para dar de alta alumnos

package generales;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HogwartsIngresoControlador extends HogwartsIngresoVista {
	
	private static final long serialVersionUID = 1L;
	
	public HogwartsIngresoControlador(String titulo) {
		super(titulo);
		aceptarIngreso.addActionListener(new EscuchadorAceptar());
	}
	
	public class EscuchadorAceptar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
		
			String nombreTxt, mascotaTxt, lentesTxt, padresMugglesTxt = "";
			nombreTxt = nombreJTF.getText().toUpperCase();
			mascotaTxt = mascotaJTF.getText().toUpperCase();
			lentesTxt = lentesJTF.getText();
			boolean lentesBoolean = Boolean.parseBoolean(lentesTxt);
			padresMugglesTxt = padresMugglesJTF.getText();
			
			
			if(!nombreTxt.equals("") && !mascotaTxt.equals("") && !lentesTxt.equals("") && !padresMugglesTxt.equals("")) {
				try {
					int padresMugglesInt = (int) Double.parseDouble(padresMugglesTxt);
					casaJTF.setText(PruebaHogwarts.hogwarts.nuevoIngreso(nombreTxt, mascotaTxt, lentesBoolean, padresMugglesInt));
					setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
				}catch(Exception e)     {
						casaJTF.setText("Error: Datos no válidos");
				
				}
				
			}
			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		
	}

}