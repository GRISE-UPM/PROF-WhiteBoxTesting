package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Test_foo2Test {

	@Test
	public void test() {
		Exercises exc = new Exercises();
		float real = exc.foo2(1,(float)0.5);
		float ideal = (float) 2.0;
		
		if(real != ideal) {
			fail("Ideal distinto del real");
		}
		
		real = exc.foo2(1,(float)2);
		ideal = (float) 1.5;
		
		if(real != ideal) {
			fail("Ideal distinto del real");
		}
		
		real = exc.foo2((float) 1,(float)1);
		ideal = (float) 2;
		
		if(real != ideal) {
			fail("Ideal distinto del real");
		}
		
		real = exc.foo2((float) 2,(float)1);
		ideal = (float) 1.5;
		
		if(real != ideal) {
			fail("Ideal distinto del real");
		}
		
		real = exc.foo2((float) 2,(float)2);
		ideal = (float) 2;
		
		if(real != ideal) {
			fail("Ideal distinto del real");
		}
	}
	
	

}
