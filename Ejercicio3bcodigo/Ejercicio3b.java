/*
Herencia

1. Hacer una abstracción sobre las entidades Alumno y Profesor, identificando los atributos comunes y el comportamiento común entre ambos. Considerarlos como clases.
2. Poner los atributos comunes de Alumnos y Profesor en una clase de jerarquía más alta, llamada Persona. (Puede usar la analogía de teoría de conjuntos, considerando los conjuntos Alumno y Profesor, y sacando la intersección entre ellos)
3. Los atributos que hacen únicos a las clases Alumno y Profesor dejarlos en estas clases.
4. Caputar en modo gráfico los datos para mas de un alumno. Caputar también los datos para al menos un profesor.
5. Desplegar los datos de los alumnos, así como los datos de un profesor.
6. Hacer un MENU que permita elegir si se quiere capturar datos de alumnos o datos de profesor, teniendo la posibilidad sin salir del programa de capturar ambos.
*/

import java.io.*;
import javax.swing.*;   //Bibliotecas


public class Ejercicio3b{
	
	public static void main(String[] args){
		String nombre, apellido, sexo, materia, matricula, empleado;	//Variables
		int edad, i, j, promedio;
		int tprof,talu,res;
		
		do{ //ciclo do while que repite el progrma tantas veces como queramos
			int opc = Integer.parseInt(JOptionPane.showInputDialog("Selecciona que datos vas a ingresar: \n1.-Profesor\n"+"2.-Alumno\n"+"3.Salir"));//Visualizacion del menu


			switch(opc){//Segun la opcion que escogimos nos preguntara que datos ingresaremos
				case 1: tprof = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de maestros a ingresar: "));//Convierte una cadena a un entero y determina la cantidad de maestros
						Profesor prof[] = new Profesor[tprof];
						for (i = 0; i<tprof; i++){   //Ciclo for que captura los datos de ls maestros
							nombre = JOptionPane.showInputDialog(null,"Nombre del Profesor "+(i +1)+":", "Datos del Profesor", 1);
							apellido = JOptionPane.showInputDialog(null,"Apellido del Profesor "+(i +1)+":", "Datos del Profesor", 1);
							sexo = JOptionPane.showInputDialog(null,"Sexo del Profesor "+(i +1)+":", "Datos del Profesor", 1);
							edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad del Profesor "+(i +1)+":", "Datos del Profesor", 1));
							materia = JOptionPane.showInputDialog(null,"Materia que imparte "+(i +1)+":", "Datos del Profesor", 1);
							empleado = JOptionPane.showInputDialog(null,"No. de Empleado "+(i +1)+":", "Datos del Profesor", 1);
							prof[i] = new Profesor(nombre,apellido, sexo, edad, materia, empleado);  //Entra a la clase Profesor e ingresa los datos			
						}

						for (i = 0; i<tprof; i++){
						prof[i].verDatosProf();//Imprime los datos del profesor
						} break;

				case 2: talu = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de alumnos a ingresar: ")); 
					 	Estudiante Alu[] = new Estudiante[talu];
					 	for (j = 0; j<talu; j++){ //Cilco for que captura los datos de los alumnos
							nombre = JOptionPane.showInputDialog(null,"Nombre del Alumno "+(j +1)+":", "Datos del Alumno", 1);
							apellido = JOptionPane.showInputDialog(null,"Apellido del Alumno "+(j +1)+":","Datos del Alumno", 1);
							sexo = JOptionPane.showInputDialog(null,"Sexo del Alumno "+(j +1)+":", "Datos del Alumno", 1);
							edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad del Alumno "+(j +1)+":", "Datos del Alumno", 1));
							matricula = JOptionPane.showInputDialog(null,"Matricula "+(j +1)+":", "Datos del Alumno", 1);
							promedio = Integer.parseInt(JOptionPane.showInputDialog(null,"Promedio "+(j +1)+":", "Datos del Alumno", 1));
							Alu[j] = new Estudiante(nombre,apellido, sexo, edad, matricula, promedio); //Entra a la clase Alumno e ingresa los datos
						}

						for (j = 0; j<talu; j++){
							Alu[j].verDatosAlu(); //Imprime los datos de los Alumnos
						}break;

				case 3: System.exit(0);break; //Al escoger la opcion "3.-Salir" saldra automaticamente del programa

				default: JOptionPane.showMessageDialog(null,"Opcion no valida \nIngrese una opcion valida","ERORR", 2);//despliega un mensaje de error que nos dice que ingresamos mal el valor
			}

			res = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar un datos de nuevo \n"+"1.-Si\n"+"0.-No")); //Nos pregunta si queremos ingresar datos nuevamente
		}while(res != 0);
				
	}
}







 
