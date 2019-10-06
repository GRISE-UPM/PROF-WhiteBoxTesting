package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises prueba =new Exercises();
	
	@Test
	public void test() {
		int[] ejemplo = {1,2,3,4,5,6};
		assertEquals(-1, prueba.maxAbsolute(ejemplo),0);
	}
	
	@Test
	public void test1() {
		int[] ejemplo = {1,2,3,-4};
		assertEquals(4, prueba.maxAbsolute(ejemplo),0);
	}
}
