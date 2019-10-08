package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {
	
	@Test
	public void test() {
		Exercises test = new Exercises();
		
		float pi = (float)Math.PI;
		float output_values[][] = { 
				{ 2, test.foo2(2*pi, pi) },	// { Expected output, Actual output }
				{ 2, test.foo2(0, 0) },
				{ pi/2, test.foo2(0, pi) },
				{ 2, test.foo2(pi, 2*pi) }
		};
		
		for(int i = 0; i < output_values.length; i++)
				assertEquals(output_values[i][0], output_values[i][1], 0.001*output_values[i][1]);
	}
}