package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {
	
	@Test
	public void test() {
		Exercises test = new Exercises();
		
		int[][] function_input = {
				{ 0, 1, 2, 3, 4, 5 },
				{ -1, 0, 1 },
				{ 0, 1, 2 }
		};
		float output_values[][] = { 
				{ -1, test.maxAbsolute(function_input[0]) },	// { Expected output, Actual output }
				{ 1, test.maxAbsolute(function_input[1]) },
				{ 2, test.maxAbsolute(function_input[2]) },
		};
		
		for(int i = 0; i < output_values.length; i++)
				assertEquals(output_values[i][0], output_values[i][1], 0.001*output_values[i][1]);
	}
}