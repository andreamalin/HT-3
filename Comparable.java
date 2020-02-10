public class Comparable implements ComparableInterface<Comparable>{
	private int valor;

	public Comparable(){
	}

	/**
	*Pre: un nuevo valor a comparar
	*@param nuevoValor		Valor a comparar
	*Post: Se asigna el nuevo valor 
	*/
	public Comparable(int nuevoValor){
		this.valor = nuevoValor;
	}

	/**
	*Pre: un nuevo objeto a comparar
	*@param objeto		Objeto a comparar
	*Post: Se retorna el valor 
	*/
	public int compareTo(Comparable objeto){
		return this.valor - objeto.getValor();
	}

	/**
	*Pre: objeto a obtener el valor
	*Post: se retorna el valor del objeto
	*/
	public int getValor(){
		return this.valor;
	}

}