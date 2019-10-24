package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {	
	
	//OSCAR: Es preferible que cada caso de prueba vaya en un @Test distinto. También es
	// pposible utilizar tests parametrizados. Lo veremos en breve.
	
	@Test
	public void test() {
		Exercises test = new Exercises();
		
		float output_values[][] = { 
				{ 2, test.foo1(10, 40) },	// { Expected output, Actual output }
				{ 5, test.foo1(2, 10) }
		};
		
		for(int i = 0; i < output_values.length; i++)
				assertEquals(output_values[i][0], output_values[i][1], 0.001*output_values[i][1]);
	}
}
