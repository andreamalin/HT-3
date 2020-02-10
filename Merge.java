/**********************************************************
*Merge.java				Fecha de creación: 01/01/2020
*						Última fecha de modificación: 10/01/2020
*							
*Clase que implementa las funciones del Sort Merge
*
*
*@author Andrea Amaya #19357
**********************************************************/
import java.util.ArrayList;

public class Merge implements SortsInterface{

	/**	
	/ Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Página 127 - 128.
	*/
	public ArrayList<Comparable> sorting(ArrayList<Comparable> datos, int cantidad_datos){
		ArrayList<Comparable> temporal = new ArrayList<Comparable>();

		for (int i=0; i<datos.size(); i++) {
			temporal.add(new Comparable());
		}

		mergeSortRecursive(datos, temporal, 0, cantidad_datos-1);

		return datos;
	}
	
	/**
	* @param datos 			Es el array con los datos a ordenar
	* @param temporal		ArrayList para datos temporales
	* @param menor 			Valor cero
	* @param medio 			Cantidad de datos divido 2
	* @param mayor 			Cantidad de datos - 1 		
	*/
	//Se mandan los datos en orden ascendente
	private static void sorting(ArrayList<Comparable> datos, ArrayList<Comparable> temporal, int menor, int medio, int mayor){
		int indice_resultante = menor;
		int indice_actual = menor;
		int indice_siguiente = medio;

		while(indice_actual < medio && indice_siguiente <= mayor){
			if (datos.get(indice_siguiente).compareTo(temporal.get(indice_actual)) < 0) {
				//Se manda el mejor de los datos
				datos.set(indice_resultante++, datos.get(indice_siguiente++));
			} else {
				//Se manda el menor del temporal
				datos.set(indice_resultante++, temporal.get(indice_actual++));
			}
		}
		//Por si quedan datos en el temporal
		while (indice_actual < medio){
			datos.set(indice_resultante++, temporal.get(indice_actual++));
		}
	}
	/**
	* @param datos 			Es el array con los datos a ordenar
	* @param temporal		ArrayList para datos temporales
	* @param menor 			Valor cero
	* @param mayor 			Cantidad de datos - 1 		
	*/
	//Se regresan los valores en orden ascendente
	private static void mergeSortRecursive(ArrayList<Comparable> datos, ArrayList<Comparable> temporal, int menor, int alto){
		int cantidad = alto-menor + 1;
		int mitad = menor + cantidad/2;
		int i;

		if (cantidad < 2) return;
		for (i = menor; i<mitad; i++ ) {
			temporal.set(i, datos.get(i));
		}

		mergeSortRecursive(temporal, datos, menor, mitad-1); //Se manda la mitad-1 como dato mayor 
		mergeSortRecursive(datos, temporal, mitad, alto); //Se mandan los datos de forma normal
		sorting(datos, temporal, menor, mitad, alto); //Se ordenan los datos
	}

}