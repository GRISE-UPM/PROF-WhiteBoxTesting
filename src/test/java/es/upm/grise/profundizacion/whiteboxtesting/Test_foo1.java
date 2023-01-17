package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Test_foo1 {

	Exercises e = new Exercises();
	
	@Test
	public void x_bigger_than_5() {
		float x = 6;
		float y = 16;
		float res = 16/(6+10);
		assertEquals(res, e.foo1(x, y), 0.0f);
	}

	@Test
	public void x_smaller_than_5() {
		float x = 4;
		float y = 14;
		float res = (float) 14/4;
		assertEquals(res, e.foo1(x, y), 0.0f);
	}
	
	@Test
	public void x_equal_to_5() {
		float x = 5;
		float y = 14;
		float res = (float) 14/5;
		assertEquals(res, e.foo1(x, y), 0.0f);
	}
	
	@Test
	public void negative_x() {
		float x = -5;
		float y = 14;
		float res = (float) 14/(-5);
		assertEquals(res, e.foo1(x, y), 0.0f);
	}
	
	@Test
	public void y_equals_to_0() {
		float x = 5;
		float y = 0;
		float res = (float) 0/4;
		assertEquals(res, e.foo1(x, y), 0.0f);
	}
	
	@Test
	public void x_equals_to_0_positive_infinity() {
		float x = 0;
		float y = 15;
		float res = Float.POSITIVE_INFINITY;
		assertEquals(res, e.foo1(x, y), 0.0f);
	}
	
	@Test
	public void x_equals_to_0_negative_infinity() {
		float x = 0;
		float y = -15;
		float res = Float.NEGATIVE_INFINITY;
		assertEquals(res, e.foo1(x, y), 0.0f);
	}
	
	@Test
	public void x_equals_to_0_y_equals_to_0() {
		float x = 0;
		float y = 0;
		float res = Float.NaN;
		assertEquals(res, e.foo1(x, y), 0.0f);
	}
}
