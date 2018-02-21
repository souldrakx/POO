import javax.swing.*;
//Estudiante Subclase de Persona
public class Estudiante extends Persona{  
	private String matricula;
	private int promedio;
	
	public Estudiante(String nombre, String apellido,String sexo, int edad, String matricula, int promedio){  //Constructor
		super(nombre,apellido,sexo,edad);
		this.matricula = matricula;
		this.promedio = promedio; 
	}
	
	public void verDatosAlu(){  //Muestra los datos de los estudiantes
		JOptionPane.showMessageDialog(null, "Nombre: " + nombre + " " + apellido 
		+ "\nSexo:" + sexo 
		+ "\nEdad:" + edad
		+ "\nMatricula:" + matricula
		+ "\nPromedio:" + promedio, "Datos del Alumno", JOptionPane.INFORMATION_MESSAGE);
	}
}