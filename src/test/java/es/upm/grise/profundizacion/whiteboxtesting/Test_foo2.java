package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Basis path testing with execution diagram (basis path) located in ex6.jpg
 */
public class Test_foo2 {

  private Exercises ex = new Exercises();

  /*
   * pi/2 = 1.57; pi = 3.14; 3pi/2 = 4.71; 2pi = 6.28
  */

  //base test: a<=b && cos(a)>0 && cos(b)<0
  @Test
  public void testALesserOrEqualB(){
    assertEquals(1.07f, ex.foo2(0.23f,1.91f), 0.01);
  }
   
  //branch test: a>b && cos(a)>0 && cos(b)<0
	@Test
	public void testAGreaterThanB() {
		assertEquals(1.3f, ex.foo2(2.1f,0.5f), 0.01);
	}

  
  //branch test: a<=b && cos(a)<0 && cos(b)<0
  @Test
  public void testCosALesserThan0AndAGreaterThanB(){
    assertEquals(2.0, ex.foo2(2.0f,2.5f), 0.01);
  }

  //branch test: a<=b && cos(a)>0 && cos(b)>0
  @Test
  public void testCosBGreaterThan0AndAGreaterThanB(){
    assertEquals(2.0, ex.foo2(1.0f,5.0f), 0.01);
  }
}
