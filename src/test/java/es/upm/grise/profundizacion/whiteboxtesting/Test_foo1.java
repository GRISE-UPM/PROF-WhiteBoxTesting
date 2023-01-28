package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Test_foo1 {

	@Test
	public void not_number_test() {
		Exercises e = new Exercises();
		char x = 'e';
		char y = 'f';
		assertEquals((float)'f'/(float)'o', e.foo1(x, y));
	}
	
	@Test
	public void x_more_than_5_test() {
		Exercises e = new Exercises();
		float x = (float)6.0;
		float y = (float)16.0;
		assertEquals(1.0, e.foo1(x, y));
	}
	
	@Test
	public void x_less_than_5_test() {
		Exercises e = new Exercises();
		float x = (float)2.0;
		float y = (float)6.0;
		assertEquals(3.0, e.foo1(x, y));
	}

}
