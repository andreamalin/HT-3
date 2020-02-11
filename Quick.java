/**********************************************************
*QuickSort.java			Fecha de creación: 01/01/2020
*						Última fecha de modificación: 10/01/2020
*							
*Clase que implementa las funciones del Sort Quick
*
*
*@author Andrea Amaya #19357
**********************************************************/
import java.util.ArrayList;

public class Quick implements SortsInterface{
	/**
	/ Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Página 131 - 133.
	*/
	public ArrayList<Comparable> sorting(ArrayList<Comparable> datos, int cantidad_datos){
		quickSortRecursive(datos, 0, cantidad_datos-1);
		return datos;
	}


	//Se ordenan los datos en orden ascendente
	private static void quickSortRecursive(ArrayList<Comparable> datos, int izquierda, int derecha){
		int pivote; //La ultima posicion del valor derecho

		if (izquierda >= derecha) return;

		pivote = partition(datos, izquierda, derecha); //Posiciona el pivote
		quickSortRecursive(datos, izquierda, pivote-1);	//Ordena al menor
		quickSortRecursive(datos, pivote+1, derecha); //Ordena al mayor
	}

	//Se posiciona en el lugar correcto hacia la derecha
	private static int partition(ArrayList<Comparable> datos, int izquierda, int derecha){
		while (true) {
			//Se mueve el puntero hacia la izquierda
			while (izquierda < derecha && datos.get(izquierda).compareTo(datos.get(derecha)) < 0){
				derecha--;
			} 

			if (izquierda < derecha){
				swap(datos, izquierda++, derecha);	
			} else {
				return derecha;	
			} 
			

			//Se mueve el puntero a la derecha
			while (izquierda < derecha && datos.get(izquierda).compareTo(datos.get(derecha)) < 0){
				izquierda++;
			}
			
			if (izquierda < derecha){
				swap(datos, izquierda, derecha--);	
			} else {
				return derecha;
			}

		}
	}


	/**
	/ Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Página 109.
	*/
	//Se cambian los datos 
	private static void swap(ArrayList<Comparable> datos, int a, int b){
		Comparable temporal;

		temporal = datos.get(a);
		datos.set(a, datos.get(b));
		datos.set(b, temporal);
	}
}