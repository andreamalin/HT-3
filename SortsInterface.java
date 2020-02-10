/**********************************************************
*iSorts.java				Fecha de creación: 01/01/2020
*							Última fecha de modificación: 
*							
*Interfaz que contene las operaciones que puede llevar a cabo
*la clase Sorts
*Interfaz tomada de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer.
*@author Andrea Amaya #19357
**********************************************************/
public interface SortsInterface{
	/**
	Pre: Datos a ordenar
	* @param datos 			Es el array con los datos a ordenar
	* @param cantidad_datos Cantidad de datos a ordenar
	Post: Datos ordenados
	*/
	public abstract void selectionSort(int[] datos, int cantidad_datos);
	/**
	Pre: Datos a ordenar
	* @param datos 			Es el array con los datos a ordenar
	* @param cantidad_datos Cantidad de datos a ordenar
	Post: Datos ordenados
	*/
	public abstract void mergeSort(int[] datos, int cantidad_datos);
	/**
	Pre: Datos a ordenar
	* @param datos 			Es el array con los datos a ordenar
	* @param cantidad_datos Cantidad de datos a ordenar
	Post: Datos ordenados
	*/
	public abstract void quickSort(int[] datos, int cantidad_datos);
	/**
	Pre: Datos a ordenar
	* @param datos 			Es el array con los datos a ordenar
	Post: Datos ordenados
	*/
	public abstract void radixSort(int[] datos);
	/**
	Pre: Datos a ordenar
	* @param datos 			Es el array con los datos a ordenar
	* @param cantidad_datos Cantidad de datos a ordenar
	Post: Datos ordenados
	*/
	public abstract void bubbleSort(int datos[], int cantidad_datos);
}