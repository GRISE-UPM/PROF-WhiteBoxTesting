package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class Test_foo2 {

	////////////////////////////////////////////////// RANDOMIZATION ///////////////////////////////////////////////////

	private static final Random random = new SecureRandom();

	private static double inRangeClosed(double min, double max) {
		return min + (max - min) * random.nextDouble();
	}

	private static float inRangeClosed(float min, float max) {
		return (float) inRangeClosed((double) min, (double) max);
	}

	///////////////////////////////////////////////////// TESTING //////////////////////////////////////////////////////

	private Exercises exercises = new Exercises();

	// Testea que la condicion (cos(a) || cos(b)) se cumple (TRUE || TRUE) con radiantes positivos y negativos.
	// También testea que cuando a > b se hace el swapping, es decir, la condición pasa a ser (FALSE || FALSE).
	// NOTA: No testea cuando el coseno de a o b es 0.
	@Test
	public void test_true_true() {
		// Create a random angle with negative cosinus
		float a_pos = inRangeClosed( 90.0F + Float.MIN_NORMAL,  270.0F - Float.MIN_NORMAL); // Positive angle
		float a_neg = inRangeClosed(-90.0F - Float.MIN_NORMAL, -270.0F + Float.MIN_NORMAL); // Negative angle

		// Create a random angle with positive cosinus
		float b_pos_small = inRangeClosed(   0.0F,                      90.0F - Float.MIN_NORMAL); // Positive angle (< a)
		float b_pos_big   = inRangeClosed( 270.0F + Float.MIN_NORMAL,  360.0F - Float.MIN_NORMAL); // Positive angle (> a)
		float b_neg_small = inRangeClosed(   0.0F,                     -90.0F + Float.MIN_NORMAL); // Negative angle (< a)
		float b_neg_big   = inRangeClosed(-270.0F - Float.MIN_NORMAL, -360.0F + Float.MIN_NORMAL); // Negative angle (> a)

		// Testing logic
		float[] results_fixed = new float[]{ // Results that negate the first branch
				(float) Math.toRadians(a_pos), (float) Math.toRadians(b_pos_big),
				(float) Math.toRadians(a_neg), (float) Math.toRadians(b_pos_small),
				(float) Math.toRadians(a_neg), (float) Math.toRadians(b_pos_big),
				(float) Math.toRadians(a_neg), (float) Math.toRadians(b_neg_small)
		};
		float[] results_swapped = new float[]{ // Results that pass the first branch
				(float) Math.toRadians(a_pos), (float) Math.toRadians(b_pos_small),
				(float) Math.toRadians(a_pos), (float) Math.toRadians(b_neg_small),
				(float) Math.toRadians(a_pos), (float) Math.toRadians(b_neg_big),
				(float) Math.toRadians(a_neg), (float) Math.toRadians(b_neg_big)
		};
		for (int i = 0; i < results_fixed.length; i++) {
			float a = results_fixed[i++];
			float b = results_fixed[i];
			assertEquals(2.0F, exercises.foo2(a, b), 0.0F);
		}
		for (int i = 0; i < results_swapped.length; i++) {
			float a = results_swapped[i++];
			float b = results_swapped[i];
			assertEquals((a + b) / 2.0F, exercises.foo2(a, b), 0.0F);
		}
	}

	// Testea que la condicion (cos(a) || cos(b)) se cumple (TRUE || FALSE) con radiantes positivos y negativos.
	// También testea que cuando a > b se hace el swapping, es decir, la condición pasa a ser (FALSE || TRUE).
	// NOTA: No testea cuando el coseno de a o b es 0.
	@Test
	public void test_true_false() {
		// Create a random angle with negative cosinus
		float a_pos = inRangeClosed( 90.0F + Float.MIN_NORMAL,  270.0F - Float.MIN_NORMAL); // Positive angle
		float a_neg = inRangeClosed(-90.0F - Float.MIN_NORMAL, -270.0F + Float.MIN_NORMAL); // Negative angle

		// Create a random angle with negative cosinus
		float b_pos_small = inRangeClosed(90.0F   + Float.MIN_NORMAL,  a_pos  - Float.MIN_NORMAL); // Positive angle (< a)
		float b_pos_big   = inRangeClosed(a_pos,                       270.0F - Float.MIN_NORMAL); // Positive angle (>= a)
		float b_neg_small = inRangeClosed(a_neg   + Float.MIN_NORMAL, -90.0F  + Float.MIN_NORMAL); // Negative angle (< a)
		float b_neg_big   = inRangeClosed(-270.0F + Float.MIN_NORMAL,  a_neg);                     // Negative angle (>= a)

		// Testing logic
		float[] results_fixed = new float[]{ // Results that negate the first branch
				(float) Math.toRadians(a_pos), (float) Math.toRadians(b_pos_big),
				(float) Math.toRadians(a_neg), (float) Math.toRadians(b_pos_small),
				(float) Math.toRadians(a_neg), (float) Math.toRadians(b_pos_big),
				(float) Math.toRadians(a_neg), (float) Math.toRadians(b_neg_small)
		};
		float[] results_swapped = new float[]{ // Results that pass the first branch
				// a > 0 and b > 0
				(float) Math.toRadians(a_pos), (float) Math.toRadians(b_pos_small),
				// a > 0 but b < 0
				(float) Math.toRadians(a_pos), (float) Math.toRadians(b_neg_small),
				(float) Math.toRadians(a_pos), (float) Math.toRadians(b_neg_big),
				// a < 0 and b < 0
				(float) Math.toRadians(a_neg), (float) Math.toRadians(b_neg_big)
		};
		for (int i = 0; i < results_fixed.length; i++) {
			float a = results_fixed[i++];
			float b = results_fixed[i];
			assertEquals(2.0F, exercises.foo2(a, b), 0.0F);
		}
		for (int i = 0; i < results_swapped.length; i++) {
			float a = results_swapped[i++];
			float b = results_swapped[i];
			assertEquals(2.0F, exercises.foo2(a, b), 0.0F);
		}
	}

	// Testea que la condicion (cos(a) || cos(b)) se cumple (FALSE || TRUE) con radiantes positivos y negativos.
	// También testea que cuando a > b se hace el swapping, es decir, la condición pasa a ser (TRUE || FALSE).
	// NOTA: No testea cuando el coseno de a o b es 0.
	@Test
	public void test_false_true() {
		// Create a random angle with positive cosinus
		float b_pos_small = inRangeClosed(   0.0F,                      90.0F - Float.MIN_NORMAL); // Positive angle
		float b_pos_big   = inRangeClosed( 270.0F + Float.MIN_NORMAL,  360.0F - Float.MIN_NORMAL); // Positive angle
		float b_neg_small = inRangeClosed(   0.0F,                     -90.0F + Float.MIN_NORMAL); // Negative angle
		float b_neg_big   = inRangeClosed(-270.0F - Float.MIN_NORMAL, -360.0F + Float.MIN_NORMAL); // Negative angle

		// Create a random angle with positive cosinus
		float a_pos_small_small = inRangeClosed(       0.0F,                     b_pos_small);               // Positive angle (<= b)
		float a_pos_small_big   = inRangeClosed(b_pos_small + Float.MIN_NORMAL,  90.0F - Float.MIN_NORMAL);  // Positive angle (> b)
		float a_pos_big_small   = inRangeClosed(     270.0F + Float.MIN_NORMAL,  b_pos_big);                 // Positive angle (<= b)
		float a_pos_big_big     = inRangeClosed(  b_pos_big + Float.MIN_NORMAL,  360.0F - Float.MIN_NORMAL); // Positive angle (> b)
		float a_neg_small_small = inRangeClosed(       0.0F,                     b_neg_small);               // Negative angle (<= b)
		float a_neg_small_big   = inRangeClosed(b_neg_small + Float.MIN_NORMAL, -90.0F + Float.MIN_NORMAL);  // Negative angle (> b)
		float a_neg_big_small   = inRangeClosed(    -270.0F - Float.MIN_NORMAL,  b_neg_big);                 // Negative angle (<= b)
		float a_neg_big_big     = inRangeClosed(  b_neg_big + Float.MIN_NORMAL, -360.0F + Float.MIN_NORMAL); // Negative angle (> b)

		// Testing logic
		float[] results_fixed = new float[]{ // Results that negate the first branch
				// a > 0 and b > 0
				(float) Math.toRadians(a_pos_small_small), (float) Math.toRadians(b_pos_small),
				(float) Math.toRadians(a_pos_small_big),   (float) Math.toRadians(b_pos_big),
				(float) Math.toRadians(a_pos_big_small),   (float) Math.toRadians(b_pos_big),
				// a < 0 and b < 0
				(float) Math.toRadians(a_neg_small_small), (float) Math.toRadians(b_neg_small),
				(float) Math.toRadians(a_neg_small_big),   (float) Math.toRadians(b_neg_big),
				(float) Math.toRadians(a_neg_big_small),   (float) Math.toRadians(b_neg_big)
		};
		float[] results_swapped = new float[]{ // Results that pass the first branch
				// a > 0 and b > 0
				(float) Math.toRadians(a_pos_small_big), (float) Math.toRadians(b_pos_small),
				(float) Math.toRadians(a_pos_big_small), (float) Math.toRadians(b_pos_small),
				(float) Math.toRadians(a_pos_big_big),   (float) Math.toRadians(b_pos_small),
				(float) Math.toRadians(a_pos_big_big),   (float) Math.toRadians(b_pos_big),
				// a > 0 but b < 0
				(float) Math.toRadians(a_pos_small_small), (float) Math.toRadians(b_neg_small),
				(float) Math.toRadians(a_pos_small_small), (float) Math.toRadians(b_neg_big),
				(float) Math.toRadians(a_pos_small_big),   (float) Math.toRadians(b_neg_small),
				(float) Math.toRadians(a_pos_small_big),   (float) Math.toRadians(b_neg_big),
				(float) Math.toRadians(a_pos_big_small),   (float) Math.toRadians(b_neg_small),
				(float) Math.toRadians(a_pos_big_small),   (float) Math.toRadians(b_neg_big),
				(float) Math.toRadians(a_pos_big_big),     (float) Math.toRadians(b_neg_small),
				(float) Math.toRadians(a_pos_big_big),     (float) Math.toRadians(b_neg_big),
				// a < 0 and b < 0
				(float) Math.toRadians(a_neg_small_big), (float) Math.toRadians(b_neg_small),
				(float) Math.toRadians(a_neg_big_small), (float) Math.toRadians(b_neg_small),
				(float) Math.toRadians(a_neg_big_big),   (float) Math.toRadians(b_neg_small),
				(float) Math.toRadians(a_neg_big_big),   (float) Math.toRadians(b_neg_big)
		};
		for (int i = 0; i < results_fixed.length; i++) {
			float a = results_fixed[i++];
			float b = results_fixed[i];
			assertEquals(2.0F, exercises.foo2(a, b), 0.0F);
		}
		for (int i = 0; i < results_swapped.length; i++) {
			float a = results_swapped[i++];
			float b = results_swapped[i];
			assertEquals(2.0F, exercises.foo2(a, b), 0.0F);
		}
	}

	// Testea que la condicion (cos(a) || cos(b)) se cumple (FALSE || FALSE) con radiantes positivos y negativos.
	// También testea que cuando a > b se hace el swapping, es decir, la condición pasa a ser (TRUE || TRUE).
	// NOTA: No testea cuando el coseno de a o b es 0.
	@Test
	public void test_false_false() {
		// Create a random angle with negative cosinus
		float b_pos = inRangeClosed( 90.0F + Float.MIN_NORMAL,  270.0F - Float.MIN_NORMAL); // Positive angle
		float b_neg = inRangeClosed(-90.0F - Float.MIN_NORMAL, -270.0F + Float.MIN_NORMAL); // Negative angle

		// Create a random angle with positive cosinus
		float a_pos_small = inRangeClosed(   0.0F,                      90.0F - Float.MIN_NORMAL); // Positive angle (< b)
		float a_pos_big   = inRangeClosed( 270.0F + Float.MIN_NORMAL,  360.0F - Float.MIN_NORMAL); // Positive angle (> b)
		float a_neg_small = inRangeClosed(   0.0F,                     -90.0F + Float.MIN_NORMAL); // Negative angle (< b)
		float a_neg_big   = inRangeClosed(-270.0F - Float.MIN_NORMAL, -360.0F + Float.MIN_NORMAL); // Negative angle (> b)

		// Testing logic
		float[] results_fixed = new float[]{ // Results that negate the first branch
				(float) Math.toRadians(a_pos_small), (float) Math.toRadians(b_pos),
				(float) Math.toRadians(a_neg_small), (float) Math.toRadians(b_pos),
				(float) Math.toRadians(a_neg_big),   (float) Math.toRadians(b_pos),
				(float) Math.toRadians(a_neg_big),   (float) Math.toRadians(b_neg)
		};
		float[] results_swapped = new float[]{ // Results that pass the first branch
				(float) Math.toRadians(a_pos_big),   (float) Math.toRadians(b_pos),
				(float) Math.toRadians(a_pos_small), (float) Math.toRadians(b_neg),
				(float) Math.toRadians(a_pos_big),   (float) Math.toRadians(b_neg),
				(float) Math.toRadians(a_neg_small), (float) Math.toRadians(b_neg)
		};
		for (int i = 0; i < results_fixed.length; i++) {
			float a = results_fixed[i++];
			float b = results_fixed[i];
			assertEquals((a + b) / 2.0F, exercises.foo2(a, b), 0.0F);
		}
		for (int i = 0; i < results_swapped.length; i++) {
			float a = results_swapped[i++];
			float b = results_swapped[i];
			assertEquals(2.0F, exercises.foo2(a, b), 0.0F);
		}
	}

	// WARNING: He intentado testear en el caso en el que el coseno de "a" o el coseno de "b" es 0, porque eso haría que
	// una condición que era FALSE no pase a ser TRUE al hacer el swap, pero no se puede testear por una cuestión
	// técnica: el coseno de 90 y 270 nunca dará 0 en Java por un error de precisión del estándar IEEE754.
	// Por esta razón ya no hay más tests.

}
