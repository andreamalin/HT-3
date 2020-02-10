/**********************************************************
*ComparableInterface.java			Fecha de creación: 01/01/2020
*							Última fecha de modificación: 
*							
*Interfaz que contene las operaciones que puede llevar a cabo
*la clase Comparable
*Interfaz tomada de: Bailey, D. A. Java Structures: Data Structures for the Principled Programmer.
*página 141
*
*@author Andrea Amaya #19357
**********************************************************/
public interface ComparableInterface<T>{
	/**
	*Pre: un objeto a comparar el valor
	*@param objeto			Objeto a comparar el valor
	*Post: Se retorna -1 si el valor es menor al objeto, 0 si son iguales, 1 si el valor es mayor al objeto
	*/
	public abstract int compareTo(T object);
}