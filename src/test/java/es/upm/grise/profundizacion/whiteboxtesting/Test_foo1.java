package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/*
 * Basis path testing with execution diagram (basis path) located in ex6.jpg
 */
public class Test_foo1 {

  private Exercises ex = new Exercises();

  @Test
  public void testFoo1Yequals0(){
    assertEquals(0.0, ex.foo1(2.0f,0.0f), 0.01);
  }

	@Test
	public void testFoo1XLessOrEqual5() {
    assertEquals(-3.0, ex.foo1(-2.0f,6.0f), 0.01);
    assertEquals(1.0, ex.foo1(1.0f,1.0f), 0.01);
    assertEquals(2.0, ex.foo1(2.5f,5.0f), 0.01);
    assertEquals(3.2f/1.8f, ex.foo1(1.8f,3.2f), 0.01);
	}

   @Test
   public void testFoo1XGreaterThan5(){
    assertEquals(0.125, ex.foo1(6.0f,2.0f), 0.01);
    assertEquals(0.25, ex.foo1(10.0f,5.0f), 0.01);
   }

}
