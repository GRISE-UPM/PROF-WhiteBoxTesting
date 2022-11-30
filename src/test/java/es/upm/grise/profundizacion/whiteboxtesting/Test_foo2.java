package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Assert;
import org.junit.Test;

public class Test_foo2 {
	Exercises exercises = new Exercises();
	final float PI = (float) Math.PI;

	@Test
	public void testParameterOrderIrrelevant() {

		Assert.assertEquals(exercises.foo2(2564,145), exercises.foo2(145,2564), 0f);

	}

	@Test
	public void testBothOver180() {

		Assert.assertEquals(2, exercises.foo2(PI + 1,PI + 0.1f), 0f);

	}

	@Test
	public void testNoneOver90() {

		Assert.assertEquals(2, exercises.foo2(PI- 0.1f, PI - 0.2f), 0f);

	}

	@Test
	public void testOneOver180OneUnder90() {
		Assert.assertEquals(((PI+ 0.1f) + (PI/2 - 0.1f))/2, exercises.foo2(PI+ 0.1f,(PI/2) - 0.1f), 0f);
	}

	@Test
	public void testOneOver90Under180() {
		Assert.assertEquals(((PI/2) - 0.1+(PI/2)+0.1)/2f, exercises.foo2((PI/2) + 0.1f,(PI/2) - 0.1f), 0f);
	}
	@Test
	public void testBoth90() {
		// This is a bug: We do not have a delta on Math.cos comparison so it will pretty much never think it is truly 0.
		// However we're told the classes function correctly yadda yadda so have a bugged, useless test case for the edge case

		Assert.assertEquals(2, exercises.foo2(PI/2,PI/2), 0f);
	}


}
