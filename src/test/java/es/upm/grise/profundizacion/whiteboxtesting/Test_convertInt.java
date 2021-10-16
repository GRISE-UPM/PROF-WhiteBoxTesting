package es.upm.grise.profundizacion.whiteboxtesting;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Test_convertInt {

	@Test
	public void test() {
		Exercises exercises = new Exercises();
		convertInt convertInt = exercises.new convertInt();
		char [] a = new char[1];
		a[0] = '5';
		try {
			assertEquals(convertInt.convert(a),5);
		} catch (Exception e) {
			fail("Salto excepcion");
			e.printStackTrace();
		}

	}

}
