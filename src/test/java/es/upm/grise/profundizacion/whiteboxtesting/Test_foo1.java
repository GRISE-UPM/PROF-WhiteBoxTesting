package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class Test_foo1 {

	float x;
	float y;
	float expected;
	float actual;
	float delta = 0;
	Exercises ej = new Exercises();

	@Test
	public void testXSmallerThan5(){
		x = 4;
		y = 4;
		expected = y/x;
		actual = ej.foo1(x,y);
		assertEquals(expected,actual,delta);
	}

	@Test
	public void testXBiggerThan5(){
		x = 7;
		y = 7;
		actual = ej.foo1(x,y);
		expected = y/(x+10);
		assertEquals(expected,actual,delta);
	}
}
