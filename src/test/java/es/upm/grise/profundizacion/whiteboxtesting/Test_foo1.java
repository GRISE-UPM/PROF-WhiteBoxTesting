package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_foo1 {
	Exercises ex = new Exercises();
	
	@Test
	public void cumpleCondicionIf() {
		Assertions.assertEquals(2.0, ex.foo1(6,32), 0);
	}
	
	@Test
	public void noCumpleCondicionIf() {
		Assertions.assertEquals(5.0, ex.foo1(2,10), 0);
	}
}
