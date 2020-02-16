import java.util.Random;
import java.util.*; 
import java.io.*;
import java.util.ArrayList;

public class driver{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		//Sorts instanciados
		SortsInterface insertion = new Insertion();
		SortsInterface merge = new Merge();
		SortsInterface selection = new Selection();
		SortsInterface quick = new Quick();
		SortsInterface radix = new Radix();

		int cantidad_aleatoria = rand.nextInt(3000)+10; //Cantidad aleatoria de numeros a agregar al txt

		ArrayList<Comparable> datos = new ArrayList<Comparable>();
		ArrayList<Comparable> datos_ordenados = new ArrayList<Comparable>();

		//Se genera el texto con numeros aleatorios
		try {
			PrintWriter not = new PrintWriter("generados.txt");
			not.close(); //Se borran datos pasados

			FileWriter writer = new FileWriter("generados.txt", true);
		    for (int i=0; i<cantidad_aleatoria; i++) { //Se realiza hasta llegar a la cantidad aleatoria
		    	int numero = rand.nextInt(3000); //Se generan numeros para agregar al txt
		    	writer.write(numero + "\n");  //Se mete el numero al txt   
		    	datos.add(new Comparable(numero));
		    }
		    writer.close();

		}catch (IOException e) {
			System.out.print("\nArchivo no encontrado\n");
		}

		//Se ordenan los datos
		System.out.println("_______________________________________\n         ESCOJA EL TIPO DE SORT:          \n_______________________________________\n1. Insertion\n2. Merge\n3. Selection\n4. Quick\n5. Radix\nElija la opcion: ");
		int sort =scan.nextInt();
		
		switch(sort){
			case 1:
				datos_ordenados = insertion.sorting(datos, cantidad_aleatoria);
				break;
			case 2:
				datos_ordenados = merge.sorting(datos, cantidad_aleatoria);
				break;
			case 3:
				datos_ordenados = selection.sorting(datos, cantidad_aleatoria);
				break;
			case 4:
				datos_ordenados = quick.sorting(datos, cantidad_aleatoria);
				break;
			default:
				datos_ordenados = radix.sorting(datos, cantidad_aleatoria);
				break;
		}
		System.out.println("_______________________________________\n    PUEDES REVISAR EN ordenados.txt    \n_______________________________________");

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