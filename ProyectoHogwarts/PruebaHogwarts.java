//Diana Espinosa Ruiz
//Matrícula 000179164
//Proyecto Colegio Hogwarts de Magia y Hechicería
//Programa que se encarga de controlar la vista principal y correr el programa
package generales;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

import generales.HogwartsIngresoControlador.EscuchadorAceptar;


public class PruebaHogwarts extends HogwartsVista {
	
	static Hogwarts hogwarts;
	private static final long serialVersionUID = 1L;
	
	public PruebaHogwarts(String titulo) {
		super(titulo);
		nuevoIngreso.addActionListener(new EscuchadorNuevoIngreso());
		altaCalificacion.addActionListener(new EscuchadorCalificacion());
		copaCasa.addActionListener(new EscuchadorCopaCasa());
		mapaDelMerodeador.addActionListener(new EscuchadorMapaMerodeador());
		ataqueDementor.addActionListener(new EscuchadorDementor());
		avadaKedavra.addActionListener(new EscuchadorAvadaKedavra());
		integrantesC.addActionListener(new EscuchadorIntegrantes());
		sangre.addActionListener(new EscuchadorSangre());
		mascota.addActionListener(new EscuchadorMascota());
		informous.addActionListener(new EscuchadorInformous());
		
	}
	
	public class EscuchadorNuevoIngreso  implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			
			new HogwartsIngresoControlador("Bienvenidos alumnos de nuevo ingreso.");
		}
	}
	

	public class EscuchadorCalificacion  implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			
			new HogwartsMateriasControlador("Dar de alta calificaciones.");
		}
	}
	
	public class EscuchadorCopaCasa implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, hogwarts.copaCasas());
		}
		
	}
	
	public class EscuchadorMapaMerodeador implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String alumnoTxt = "";
			alumnoTxt = alumnoTxt = JOptionPane.showInputDialog("Quieres encontrar a ");
			
			if (!alumnoTxt.equals("")) {
				try {
					JOptionPane.showMessageDialog(null, hogwarts.mapaDelMerodeador(alumnoTxt));
					
				} catch(Exception e) {
					System.out.println("Error en validar datos");
				}
			}
		}
		
	}
	
	public class EscuchadorDementor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String alumnoTxt = "";
			alumnoTxt = JOptionPane.showInputDialog("Ataque dementor a ");
			
			if (!alumnoTxt.equals("")) {
				try {
					
					JOptionPane.showMessageDialog(null, hogwarts.ataqueDementor(alumnoTxt));
					
				} catch(Exception e) {
					System.out.println("Error en validar datos");
				}
			}
		}
		
	}
	
	public class EscuchadorAvadaKedavra implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String alumnoTxt = "";
			alumnoTxt = JOptionPane.showInputDialog("Avada kedavra a ");
			
			if (!alumnoTxt.equals("")) {
				try {
					if(hogwarts.avadaKedavra(alumnoTxt))
						JOptionPane.showMessageDialog(null, alumnoTxt + " ha muerto.");
					else 
						JOptionPane.showMessageDialog(null, "No existe " + alumnoTxt);
					
				} catch(Exception e) {
					System.out.println("Error en validar datos");
				}
			}
		}
		
	}
	
	public class EscuchadorIntegrantes implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String casaTxt = "";
			casaTxt = JOptionPane.showInputDialog("Ingrese la casa de la que desea saber los integrantes. ");
			
			if (!casaTxt.equals("")) 
				JOptionPane.showMessageDialog(null, hogwarts.integrantesCasa(casaTxt));
			
			else
				JOptionPane.showMessageDialog(null, "No se ingresó nada.");
		}
		
	}
	
	
	public class EscuchadorSangre implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String alumnoTxt = "";
			alumnoTxt = JOptionPane.showInputDialog("Ingresa el nombre del alumno del cual deseas saber su estatus de sangre.");
			
			if (!alumnoTxt.equals("")) 
				JOptionPane.showMessageDialog(null, hogwarts.estatusSangre(alumnoTxt));
			
			else
				JOptionPane.showMessageDialog(null, "No se ingresó nada");
		}
		
	}
	
	public class EscuchadorMascota implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String mascotaTxt = "";
			mascotaTxt = JOptionPane.showInputDialog("Ingresa mascota.");
			
			if (!mascotaTxt.equals("")) 
				JOptionPane.showMessageDialog(null, hogwarts.dueñosMascota(mascotaTxt));
			
			else
				JOptionPane.showMessageDialog(null, "No se ingresó nada.");
		}
		
	}
	
	public class EscuchadorInformous implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "La información se imprimirá a bajo.");
			System.out.println(hogwarts.informousHogwarts());
		}
		
	}

	public static void main(String[] args) {
		
		new PruebaHogwarts("Colegio Hogwarts de Magia y Hechicería");
		hogwarts = new Hogwarts("Colegio Hogwarts de Magia y Hechicería", "Reino Unido");
		hogwarts.altaCasa("Gryffindor");
		hogwarts.altaCasa("Hufflepuff");
		hogwarts.altaCasa("Ravenclaw");
		hogwarts.altaCasa("Slytherin");
		
		StringBuilder ingresados = new StringBuilder();
		
		try {
			File file = new File("AlumnosNuevoIngreso");
			Scanner leeArch = new Scanner(file);
			String nombre;
			String mascota;
			boolean lentes;
			int padresMuggles;
			
			while(leeArch.hasNextLine()) {
				ingresados.append("Alumno: \n");
				nombre = leeArch.nextLine();
				mascota = leeArch.nextLine();
				lentes = leeArch.nextBoolean();
				padresMuggles = leeArch.nextInt();
				ingresados.append(nombre).append("\n").append(hogwarts.nuevoIngreso(nombre, mascota, lentes, padresMuggles)).append("\n");
				ingresados.append("\n");
				leeArch.nextLine();
			}
			
			leeArch.close();
		} catch (Exception e) {
			ingresados.append("Error al leer el archivo.");
		}
		
		System.out.println(ingresados.toString());
		
	}
	
}
