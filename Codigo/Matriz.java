import javax.swing.*;

//Super clase Matriz
public class Matriz{  //Abstracciones de una Matriz
	protected int ren;
	protected int col;  //protected determina que solo la clase y las subclases de esta misma pueden acceder a estas abstracciones

	public Matriz(int ren, int col){
	this.ren = ren;
	this.col = col;
	}
}
