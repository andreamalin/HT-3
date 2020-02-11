import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class Test3 {

	@Test
	public void test() {
		Quick test3 = new Quick();
		
		ArrayList<Comparable> datos = new ArrayList<Comparable>();
		ArrayList<Comparable> datos_ordenados = new ArrayList<Comparable>();
		ArrayList<Comparable> datos_esperados = new ArrayList<Comparable>();
		
		ArrayList<String> ordenados = new ArrayList<String>();
		ArrayList<String> esperados = new ArrayList<String>();

		//Datos desordenados
		datos.add(new Comparable(5));
		datos.add(new Comparable(9));
		datos.add(new Comparable(2));
		datos.add(new Comparable(1));
		
		//Datos esperados
		datos_esperados.add(new Comparable(1));
		datos_esperados.add(new Comparable(2));
		datos_esperados.add(new Comparable(5));
		datos_esperados.add(new Comparable(9));
		
		datos_ordenados = test3.sorting(datos, 4);
		
		for(int i=0; i<datos.size(); i++) {
			ordenados.add(datos_ordenados.get(i).toString());
			esperados.add(datos_esperados.get(i).toString());
		}
		

		assertEquals(esperados, ordenados);
	}

}