package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_maxAbsolute {
	public Exercises testMaxAbsolute = new Exercises ();
	public int [] arrayTest ;
	
	//Test para numbers.length > 5
	@Test
	public void test() {
		assertEquals(-1,testMaxAbsolute.maxAbsolute(arrayTest = new int [] {1,2,3,4,5,6}));
		
	}
	
	//Test para funcionalidad normal del programa tanto números positivos como negativos
	@Test
	public void test1() {
		assertEquals(61,testMaxAbsolute.maxAbsolute(arrayTest = new int [] {-1,2,-3,50,61}));
		
	}

}
