package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Test_convertInt {

	private Exercises.convertInt convertInt;

	@Before
	public void setUp() {

		convertInt = new Exercises().new convertInt();
	}

	@Test(expected = Exception.class)
	public void testPath1() throws Exception {

		char[] string = { '0', '1', '2', '3', '4', '5', '6'};
		executeTest(string, 0);
	}

	@Test
	public void testPath2() throws Exception {

		char[] string = { '-', '1'};
		executeTest(string, - (int) ('1'));
	}

	@Test
	public void testPath3() throws Exception {

		char[] string = {'1'};
		executeTest(string, ('1'));
	}

	@Test(expected = Exception.class)
	public void testPath4() throws Exception {

		char[] string = {'1', '2', '3', '4', '5'};
		executeTest(string, 0);
	}

	@Test(expected = Exception.class)
	public void testPath5() throws Exception {

		char[] string = {'-', '1', '2', '3', '4', '5'};
		executeTest(string, 0);
	}

	@Test(expected = NullPointerException.class)
	public void testPath6() throws Exception {

		executeTest(null, 0);
	}

	private void executeTest(char[] string, int expected) throws Exception {

		int result = convertInt.convert(string);
		assertEquals(result, expected);
	}
}
