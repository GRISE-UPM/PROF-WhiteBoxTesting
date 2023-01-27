package es.upm.grise.profundizacion.whiteboxtesting;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Test_foo2 {
	private Exercises e = new Exercises();
	@Test
	public void aMayorBTest() {
		float a = 1;
		float b = 0;
		float res =  e.foo2(a,b);
		assertEquals(2, res, 0.00001);
	}
	@Test
	public void bMayorATest() {
		float a = 0;
		float b = 1;
		float res = e.foo2(a,b);
		assertEquals(2, res, 0.00001);
	}
	@Test
	public void AmayorB_TrueTrue() {
		assertEquals(2f,e.foo2(0.7f, 0.2f));
	}
	@Test
	public void AmayorB_Truefalse() {
		assertEquals(350,e.foo2(500, 200));
	}
	@Test
	public void AmayorB_FalseTrue() {
		assertEquals(2f,e.foo2(0.1f, 0.2f));
	}
	@Test
	public void AmayorB_Falsefalse() {
		assertEquals(350f,e.foo2(200f, 500f),1);
	}
	
}
