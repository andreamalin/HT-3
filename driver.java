import java.util.Random;
import java.util.*; 
import java.io.*;

public class driver{
	public static void main(String[] args) {
		SortsInterface iSorts = new SortsInterface();

		Random rand = new Random();
		List<Comparable> datos = new ArrayList<Comparable>;

		int cantidad_aleatoria = rand.nextInt(3000)+1; //Cantidad aleatoria de numeros a agregar al txt

		try {
			PrintWriter not = new PrintWriter("generados.txt");
			not.close(); //Se borran datos pasados

			

			FileWriter writer = new FileWriter("generados.txt", true);

		    for (int i=0; i<cantidad_aleatoria; i++) { //Se realiza hasta llegar a la cantidad aleatoria
		    	int numero = rand.nextInt(3000); //Se generan numeros para agregar al txt
		    	writer.write(numero + "\n");  //Se mete el numero al txt   
		    	datos.add(numero);
		    }
		    writer.close();

		}catch (IOException e) {
			System.out.print("\nArchivo no encontrado\n");
		}

		String[] datos_a_ordenar = datos.toArray(); 

	}


	Comparable comparable = iSorts.selectionSort(datos, cantidad_aleatoria);
}