package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_foo2 {

	private Exercises e = new Exercises();
	
	@Test
	public void foo2AMayorBTest() {
		float a = 5;
		float b = 0;
		assertEquals((float)2, e.foo2(a, b));
	}
	
	@Test
	public void foo2AMenorBTest() {
		float a = 0;
		float b = 5;
		assertEquals((float) 2, e.foo2(a, b));
	}
	
	@Test
	public void foo2AIgualBTest() {
		float a = 5;
		float b = 5;
		assertEquals((float) 2, e.foo2(a, b));
	}
	
	@Test
	public void foo2BCosMenor0Test() {
		float a = 180;
		float b = 0;
		assertEquals((float) 90, e.foo2(a, b));
	}
	
	@Test
	public void foo2ACosMenor0Test() {
		float a = 0;
		float b = 180;
		assertEquals((float) 90, e.foo2(a, b));
	}
	
	@Test
	public void foo2CosPequeñoTest() {
		float a = 0;
		float b = 0;
		assertEquals((float) 2, e.foo2(a, b));
	}

}
