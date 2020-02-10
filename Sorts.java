/**********************************************************
*Sorts.java				Fecha de creación: 01/01/2020
*							Última fecha de modificación: 
*							
*Clase que implementa las funciones de los sorts
*
*Funciones tomadas de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer.
*@author Andrea Amaya #19357
**********************************************************/
import java.util.*;

public class Sorts implements SortsInterface{


	/**
	/ Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Página 131 - 133.
	*/
	public void quickSort(Comparable[] datos, int cantidad_datos){
		quickSortRecursive(datos, 0, cantidad_datos-1);
	}
	//Se posiciona en el lugar correcto hacia la derecha
	private static int partition(Comparable datos[], int izquierda, int derecha){
		while (true) {
			//Se mueve el puntero hacia la izquierda
			while (izquierda < derecha && datos[izquierda] < 0){
				derecha--;

				if (izquierda < derecha){
					swap(datos, izquierda++, derecha);	
				} else {
					return derecha;	
				} 
			} 

			//Se mueve el puntero a la derecha
			while (izquierda < derecha && datos[izquierda] < datos[derecha]){
				izquierda++;
			
				if (izquierda < derecha){
					swap(datos, izquierda, derecha--);	
				} else {
					return derecha;
				}

			}



		}
	}
	//Se ordenan los datos en orden ascendente
	private static void quickSortRecursive(Comparable datos[], int izquierda, int derecha){
		int pivote; //La ultima posicion del valor derecho

		if (izquierda >= derecha) return;

		pivote = partition(datos, izquierda, derecha); //Posiciona el pivote
		quickSortRecursive(datos, izquierda, pivote-1);	//Ordena al menor
		quickSortRecursive(datos, pivote+1, derecha); //Ordena al mayor
	}

	/**
	/ Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Página 135 - 136.
	*/
	public void radixSort(Comparable[] datos){
		for (int i=0; i<6; i++) {
			bucketPass(datos, i);
		}
	}
	//Se regresa el valor del decimo lugar
	private static int digit(int cantidad_datos, int decimal){
		if (decimal == 0) return cantidad_datos%10;
		else return digit(cantidad_datos/10, decimal-1);
	}
	//Se ordenan los datos del digito encontrado en la localidad decimal
	private static void bucketPass(Comparable datos[], int decimal){
		int i, j;
		int valor;

		Vector<Vector<Integer>> cubeta = new Vector<Vector<Integer>>(10);
		cubeta.setSize(10);

		for (j=0; j<10; j++) cubeta.set(j, new Vector<Integer>());

		int cantidad = datos.length;

		for (i = 0; i < cantidad; i++) {
			valor = datos[i];
			j = digit(valor, decimal);
			cubeta.get(j).add(valor);
		}

		i = cantidad;
		
		for (j=9; j >= 0; j--) {
			
			while (!cubeta.get(j).isEmpty()){
				i--;
				valor = cubeta.get(j).remove(j);
				datos[i] = valor;
			}
		}
		
	}

	/**
	/ Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Página 142.
	*/
	public void bubbleSort(Comparable datos[], int cantidad){
		int cantidad_ordenada = 0;
		int indice;

		while (cantidad_ordenada< cantidad){
			for (indice = 1; indice < cantidad-cantidad_ordenada; indice++) {
				if (datos[indice-1] > datos[indice]) {
					swap(datos, indice-1, indice);
				}
			}
			cantidad_ordenada++;
		}
	}

	/**
	/ Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Página 109.
	*/
	//Se cambian los datos 
	private static void swap(Comparable datos[], int i, int j){
		int temporal;
		temporal = datos[i];
		datos[i] = datos[j];
		datos[j] = temporal;
	}


}