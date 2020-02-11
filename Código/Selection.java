/**********************************************************
*Selection.java			Fecha de creación: 01/01/2020
*						Última fecha de modificación: 10/01/2020
*							
*Clase que implementa las funciones del Sort Selection
*
*
*@author Andrea Amaya #19357
**********************************************************/
import java.util.ArrayList;

public class Selection implements SortsInterface{

	/**	
	/ Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Página 127 - 128.
	*/
	public ArrayList<Comparable> sorting(ArrayList<Comparable> datos, int cantidad_datos){
		int cantidad_desordenada = cantidad_datos;
		int indice;
		int maximo;

		while(cantidad_desordenada > 0){
			maximo = 0; //El dato mayor se toma como cero
			for (indice = 1; indice < cantidad_desordenada; indice++) {
				if (datos.get(maximo).compareTo(datos.get(indice)) < 0) {
					maximo = indice;
				}
			}
			swap(datos, maximo, cantidad_desordenada-1);
			cantidad_desordenada--;
		}

		return datos;
	}

	/**
	* @param datos 				Datos a ordenar
	* @param a 					Se obtiene la posición de a, para asignar b
	* @param b 					Se obtiene la posición de b, para asignar a
	*/
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
