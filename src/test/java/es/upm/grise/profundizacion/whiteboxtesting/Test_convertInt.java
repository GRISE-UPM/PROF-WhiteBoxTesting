package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {
	
	// Hay dos caminos que no se pueden probar, ya que existen dos nodos con la misma condicion

	@Test // C1: 1-3-5-7-9-10-13
	public void test1() throws Exception {
		fail();
		// No se puede recorrer el camino porque para saltar el for, se necesita
		// un array vacio, y antes del for se accede al primer elemento del array,
		// por lo que si se ha pasado un array vacio, ocurre un error
	}
	
	@Test (expected = Exception.class)// C2: 1-2-13
	public void test2() throws Exception {
		Exercises e = new Exercises();
		convertInt o = e.new convertInt();
		char [] array = { '9', '9', '9', '9', '9', '9', '9' };
		o.convert(array);
	}
	
	@Test // C1: 1-3-4-5-7-9-10-13
	public void test3() throws Exception {
		fail();
		// No se puede recorrer el camino porque el nodo 3 y 7 evaluan la misma condicion, por lo tanto,
		// no se puede dar el caso de que uno de true y el otro false, sino que dan lo mismo
	}
	
	@Test (expected = Exception.class)// C4: 1-3-5-6-5-6-5-6-5-6-5-6-5-7-9-10-13
	public void test4() throws Exception {
		Exercises e = new Exercises();
		convertInt o = e.new convertInt();
		char [] array = { '9', '9', '9', '9', '9' };
		o.convert(array);
	}
	
	@Test // C5: 1-3-5-7-8-9-10-13
	public void test5() throws Exception {
		fail();
		// No se puede recorrer el camino porque el nodo 3 y 7 evaluan la misma condicion, por lo tanto,
		// no se puede dar el caso de que uno de true y el otro false, sino que dan lo mismo
	}
	
	@Test (expected = Exception.class)// C6: 1-3-4-5-6-5-6-5-6-5-6-5-6-5-7-8-9-11-10-13
	public void test6() throws Exception {
		Exercises e = new Exercises();
		convertInt o = e.new convertInt();
		char [] array = { '-', '9', '9', '9', '9', '9' };
		o.convert(array);
	}
	
	@Test // C7: 1-3-5-6-7-9-11-12-13
	public void test7() throws Exception {
		Exercises e = new Exercises();
		convertInt o = e.new convertInt();
		char [] array = { '9' };
		assertEquals(9, o.convert(array), 0);
	}
}
