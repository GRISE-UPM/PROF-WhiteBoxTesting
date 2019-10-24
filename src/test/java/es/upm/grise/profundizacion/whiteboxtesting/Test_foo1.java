package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

//OSCAR: CC=2, por lo que hacen falta 2 casos de prueba. En EclEmma se ve perfectamente que falta
// un camino.

public class Test_foo1 {

	@Test
	public void test() {
		Exercises foo1Test = new Exercises();
		float result = foo1Test.foo1(6.0f, 32.0f);
		TestCase.assertEquals(2.0f, result);
	}

}
