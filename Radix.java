/**********************************************************
*Radix.java				Fecha de creación: 01/01/2020
*						Última fecha de modificación: 10/01/2020
*							
*Clase que implementa las funciones del Sort Radix
*
*
*@author Andrea Amaya #19357
**********************************************************/
import java.util.ArrayList;
import java.util.*;

public class Radix implements SortsInterface{
	/**
	/ Código adaptado de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer. Página 135 - 136.
	*/
	public ArrayList<Comparable> sorting(ArrayList<Comparable> datos, int cantidad_datos){
		for (int i=0; i<6; i++) {
			bucketPass(datos, i, cantidad_datos);
		}
		return datos;
	}
	//Se regresa el valor del decimo lugar
	private static int digit(int cantidad_datos, int decimal){
		if (decimal == 0){
			return cantidad_datos%10;
		} else {
			return digit(cantidad_datos/10, decimal-1);
		}
	}
	//Se ordenan los datos del digito encontrado en la localidad decimal
	private static void bucketPass(ArrayList<Comparable> datos, int decimal, int cantidad_datos){
		
		Comparable valor;

		Vector<Vector<Integer>> casillero = new Vector<Vector<Integer>>(10);
		casillero.setSize(10);

		for (int j=0; j<10; j++){
			casillero.set(j, new Vector<Integer>());	
		} 


		for (int i = 0; i < cantidad_datos; i++) {
			valor = datos.get(i);
			int j = digit(valor.getValor(), decimal);
			casillero.get(j).add(valor.getValor());
		}

		int i = cantidad_datos;

		for (int j=9; j >= 0; j--) {
			i--;
			while (!casillero.get(j).isEmpty()){
				i--;
				int remover = casillero.size()-1;


				valor = new Comparable(casillero.get(j).lastElement());
				datos.set(i, valor);
			}
		}
		
	}


}