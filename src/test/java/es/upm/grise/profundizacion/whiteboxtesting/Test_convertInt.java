package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_convertInt {

	private static Exercises e = new Exercises();
	private Exercises.convertInt c = e.new convertInt();
	
	@Test
	public void convertIntCheckLongCharTest() {
		char [] s = new char [] {'1','1','1','1','1','1','1','1',};
		assertThrows(Exception.class, () -> c.convert(s));
	}
	
	@Test
	public void convertIntCheckLongNumTest() {
		char [] s = new char [] {'9','9','9','9','9'};
		assertThrows(Exception.class, () -> c.convert(s));
	}
	
	@Test
	public void convertIntCheckNegLongNumTest() {
		char [] s = new char [] {'-','9','9','9','9','9'};
		assertThrows(Exception.class, () -> c.convert(s));
	}
	
	@Test
	public void convertIntCheckTest() {
		char [] s = new char [] {'1','1','1','1','1'};
		try {
			assertEquals(11111, c.convert(s));
		} catch (Exception e) {
			fail();
		}
	}

}
