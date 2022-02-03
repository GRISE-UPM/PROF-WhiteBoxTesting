package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	@Test
	public void longitudmayorque5() {
		Exercises ex = new Exercises();
		int numbers[] = new int[6];
		int result = ex.maxAbsolute(numbers);
		assertEquals(-1.0f,result,0.0f);
	}
	
	@Test
	public void numerostodospositivos() {
		Exercises ex = new Exercises();
		int numbers[] = {1,2,3,4};
		int result = ex.maxAbsolute(numbers);
		assertEquals(4.0f,result,0.0f);
	}
	
	@Test
	public void connumerosnegativos() {
		Exercises ex = new Exercises();
		int numbers[] = {1,2,3,-4};
		int result = ex.maxAbsolute(numbers);
		assertEquals(4.0f,result,0.0f);
	}

}
