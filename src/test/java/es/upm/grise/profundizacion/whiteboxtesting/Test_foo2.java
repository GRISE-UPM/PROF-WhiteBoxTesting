package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

public class Test_foo2 {

	float a;
	float b;
	float expected;
	float actual;
	float delta = 0;
	Exercises ej = new Exercises();

	@Test
	public void aBiggerThanB() {

		a = 5;
		b = 4;
		expected = (1+3)/2;
		actual = ej.foo2(a,b);

		assertEquals(expected,actual,delta);

	}

	@Test
	public void bBiggerThanA(){

		a = 4;
		b = 5;
		expected = (1+3)/2;
		actual = ej.foo2(a,b);
	}
}
