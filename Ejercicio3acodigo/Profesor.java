import javax.swing.*;
//Profesor Subclase de Persona
public class Profesor extends Persona{ //Extends detremina cual es su clase padre
	private String materia;
	private String empleado;  //private solo la clase tiene permitido acceder 
	
	public Profesor(String nombre, String apellido,String sexo, int edad, String materia, String empleado){
		super(nombre,apellido,sexo,edad); //super = una forma de no reincribir todo el constructor y llama al constructor de la superclase
		this.materia = materia;  //this = que pertenese a esta clase
		this.empleado = empleado;
	}
	
	public void verDatosProf(){ //Muestra los datos del profesor en modo grafico
		JOptionPane.showMessageDialog(null, "Nombre: " + nombre + " " + apellido 
		+ "\nSexo:" + sexo 
		+ "\nEdad:" + edad
		+ "\nMaetria:" + materia
		+ "\nNo. Empleado:" + empleado, "Datos del Profesor", JOptionPane.INFORMATION_MESSAGE);  // Da un titulo a la ventana que muestra los datos
	}
}