package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	@Test
	public void test() {
		Exercises exc = new Exercises();
		
		int[] testeo = {1,4,2,5,-10};
		
		float real = exc.maxAbsolute(testeo);
		int ideal = 10;
		
		if(real != ideal) {
			fail("Ideal distinto del real");
		}
	}
	
	@Test
	public void test_tamanio() {
		Exercises exc = new Exercises();
		
		int[] testeo = {1,4,2,5,-10,11};
		
		float real = exc.maxAbsolute(testeo);
		int ideal = -1;
		
		if(real != ideal) {
			fail("Ideal distinto del real");
		}
	}

}
