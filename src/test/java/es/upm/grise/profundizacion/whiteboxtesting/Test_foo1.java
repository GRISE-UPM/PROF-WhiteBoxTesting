package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_foo1 {

	private static Exercises exer;
	
	public Test_foo1() {
		exer = new Exercises();
	}
	
	@Test
	@DisplayName("Test foo1: x < 5")
	public void testXsmaller5() {
		assertEquals(12, exer.foo1(2, 24));
	}
	
	@Test
	@DisplayName("Test foo1: x > 5")
	public void testXlarger5() {
		assertEquals(1, exer.foo1(14, 24));
	}

}
