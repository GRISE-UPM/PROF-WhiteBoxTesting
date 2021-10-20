package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {

	@Test
	public void test() throws Exception {
		Exercises.convertInt ej = new Exercises.convertInt();
		char [] chain1 = {'h','o'};
		assertEquals(ej.convert(chain1),623, 0);

		char [] chain2 = {'-','o'};
		assertEquals(ej.convert(chain2), -63, -0);
	}



}
