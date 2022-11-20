package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

class Test_convertIntTestTest {

	@Test
	void test() throws Exception {
		Exercises exc = new Exercises();
		convertInt converter = exc.new convertInt();
		
		char[] num = {'9','\0'};
		int numReal = 9;
		
		assertEquals(numReal,converter.convert(num));
		// fail("Not yet implemented");
	}

}
