package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {

	Exercises ex = new Exercises();


	@Test
	public void minor6TrueSymbol() throws Exception {
		String sstr = "-123";
		char [] str = sstr.toCharArray();
		assertEquals(-123,ex.accesToConvert(str));
	}


	@Test
	public void minor6FalseSymbol() throws Exception {
		char[]str = {'1','2','3'};
		assertEquals(123,ex.accesToConvert(str));
	}


	@Test(expected = Exception.class)
	public void minor6Major32767() throws Exception {
		char[]str = {'3','2','7','6','8'};
		assertEquals(32768,ex.accesToConvert(str));
	}

	@Test(expected = Exception.class)
	public void minor6MinorNeg32767() throws Exception {
		char[]str = {'-','3','2','7','6','9'};
		assertEquals(-32769,ex.accesToConvert(str));
	}

	@Test(expected = Exception.class)
	public void major6() throws Exception {
		char[]str = {'3','2','7','6','7','9','9','9'};
		assertEquals(32767999,ex.accesToConvert(str));
	}

}
