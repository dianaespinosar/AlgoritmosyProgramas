	//Diana Espinosa Ruiz
//Matrícula 000179164
//Proyecto Colegio Hogwarts de Magia y Hechicería

package generales;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class  HogwartsIngresoVista extends JFrame{
	private static final long serialVersionUID = 1L;
	protected JTextField nombreJTF, mascotaJTF, lentesJTF, padresMugglesJTF, casaJTF;
	private JLabel nombreL, mascotaL, lentesL, padresMugglesL;
	protected JButton aceptarIngreso;
	
	public HogwartsIngresoVista(String titulo) {
		super(titulo);
		nombreJTF = new JTextField(16);
		mascotaJTF = new JTextField(16);
		lentesJTF = new JTextField(16);
		padresMugglesJTF = new JTextField(16);
		casaJTF = new JTextField(16);
		nombreL = new JLabel("Nombre del alumno: ");
		mascotaL = new JLabel("Mascota: ");
		lentesL = new JLabel("¿Usa lentes?");
		padresMugglesL = new JLabel("Cantidad de padres muggles: ");
		aceptarIngreso = new JButton("Sombrero Seleccionador");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,2)); //matriz - indica los renglones y las columnas
		Border borde = BorderFactory.createEmptyBorder(5, 5, 5,5); //le hace un borde, margen
		
		panel.setBorder(borde); //asigna panel el borde
		panel.add(nombreL);//agrega los datos del panes
		panel.add(nombreJTF);//tiene que ir en orden primero la etiqueta y luego el campo
		panel.add(mascotaL);
		panel.add(mascotaJTF);
		panel.add(lentesL);
		panel.add(lentesJTF);
		panel.add(padresMugglesL);
		panel.add(padresMugglesJTF);
		panel.add(aceptarIngreso);
		panel.add(casaJTF);
		this.add(panel);
		this.setBounds(500, 200,400,300); //tamaño de la ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //se cierra automaticamente
		this.setVisible(true);//para que podamos verlo
	}



}
