package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

//OSCAR: La CC = 7, por lo que harían falta 7 tests. Bien es cierto que se puede conseguir

//una cobertura del 100% con menos tests al incluir más de una rama en cada camino indepen-

//diente

public class Test_convertInt {
	
	@Test
	public void test() {
		Exercises Exercises_object = new Exercises();
		Exercises.convertInt test = Exercises_object.new convertInt();

		char[][] function_input = {
				{'1','2','3','4','5','6','7'},
				{'-','1','1'},
				{'1','1'},
				{'9','9','9','9','9'},
				{'-','9','9','9','9','9'}
		};
		int expected_values[] = {
				0, // Expected exception on iteration 0
				-539,
				539,
				0, // Expected exception on iteration 3
				0 // Expected exception on iteration 4
		};

		for(int i = 0; i < function_input.length; i++) {
			try {
				int function_output = test.convert(function_input[i]);
					
				assertEquals(expected_values[i], function_output, 0.001*function_output);
		
			} catch(Exception e) {
				System.out.print("Exception thwrown on iteration " + i + "\n");
				
			};
		};
	};
};