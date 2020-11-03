package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_foo2 {

	Exercises ex = new Exercises();

	@Test
	public void bMayorA() {
		Assertions.assertEquals(7.0f, ex.foo2(6.0f, 8.0f), 0.0f);
	}

	@Test
	public void aMayorB() {
		Assertions.assertEquals(7.0f, ex.foo2(8.0f, 6.0f), 0.0f);
	}

	@Test
	public void cosAMenorCero() {
		Assertions.assertEquals(2.0f, ex.foo2(4.0f, 8.0f), 0.0f);
	}

	@Test
	public void cosbMayorCero() {
		Assertions.assertEquals(2.0f, ex.foo2(5.0f, 11.0f), 0.0f);
	}
}