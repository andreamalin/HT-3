import java.util.Random;
import java.util.*; 
import java.io.*;
import java.util.ArrayList;

public class driver{
	public static void main(String[] args) {
		//Sorts instanciados
		SortsInterface insertion = new Insertion();
		SortsInterface merge = new Merge();
		SortsInterface selection = new Selection();
		SortsInterface quick = new Quick();
		SortsInterface radix = new Radix();

		//Para generar aleatorios
		Random rand = new Random();
		

		int cantidad_aleatoria = rand.nextInt(3000)+10; //Cantidad aleatoria de numeros a agregar al txt

		ArrayList<Comparable> datos = new ArrayList<Comparable>();
		ArrayList<Comparable> datos_ordenados = new ArrayList<Comparable>();

		//Se genera el texto con numeros aleatorios
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

		//Se ordenan los datos
		datos_ordenados = radix.sorting(datos, cantidad_aleatoria);

		//Para revisar que sí se ordenaron los datos
		try {
			PrintWriter not = new PrintWriter("ordenados.txt");
			not.close(); //Se borran datos pasados

			

			FileWriter writer = new FileWriter("ordenados.txt", true);

		    for (int i=0; i<datos_ordenados.size(); i++) { //Se realiza hasta llegar a la cantidad de datos ordenados
		    	int numero = datos_ordenados.get(i).getValor();
		    	writer.write(numero + "\n");  //Se mete el numero al txt   
		    }
		    writer.close();

		}catch (IOException e) {
			System.out.print("\nArchivo no encontrado\n");
		}


	}

}