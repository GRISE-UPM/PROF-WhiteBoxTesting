package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;
import es.upm.grise.profundizacion2018.whiteboxtesting.Exercises.ConvertInt;

import org.junit.Before;
import org.junit.Test;

public class Test_convertInt {

	private Exercises exercises;
	private ConvertInt convertInt;

	@Before
	public void setUp() {
		exercises = new Exercises();
		convertInt = exercises.new ConvertInt();
	}

	@Test(expected = Exception.class)
	public void test_array_length_is_greater_than_6() throws Exception {
		int result = convertInt.convert(new char[]{'1','2','3','4','5','6','7'});
	}

    @Test(expected = Exception.class)
    public void test_number_result_is_greater_than_32767() throws Exception {
        int result = convertInt.convert(new char[]{'1','2','3','4','5'});
    }

    @Test(expected = Exception.class)
    public void test_number_result_is_lower_than_32767() throws Exception {
        int result = convertInt.convert(new char[]{'-','1','2','3','4','5'});
    }

	@Test
	public void test_number_result_is_equal_negative_2345() throws Exception{
		int result = convertInt.convert(new char[]{'-','1','2'});
		assertEquals(result, -540);
	}

}
