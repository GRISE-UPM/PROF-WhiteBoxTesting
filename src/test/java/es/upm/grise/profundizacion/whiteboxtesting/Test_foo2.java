package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test_foo2 {

	Exercises testClass = new Exercises();

	@Test
	public void testOk() {
		Assertions.assertEquals(2.0,testClass.foo2(4, 10));
	}
	@Test
	public void testHighValue() {
		Assertions.assertEquals(2.0,testClass.foo2(20, 5));
	}

}
