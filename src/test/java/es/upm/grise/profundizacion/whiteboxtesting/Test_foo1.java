package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_foo1 {

	private Exercises e = new Exercises();

	@Test
	public void onXGreaterThan5() {
 		assertEquals(2f, e.foo1(6f, 32f), 0.01);
 	}
	
	@Test
	public void onXNotGreaterThan5() {
 		assertEquals(16f, e.foo1(4f, 64f), 0.01);
 	}
	
	// Note in Java the cyclomatic complexity may be 2 (I'm no expert)
	// but in languages such as Python division by 0 will throw
	// ZeroDivisionError so in such languages 3 tests should occur.
	// This is akin to functions, e.g.
	// y = ... if x >= ...
	// y = ... if x < ...
	// where you additionally have to study critical points 
	
	@Disabled
	@Test
	public void onXEqualTo0() {
		// In Java division by 0 seems to work, so two tests may suffice
 		assertEquals(Float.POSITIVE_INFINITY, e.foo1(0f, 32f), 0.01);
 	}

}
