//Diana Espinosa Ruiz
//Matrícula 000179164
//Proyecto Colegio Hogwarts de Magia y Hechicería
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
					
					PruebaHogwarts.hogwarts.altaCalificación(nombreTxt, "Astronomía", astronomiaTxt);
					PruebaHogwarts.hogwarts.altaCalificación(nombreTxt, "Defensa Contra las Artes Oscuras", dCAOscurasTxt);
					PruebaHogwarts.hogwarts.altaCalificación(nombreTxt, "Encantamientos", encantamientosTxt);
					PruebaHogwarts.hogwarts.altaCalificación(nombreTxt, "Herbología", herbologiaTxt);
					PruebaHogwarts.hogwarts.altaCalificación(nombreTxt, "Historia de la Magia", hMagiaTxt);
					PruebaHogwarts.hogwarts.altaCalificación(nombreTxt, "Pociones", pocionesTxt);
					PruebaHogwarts.hogwarts.altaCalificación(nombreTxt, "Transformaciones", transTxt);
					aceptarJTF.setText("Calificaciones actualizadas.");
					JOptionPane.showMessageDialog(null, "Boleta de calificaciones de " + nombreTxt + "\n" + PruebaHogwarts.hogwarts.boletaCalificacion(nombreTxt));
					setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
				} catch(Exception e)     {
					aceptarJTF.setText("Error: Datos no válidos");
				}
			}
			else 
				aceptarJTF.setText("No se encontró al alumno.");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
		}

	
	}


}
