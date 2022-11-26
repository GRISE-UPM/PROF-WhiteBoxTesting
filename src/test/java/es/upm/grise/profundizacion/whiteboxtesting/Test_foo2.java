package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_foo2 {
	
	private Exercises e = new Exercises();
	
	// Note I think we could do this testing with 2 tests.
	// When the the cosine condition is false,
	// the first if condition, which potentially switches
	// the order of a and b does not change the
	// result of (a + b) / 2, and
	// for the case where the cosine condition is true,
	// the truth value of that condition
	// may be unaffected by the a and b switch as well.
	// a = 5 b = 2 (> is true, switch)
	// a = 2 b = 5
	// computes Math.cos(2) < 0 || Math.cos(5) > 0
	// And:
	// a = 2 b = 5 (> is false, no switch)
	// a = 2 b = 5
	// computes Math.cos(2) < 0 || Math.cos(5) > 0
	// In other words, it computes the same thing
	// because we are ensuring b is the greater number.
	// So 2 tests *may* suffice. One of:
	// TrueTrue && TrueFalse or
	// FalseTrue && TrueFalse or
	// TrueTrue && FalseFalse or
	// FalseTrue && FalseFalse
	// Regardless, because this is not a formal proof and
	// for simplicity, I include all 4 tests.

	@Test
	public void onTrueTrue() {
		// (a > b): true (0.5 > 0.2)
		// (Math.cos(a) < 0 || Math.cos(b) > 0): true (cos(0.5) ~ 0.88)
 		assertEquals(2f, e.foo2(0.5f, 0.2f), 0.01);
 	}
	
	@Test
	public void onFalseTrue() {
		// (a > b): false (0.2 < 0.5)
		// (Math.cos(a) < 0 || Math.cos(b) > 0): true (cos(0.5) ~ 0.88)
		// Same result because only the second if being true matters,
		// akin to onWhateverTrue.
 		assertEquals(2f, e.foo2(0.2f, 0.5f), 0.01);
 	}
	
	@Test
	public void onTrueFalse() {
		// (a > b): true (500.0 > 200.0)
		// (Math.cos(a) < 0 || Math.cos(b) > 0): false (cos(200.0) ~ 0.48, cos(500.0) ~ -0.88)
		assertEquals(350f, e.foo2(500f, 200f), 0.01);
 	}
	
	@Test
	public void onFalseFalse() {
		// (a > b): false (200.0 < 500.0)
		// (Math.cos(a) < 0 || Math.cos(b) > 0): false (cos(200.0) ~ 0.48, cos(500.0) ~ -0.88)
		// Same result because only the second if being false matters,
		// akin to onWhateverFalse.
		assertEquals(350f, e.foo2(200f, 500f), 0.01);
 	}
	
}
