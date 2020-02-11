import java.util.Random;
import java.util.*; 
import java.io.*;
import java.util.ArrayList;

public class driver{
	public static void main(String[] args) {
		SortsInterface insertion = new Insertion();
		SortsInterface merge = new Merge();
		SortsInterface selection = new Selection();
		SortsInterface quick = new Quick();
		SortsInterface radix = new Radix();


		Random rand = new Random();
		

		int cantidad_aleatoria = rand.nextInt(10)+1; //Cantidad aleatoria de numeros a agregar al txt
		ArrayList<Comparable> datos = new ArrayList<Comparable>();
		ArrayList<Comparable> datos_ordenados = new ArrayList<Comparable>();


		try {
			PrintWriter not = new PrintWriter("generados.txt");
			not.close(); //Se borran datos pasados

			

			FileWriter writer = new FileWriter("generados.txt", true);

		    for (int i=0; i<cantidad_aleatoria; i++) { //Se realiza hasta llegar a la cantidad aleatoria
		    	int numero = rand.nextInt(10); //Se generan numeros para agregar al txt
		    	writer.write(numero + "\n");  //Se mete el numero al txt   
		    	datos.add(new Comparable(numero));
		    }
		    writer.close();

		}catch (IOException e) {
			System.out.print("\nArchivo no encontrado\n");
		}


		datos_ordenados = radix.sorting(datos, cantidad_aleatoria);

		try {
			PrintWriter not = new PrintWriter("ordenados.txt");
			not.close(); //Se borran datos pasados

			

			FileWriter writer = new FileWriter("ordenados.txt", true);

		    for (int i=0; i<datos_ordenados.size(); i++) { //Se realiza hasta llegar a la cantidad aleatoria
		    	int numero = datos_ordenados.get(i).getValor();
		    	writer.write(numero + "\n");  //Se mete el numero al txt   
		    }
		    writer.close();

		}catch (IOException e) {
			System.out.print("\nArchivo no encontrado\n");
		}


	}

}