package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {
Exercises ex = new Exercises();

	@Test
	public void x_1_y_2_returns_2() {
		assertEquals(2.0, ex.foo1(1, 2),0.01 );
	}
	
	@Test
	public void x_10_y_2_returns_2() {
		assertEquals(0.1, ex.foo1(10, 2),0.01 );
	}

}
