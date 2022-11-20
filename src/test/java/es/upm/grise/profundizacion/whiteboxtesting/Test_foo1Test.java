package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class Test_foo1Test {

	@SuppressWarnings("deprecation")
	@Test
	void test() {
		Exercises exc = new Exercises();

		assertEquals(2,exc.foo1(6,32));
	}

}
