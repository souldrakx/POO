import javax.swing.*;
import java.io.*;

public class MatrizInt extends Matriz{
    int MInt[][];

	public MatrizInt(int ren, int col){
		super(ren, col);
        MInt = new int [ren][col];
        M();
	}

	public void M(){ //Se le asignan varoles aleatoreos a la matriz con la funcion Math.random
        for (int i = 0; i < ren ; i++) {
            for (int j = 0; j< col; j++) {
                MInt[i][j] = (int)/*Math.floor*/(Math.random()*10); 
            }
        }
    }
    /*(tipo de dato que genera)Math.floor(Math.random()*n); si no se designa que tipo de dato es se asignaran de tipo double por default
    n = el valor maximo de valor a asignar
*/
    public void verDatosint(){
        String resultado = "";

		for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                resultado += MInt[i][j];
                resultado += "    ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado); //Imprime la matriz en modo grafico
    }
}