package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertIntTest {

	@Test
	public void test() throws Exception {
		Exercises exc = new Exercises();
		convertInt converter = exc.new convertInt();
		
		char[] num = {'9','\0'};
		
		assertEquals(9,converter.convert(num));
		//fail("Not yet implemented");
	}

}
