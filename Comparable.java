public class Comparable implements ComparableInterface<Comparable>{
	private int valor;


	/**
	*Pre: un nuevo valor a comparar
	*@param nuevoValor		Valor a comparar
	*Post: Se asigna el nuevo valor 
	*/
	
	public Comparable(int nuevoValor){
		this.valor = nuevoValor;
	}


	public int compareTo(Comparable objeto){
		return this.valor - objeto.valor;
	}

	/**
	*Pre: objeto a obtener el valor
	*Posrt: se retorna el valor del objeto
	*/
	public int getValor(){
		return this.valor;
	}
}