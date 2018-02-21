/*
Herencia

Hacer un programa orientado objetos bajo los siguientes requerimientos:
1. Hacer una abstracción sobre las entidades Alumno y Profesor, identificando los atributos comunes y el comportamiento común entre ambos. Considerarlos como clases.
2. Poner los atributos comunes de Alumnos y Profesor en una clase de jerarquía más alta, llamada Persona. (Puede usar la analogía de teoría de conjuntos, considerando los conjuntos Alumno y Profesor, y sacando la intersección entre ellos)
3. Los atributos que hacen únicos a las clases Alumno y Profesor dejarlos en estas clases.
4.  Caputar en modo gráfico los datos para mas de un alumno. Caputar también los datos para al menos un profesor.
5. Desplegar los datos de los alumnos, así como los datos de un profesor.
*/

import java.io.*;
import javax.swing.*;   //Bibliotecas


public class Ejercicio3a{
	
	public static void main(String[] args){
		String nombre, apellido, sexo, materia, matricula, empleado;	//Variables
		int edad, i, j, promedio;
		
		int tprof = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de maestros a ingresar: "));  
		int talu = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de alumnos por Profesor: ")); //Convierte una cadena a un entero y determina la cantidad de maestros y alumnos a ingresar
			
		Estudiante Alu[] = new Estudiante[talu];
		Profesor prof[] = new Profesor[tprof];
		
			
		
		
		for (i = 0; i<tprof; i++){   //Ciclo for que captura los datos de ls maestros
			
			nombre = JOptionPane.showInputDialog(null,"Nombre del Profesor "+(i +1)+":", "Datos del Profesor", 1);
			apellido = JOptionPane.showInputDialog(null,"Apellido del Profesor "+(i +1)+":", "Datos del Profesor", 1);
			sexo = JOptionPane.showInputDialog(null,"Sexo del Profesor "+(i +1)+":", "Datos del Profesor", 1);
			edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad del Profesor "+(i +1)+":", "Datos del Profesor", 1));
			materia = JOptionPane.showInputDialog(null,"Materia que imparte "+(i +1)+":", "Datos del Profesor", 1);
			empleado = JOptionPane.showInputDialog(null,"No. de Empleado "+(i +1)+":", "Datos del Profesor", 1);
			prof[i] = new Profesor(nombre,apellido, sexo, edad, materia, empleado);  //Entra a la clase Profesor e ingresa los datos
			
			
			for (i = 0; i<talu; i++){ //Cilco for que determina la cntidad de alumnos por maestro
				nombre = JOptionPane.showInputDialog(null,"Nombre del Alumno "+(i +1)+":", "Datos del Alumno", 1);
				apellido = JOptionPane.showInputDialog(null,"Apellido del Alumno "+(i +1)+":","Datos del Alumno", 1);
				sexo = JOptionPane.showInputDialog(null,"Sexo del Alumno "+(i +1)+":", "Datos del Alumno", 1);
				edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad del Alumno "+(i +1)+":", "Datos del Alumno", 1));
				matricula = JOptionPane.showInputDialog(null,"Matricula "+(i +1)+":", "Datos del Alumno", 1);
				promedio = Integer.parseInt(JOptionPane.showInputDialog(null,"Promedio "+(i +1)+":", "Datos del Alumno", 1));
				Alu[i] = new Estudiante(nombre,apellido, sexo, edad, matricula, promedio); //Entra a la clase Alumno e ingresa los datos
			}
			
			
		}
		
		for (i = 0; i<tprof; i++){
			prof[i].verDatosProf();//Imprime los datos del profesor
			
			for (i = 0; i<talu; i++){
				Alu[i].verDatosAlu(); //Imprime los datos de los Alumnos
			}
		}
		
	}
}







 
