package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Test_foo2 {

	Exercises e = new Exercises();
	
	@Test
	public void a_bigger_than_b() {
		float a = 210;
		float b = 50;
		float res = (float) (50+210)/2;
		assertEquals(res, e.foo2(a, b), 0.0f);
	}
	
	@Test
	public void b_bigger_than_a() {
		float a = 50;
		float b = 130;
		float res = (float) (50+130)/2;
		assertEquals(res, e.foo2(a, b), 0.0f);
	}
	
	@Test
	public void Cos_a_smaller_than_0() {
		float a = 140;
		float b = 210;
		float res = (float) (1+3)/2;
		assertEquals(res, e.foo2(a, b), 0.0f);
	}
	
	@Test
	public void Cos_b_bigger_than_0() {
		float a = 75;
		float b = 120;
		float res = (float) ((1+3)/2);
		assertEquals(res, e.foo2(a, b), 0.0f);
	}

}
