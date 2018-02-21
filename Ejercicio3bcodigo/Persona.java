import javax.swing.*;

//Super clase Persona
public class Persona{
	protected String nombre;  //Abstracciones de una persona
	protected String apellido;  //protected determina que solo la clase y las subclases de esta misma pueden acceder a estas abstracciones
	protected String sexo;
	protected int edad;  
	
	public Persona(String nombre, String apellido,String sexo, int edad){ //constructor
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
	}
	
}