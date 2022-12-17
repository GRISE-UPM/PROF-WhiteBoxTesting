package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	@Test
	public void test() {
		Exercises e = new Exercises();
		float x = 0;
		float y = 0;
		assertThrows(Exception.class, () -> e.foo1(x, y));
	}

}
