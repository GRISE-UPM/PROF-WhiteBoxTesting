package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

public class Test_foo2 {

	// Math.cos(double x) -> x in radians
	// Math.toRadians(double x) -> x in degrees

	private static Exercises exercises;

	@BeforeAll
	void setUp() {
		System.out.println("Setting up foo2 test...");
		exercises = new Exercises();
	}

	@Test
	@DisplayName("Test with both angles as NaN that should return NaN")
	void resNaN_BothNaNDegree() {
		float b = (float) Math.toRadians(Float.NaN);
		float a = (float) Math.toRadians(Float.NaN);

		assertEquals(Float.NaN, exercises.foo2(a, b), 0.01);
	}

	@Test
	@DisplayName("Test with the first angle as NaN that should return NaN")
	void resNaN_FirstDegreeIsNaN() {
		float b = (float) Math.toRadians(Float.NaN);
		float a = (float) Math.toRadians(90);

		assertEquals(Float.NaN, exercises.foo2(a, b), 0.01);
	}

	@Test
	@DisplayName("Test with the second angle as NaN that should return 2")
	void resTwo_FirstDegreeIsNaN() {
		float b = (float) Math.toRadians(90);
		float a = (float) Math.toRadians(Float.NaN);

		assertEquals(2.0, exercises.foo2(a, b), 0.01);
	}

	@Test
	@DisplayName("Test with angles as positive and negative infinities that should return NaN")
	void resNaN_PosAndNegInfinityEachDegree() {
		float b = (float) Math.toRadians(Float.POSITIVE_INFINITY);
		float a = (float) Math.toRadians(Float.NEGATIVE_INFINITY);

		assertEquals(Float.NaN, exercises.foo2(a, b), 0.01);
	}

	@Test
	@DisplayName("Test with both angles as negative infinity that should return a negative infinity")
	void resMinusInfinity_NegInfinityEachDegree() {
		float b = (float) Math.toRadians(Float.NEGATIVE_INFINITY);
		float a = (float) Math.toRadians(Float.NEGATIVE_INFINITY);

		assertEquals(Float.NEGATIVE_INFINITY, exercises.foo2(a, b), 0.01);
	}

	@Test
	@DisplayName("Test with two 90 degree angles that should result on 0, but it doesn't due to lack of precision")
	void nearZeroCos_90Degrees() {
		float a = (float) Math.toRadians(90);
		float b = (float) Math.toRadians(90);

		assertEquals(1.57, exercises.foo2(a, b), 0.01);
	}

	@Test
	@DisplayName("Test with two 0 degree anges that should return 2.0")
	void resEqTwo_0Degrees(){
		float a = (float) Math.toRadians(0);
		float b = (float) Math.toRadians(0);

		assertEquals(2.0, exercises.foo2(a, b), 0.01);
	}

	@Test
	@DisplayName("Test with to angles with a positive and negative cos, that should return 1.57...")
	void twoAngles_PosAndNegCos() {
		float a = (float) Math.toRadians(45);
		float b = (float) Math.toRadians(135);

		assertEquals(1.57, exercises.foo2(a, b), 0.01);
	}

	@AfterAll
	void tearDown() {
		System.out.println("foo2 tests done.");
	}
}
