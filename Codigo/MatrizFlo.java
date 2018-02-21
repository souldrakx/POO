import javax.swing.*;
import java.io.*;

public class MatrizFlo extends Matriz{
    float MFlo[][];

	public MatrizFlo(int ren, int col){
		super(ren, col);
        MFlo = new float [ren][col];
        M();
	}

	public void M(){
        for (int i = 0; i < ren ; i++) {
            for (int j = 0; j< col; j++) {
                MFlo[i][j] = (float)(Math.random()*100)/10; //se usa el valor maximo de 100 para que al dividirlo entre 10 de un numero no mayor a 10 y que sea flotante
            }
        }
    }


    public void verDatosFlo(){
        String resultado = "";

		for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                resultado += MFlo[i][j];
                resultado += "    ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado); //Imprime la matriz
    }
}