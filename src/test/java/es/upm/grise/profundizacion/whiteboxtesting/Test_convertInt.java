package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;


/*
 * Basis path testing with execution diagram (basis path) located in ex6_convertInt.jpg
 */
public class Test_convertInt {

  public Exercises ex = new Exercises();

  public convertInt ci = ex.new convertInt();

  char[] str0 = {'-','1','2','3','4','5','6'};
  char[] str1 = {'-','1','4','5','0'};
  char[] str2 = {'-','0'};
  char[] str3 = {'-','0','4','5','0'};
  char[] str4 = {'-','0','0','1','0','0'};
  char[] str5 = {'4','5','0','1'};
  char[] str6 = {'0','0'};
  char[] str7 = {'0','0','9'};
  char[] str8 = {'3','2','7','6','7'};
  char[] str9 = {'9','9','9','9','9','9'};
  char[] str10 = {'-','9','1','1','9','9'};
  char[] str11 = {};

  //base test: str.length < 6 && str[0] != '-' && i >= str.length && 32768 <= number <= 32767
  //test fails for empty vector, which is not handled. Base test will then be changed.
  @Test
	public void testEmptyVector() throws Exception {
		assertEquals(0, ci.convert(str11));
	}

  //new base test: str.length > 6
  @Test
	public void testVectorLengthGreaterThan6(){
		assertThrows(Exception.class, () -> {
      ci.convert(str9);
    });
	}

  //branch test: str.length < 6 && str[0] == '-' && i <= str.length && 32768 <= number <= 32767
  //This test tests two separate branches that have the same condition and therefore cannot be tested individually.
  @Test
	public void testNegativeVector() throws Exception {
		assertEquals(-1450, ci.convert(str1));
	}

  //branch test: str.length < 6 && str[0] != '-' && i <= str.length && 32768 <= number <= 32767
  @Test
	public void testPositiveVector() throws Exception {
		assertEquals(4501, ci.convert(str5));
	}

  //branch test: str.length < 6 && str[0] != '-' && i <= str.length && number >= -32768 && number > 32767
  @Test
	public void testPositiveOutOfBoundsVector() throws Exception {
    assertThrows(Exception.class, () -> {
      ci.convert(str9);
    });
	}

  //branch test: str.length < 6 && str[0] != '-' && i <= str.length && number < -32768 && number <= 32767
  @Test
	public void testNegativeOutOfBoundsVector() throws Exception {
    assertThrows(Exception.class, () -> {
      ci.convert(str0);
    });
	}

	/*@Test
	public void testStrLessThan6() {
		Exception exception = assertThrows(Exception.class, () -> {
      ci.convert(str0);
    });
    assertEquals(null, exception.getMessage());
	}

  @Test
  public void testNegativeNumber(){
    try {
      assertEquals(-1450, ci.convert(str1));
    } catch (Exception e) {
      fail("Couldn't convert negative string");
    }
    try {
      assertEquals(0, ci.convert(str2));
    } catch (Exception e) {
      fail("Couldn't convert negative string");
    }
    try {
      assertEquals(-450, ci.convert(str3));
    } catch (Exception e) {
      fail("Couldn't convert negative string");
    }
    try {
      assertEquals(-100, ci.convert(str4));
    } catch (Exception e) {
      fail("Couldn't convert negative string");
    }
  }

  @Test
  public void testPositiveNumber(){
    try {
      assertEquals(4501, ci.convert(str5));
    } catch (Exception e) {
      fail("Couldn't convert positive string");
    }
    try {
      assertEquals(0, ci.convert(str6));
    } catch (Exception e) {
      fail("Couldn't convert positive string");
    }
    try {
      assertEquals(9, ci.convert(str7));
    } catch (Exception e) {
      fail("Couldn't convert positive string");
    }
    try {
      assertEquals(32767, ci.convert(str8));
    } catch (Exception e) {
      fail("Couldn't convert positive string");
    }
  }

  @Test
  public void testOutOfBoundsNumber(){
    Exception exception = assertThrows(Exception.class, () -> {
      ci.convert(str9);
    });
    assertEquals(null, exception.getMessage());
    Exception exception2 = assertThrows(Exception.class, () -> {
      ci.convert(str10);
    });
    assertEquals(null, exception2.getMessage());
  }*/
}
