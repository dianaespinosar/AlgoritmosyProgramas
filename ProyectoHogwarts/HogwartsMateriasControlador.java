//Diana Espinosa Ruiz
//Matr�cula 000179164
//Proyecto Colegio Hogwarts de Magia y Hechicer�a
//Controlador donde se ingresan las calificaciones del alumno
package generales;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HogwartsMateriasControlador extends HogwartsMateriasVista {
	private static final long serialVersionUID = 1L;
	
	public HogwartsMateriasControlador(String titulo) {
		super(titulo);
		aceptar.addActionListener(new EscuchadorAceptar());
	}
	
	private class EscuchadorAceptar implements ActionListener{
		
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			String nombreTxt = "";
			char hMagiaTxt, astronomiaTxt, herbologiaTxt, encantamientosTxt, transTxt, dCAOscurasTxt, pocionesTxt = '\0';		
			nombreTxt = alumnoJTF.getText().toUpperCase();
			hMagiaTxt = hMagiaJTF.getText().toUpperCase().charAt(0);
			astronomiaTxt = astronomiaJTF.getText().toUpperCase().charAt(0);
			herbologiaTxt = herbologiaJTF.getText().toUpperCase().charAt(0);
			encantamientosTxt = encantamientosJTF.getText().toUpperCase().charAt(0);
			transTxt = transJTF.getText().toUpperCase().charAt(0);
			dCAOscurasTxt = dCAOscurasJTF.getText().toUpperCase().charAt(0);
			pocionesTxt = pocionesJTF.getText().toUpperCase().charAt(0);
			
			char pos = PruebaHogwarts.hogwarts.mapaDelMerodeador(nombreTxt).charAt(0);
			
			if(pos == 'S') {
				
				try {
					
					PruebaHogwarts.hogwarts.altaCalificaci�n(nombreTxt, "Astronom�a", astronomiaTxt);
					PruebaHogwarts.hogwarts.altaCalificaci�n(nombreTxt, "Defensa Contra las Artes Oscuras", dCAOscurasTxt);
					PruebaHogwarts.hogwarts.altaCalificaci�n(nombreTxt, "Encantamientos", encantamientosTxt);
					PruebaHogwarts.hogwarts.altaCalificaci�n(nombreTxt, "Herbolog�a", herbologiaTxt);
					PruebaHogwarts.hogwarts.altaCalificaci�n(nombreTxt, "Historia de la Magia", hMagiaTxt);
					PruebaHogwarts.hogwarts.altaCalificaci�n(nombreTxt, "Pociones", pocionesTxt);
					PruebaHogwarts.hogwarts.altaCalificaci�n(nombreTxt, "Transformaciones", transTxt);
					aceptarJTF.setText("Calificaciones actualizadas.");
					JOptionPane.showMessageDialog(null, "Boleta de calificaciones de " + nombreTxt + "\n" + PruebaHogwarts.hogwarts.boletaCalificacion(nombreTxt));
					setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
				} catch(Exception e)     {
					aceptarJTF.setText("Error: Datos no v�lidos");
				}
			}
			else 
				aceptarJTF.setText("No se encontr� al alumno.");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
		}

	
	}


}
