package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	@Test
	public void test() {
		Exercises ej2 = new Exercises();
		float a1 = 1;
		float b1 = 0;
		assertEquals(ej2.foo2(a1,b1), 2,0);
		float a2 = 3;
		float b2 = 4;
		assertEquals(ej2.foo2(a1,b1), 2,0);
		assertNotEquals(3,ej2.foo2(a2,b2));
	}

}
