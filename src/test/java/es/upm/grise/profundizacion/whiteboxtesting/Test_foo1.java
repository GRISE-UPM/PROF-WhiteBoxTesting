package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test_foo1 {

	Exercises testClass = new Exercises();

	@Test
	public void testOk() {
		Assertions.assertEquals(2.5,testClass.foo1(4, 10));
	}
	@Test
	public void testHighValue() {
		Assertions.assertEquals(15.625,testClass.foo1(6, 250));
	}

}
