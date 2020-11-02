package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class Test_foo2 {

private Exercises ex;
	
	@Before
	public void createExercice(){
		ex = new Exercises();
	}
	@Test
	public void testAMayorB() {
		float res = ex.foo2((float)(Math.PI*4/(3)), (float)(Math.PI));
		//System.out.println(res);
		assertEquals(2f, res);
	}
	@Test
	public void testBMayorA() {
		float res = ex.foo2((float)(Math.PI/4),(float)(Math.PI));
		System.out.println(res);
		assertEquals(1.9634955f, res);
	}
	@Test
	public void testCosBMayor0() {
		float res = ex.foo2((float)4.8869,(float)5.0614);
		//System.out.println(res);
		assertEquals(res, 2f);
	}

}
