package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

  private Exercises ex = new Exercises();

	@Test
	public void testAGreaterThanB() {
		assertEquals(1.3f, ex.foo2(0.5f,2.1f), 0.01);
	}

  @Test
  public void testALesserThanB(){
    assertEquals(1.07f, ex.foo2(0.23f,1.91f), 0.01);
  }

  @Test
  public void testCosALesserThan0OrCosBGreaterThan0(){
    assertEquals(1.065, ex.foo2(1.8f,0.33f), 0.01);
  }
  
  @Test
  public void testCosAGreaterThan0OrCosBLesserThan0(){
    assertEquals(2.0f, ex.foo2(0.5f,0.33f), 0.01);
  }

}
