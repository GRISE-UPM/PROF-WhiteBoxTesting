package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_foo2 {
	
	private Exercises ex;
	
	@Before
	public void loadClass() {
		ex = new Exercises();
	}

	@Test
	public void fortyFiveAndZero() {
		assertEquals(ex.foo2((float) Math.PI/4, 0f), 2, 0.001);
	}
		
	@Test
	public void minusPiAndHundredThirtyFive() {
		float hundredThirtyFive = (float) (Math.PI/4f)*3f;
		assertEquals(ex.foo2((float) -Math.PI, hundredThirtyFive), 2, 0.001);
	}
	
	@Test
	public void ninetyAndZero() {
		assertEquals(ex.foo2((float) Math.PI/2, 0f), Math.PI/4, 0.001);
	}
	
	@Test
	public void minusFortyFiveAndFortyFive() {
		assertEquals(ex.foo2((float) Math.PI/4, (float) -Math.PI/4), 2, 0.001);
	}
	


}
