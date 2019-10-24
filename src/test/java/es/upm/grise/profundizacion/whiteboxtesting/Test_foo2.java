package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_foo2 {
	
	Exercises exercises;
	public static final float DELTA =  0.001F;
	
	/**
	 * N1 -> Primer if T o F
	 * N2 -> Cond 1 del segundo if T o F
	 * N3 -> Cond 2 del segundo if T o F
	 * CC = 4
	 **/
	
	@Before
	public void setUp() {
		exercises = new Exercises();
	}
	
	@Test
	public void testN1F_N2T_N3T() {
		
		float a = (float)(3/4F*Math.PI);
		float b = (float)(7/4F*Math.PI);
		
		assertEquals((3 + 1) / 2f, exercises.foo2(a,b),DELTA);
	}
	
	@Test
	public void testN1F_N2F_N3T() {
		
		float a = (float)(6/4F*Math.PI);
		float b = (float)(7/4F*Math.PI);
		
		assertEquals((3 + 1) / 2f, exercises.foo2(a,b),DELTA);
	}
	
	@Test
	public void testN1F_N2F_N3F() {
		
		float a = (float)(1/4F*Math.PI);
		float b = (float)(Math.PI);
		
		assertEquals((a + b) / 2f, exercises.foo2(a,b),DELTA);
	}
	
	@Test
	public void testN1T_N2T_N3T() {
		
		float a = (float)(7/4F*Math.PI);
		float b = (float)(3/4F*Math.PI);
		
		assertEquals((1+3) / 2f, exercises.foo2(a,b),DELTA);
	}
}

