package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;


class Test_foo1Test {
	@Test
	void test() {
		Exercises exc = new Exercises();
		float real = exc.foo1(6,32);
		float ideal = 2;
		if(real != ideal) {
			fail("Ideal distinto del real");
		}
		
		ideal = 1;
		real = exc.foo1(1,1);
		if(real != ideal) {
			fail("Ideal distinto del real");
		}
		
	}

}
