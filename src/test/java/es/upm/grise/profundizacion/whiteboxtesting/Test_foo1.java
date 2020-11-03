package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_foo1 {
	Exercises ex = new Exercises();

	@Test
	public void caminoPorIf() {
		Assertions.assertEquals(1.0, ex.foo1(10,20), 0);
	}

	@Test
	public void caminoSinIf() {
		Assertions.assertEquals(2.0, ex.foo1(2,4), 0);
	}
}