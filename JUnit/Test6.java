import static org.junit.Assert.*;

import org.junit.Test;

public class Test6 {

	@Test
	public void test() {
		Quick test6 = new Quick();
		
		ArrayList<Comparable> datos = new ArrayList<Comparable>();
		ArrayList<Comparable> datos_ordenados = new ArrayList<Comparable>();
		ArrayList<Comparable> datos_esperados = new ArrayList<Comparable>();

		//Datos desordenados
		datos.add(new Comparable(5));
		datos.add(new Comparable(9));
		datos.add(new Comparable(2));
		datos.add(new Comparable(1));
		
		//Datos esperados
		datos.add(new Comparable(1));
		datos.add(new Comparable(2));
		datos.add(new Comparable(5));
		datos.add(new Comparable(9));
		
		
		datos_ordenados = test6.sorting(datos, 4);
		
		
		assertEquals(datos_esperados, datos_ordenados);
	}

}