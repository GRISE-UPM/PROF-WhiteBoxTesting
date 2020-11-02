package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Test_foo1 {
	
	private Exercises ex;
	
	@Before
	public void createExercice(){
		ex = new Exercises();
	}
	@Test
	public void test_fooXMayor5() {
		float res = ex.foo1(6, 2);
		assertEquals(res, 2/16f);
	}
	@Test
	public void test_fooXMenor5() {
		float res = ex.foo1(4, 2);
		assertEquals(res, 2/4f);
	}

}
