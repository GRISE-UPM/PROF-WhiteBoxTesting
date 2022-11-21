package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Test_foo1 {

	Exercises e = new Exercises();
	
	@Test
	public void number_bigger_than_5() {
		float x = 6;
		float y = 16;
		float res = 16/(6+10);
		assertEquals(res, e.foo1(x, y), 0.0f);
	}

	@Test
	public void number_smaller_equal_or_than_5() {
		float x = 4;
		float y = 14;
		float res = (float) 14/4;
		assertEquals(res, e.foo1(x, y), 0.0f);
	}
}
