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

	public class HogwartsMateriasVista extends JFrame {
		
		//Historia de la Magia
		//Astronomía
		//Herbología
		//Encantamientos
		//Transfomaciones
		//Defensa Contra las Artes Oscuras
		//Pociones
		
		private static final long serialVersionUID = 1L;
		protected JTextField alumnoJTF, hMagiaJTF, astronomiaJTF, herbologiaJTF, encantamientosJTF, transJTF, dCAOscurasJTF, pocionesJTF, aceptarJTF;
		private JLabel cal1, cal2, cal3, cal4, alumnoL, hMagiaL, astronomiaL, herbologiaL, encantamientosL, transL, dCAOscurasL, pocionesL;
		protected JButton aceptar;
		
		public HogwartsMateriasVista(String titulo) {
			super(titulo);
			alumnoJTF = new JTextField(32);
			hMagiaJTF= new JTextField(32); 
			astronomiaJTF = new JTextField(16); 
			herbologiaJTF= new JTextField(16); 
			encantamientosJTF= new JTextField(16); 
			transJTF= new JTextField(16); 
			dCAOscurasJTF= new JTextField(16); 
			pocionesJTF= new JTextField(16); 
			aceptarJTF = new JTextField(16);
			
			cal1 = new JLabel("E = Extraordinario  S = Supera las expectativas");
			cal2 = new JLabel("A = Aceptable      I = Insatisfactorio  ");
			cal3 = new JLabel("D = Desastroso       T = Troll o Troglodita");
			cal4 = new JLabel("N = No cursa materia");
			alumnoL = new JLabel("Nombre del alumno");
			hMagiaL = new JLabel("Historia de la Magia");
			astronomiaL = new JLabel("Astronomía");
			herbologiaL = new JLabel("Herbología");
			encantamientosL = new JLabel("Encantamientos");
			transL = new JLabel("Transformaciones");
			dCAOscurasL = new JLabel("Defensa Contra las Artes Oscuras");
			pocionesL= new JLabel("Pociones");
					
			aceptar = new JButton("Aceptar");
			
			
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(11,2)); 
			Border borde = BorderFactory.createEmptyBorder(5, 5, 5,5); 
			
			panel.setBorder(borde);
			panel.add(cal1);
			panel.add(cal2);
			panel.add(cal3);
			panel.add(cal4);
			panel.add(alumnoL);
			panel.add(alumnoJTF);
			panel.add(astronomiaL);
			panel.add(astronomiaJTF);
			panel.add(dCAOscurasL);
			panel.add(dCAOscurasJTF);
			panel.add(encantamientosL);
			panel.add(encantamientosJTF);
			panel.add(herbologiaL);
			panel.add(herbologiaJTF);
			panel.add(hMagiaL);
			panel.add(hMagiaJTF);
			panel.add(pocionesL);
			panel.add(pocionesJTF);
			panel.add(transL);
			panel.add(transJTF);
			panel.add(aceptar);
			panel.add(aceptarJTF);
			//panel.add(respuestaJTF);
			
			this.add(panel);
			this.setBounds(500, 200,580,600); //tamaño de la ventana
			this.setDefaultCloseOperation(EXIT_ON_CLOSE); //se cierra automaticamente
			this.setVisible(true);//para que podamos verlo
		
	}
	public static void main(String[] args) {
		new HogwartsMateriasVista("Dar de alta las calificaciones del alumno");

	}

}

	