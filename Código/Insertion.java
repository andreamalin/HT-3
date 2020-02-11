/**********************************************************
*Insertion.java				Fecha de creación: 01/01/2020
*						Última fecha de modificación: 10/01/2020
*							
*Clase que implementa las funciones del Sort Insertion
*
*
*@author Andrea Amaya #19357
**********************************************************/
import java.util.ArrayList;

public class Insertion implements SortsInterface{
	/**
	/ Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Página 125.
	*/
	public ArrayList<Comparable> sorting(ArrayList<Comparable> datos, int cantidad_datos){
		int cantidad_ordenada = 1; //Cantidad de datos ordenados actualmente
		int indice; //Indice actual

		while(cantidad_ordenada < cantidad_datos){
			Comparable dato_actual = datos.get(cantidad_ordenada);

			for (indice = cantidad_ordenada; indice > 0; indice --) {
				if (dato_actual.compareTo(datos.get(indice-1)) < 0) {
					datos.set(indice, datos.get(indice-1));
				} else {
					break;
				}
			}

			datos.set(indice, dato_actual); //Se reasigna el valor al array
			cantidad_ordenada++; //Se suma uno al contador de datos ordenados
		}

		return datos;
	}
}