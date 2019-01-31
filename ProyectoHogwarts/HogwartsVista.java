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

public class  HogwartsVista extends JFrame{
	private static final long serialVersionUID = 1L;
	protected JButton nuevoIngreso, altaCalificacion, copaCasa, integrantesC, sangre, mascota, informous, ataqueDementor, mapaDelMerodeador,avadaKedavra ;


	public HogwartsVista (String titulo) {
		super(titulo); 

		nuevoIngreso = new JButton ("Nuevo ingreso");
		altaCalificacion = new JButton ("Calificaciones");
		copaCasa = new JButton ("Copa de las Casas");
		integrantesC = new JButton("Integrantes por Casa");
		sangre = new JButton("Estatus de sangre");
		mascota = new JButton("Lista de alumnos con una mascota en específico");
		informous = new JButton("Información de Hogwarts");
		ataqueDementor = new JButton("Ataque Dementor");
		avadaKedavra = new JButton ("Avada Kedavra");
		mapaDelMerodeador = new JButton("Mapa del Merodeador");


		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5,2));
		Border gap = BorderFactory.createEmptyBorder(5,5,5,5);
		
		p.setBorder(gap);
		p.add(nuevoIngreso);
		p.add(altaCalificacion);
		p.add(copaCasa);
		p.add(integrantesC);
		p.add(sangre);
		p.add(mascota);
		p.add(informous);
		p.add(mapaDelMerodeador);
		p.add(ataqueDementor);
		p.add(avadaKedavra);


		this.add(p);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(400, 300, 660, 400);
	}

	public static void main(String[] args) {
		new HogwartsVista ("Hogwarts");
	}
}
