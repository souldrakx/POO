import java.io.*;
import javax.swing.*;

public class Ejercicio4{

    public static void main(String[] args){

        int colint,renint,colflo,renflo; //variables.

        renint=Integer.parseInt(JOptionPane.showInputDialog("Numero de renglones que desea para la matriz de tipo int: "));
        colint=Integer.parseInt(JOptionPane.showInputDialog("Numero de columnas que desea para la matriz de tipo int: "));
        renflo=Integer.parseInt(JOptionPane.showInputDialog("Numero de renglones que desea para la matriz de tipo float: "));
        colflo=Integer.parseInt(JOptionPane.showInputDialog("Numero de renglones que desea para la matriz de tipo float: "));

        MatrizInt m1 = new MatrizInt(renint,colint); //Se crea un nuevo objeto
        MatrizFlo m2 = new MatrizFlo(renflo,colflo); 

        m1.verDatosint(); //imprime las matrices de tipo int 
        m2.verDatosFlo(); //imprime las matrices de tipo float 
    }

}