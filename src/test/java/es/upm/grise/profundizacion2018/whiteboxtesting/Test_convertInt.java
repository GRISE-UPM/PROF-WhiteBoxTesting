package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion2018.whiteboxtesting.Exercises.ConvertInt;

public class Test_convertInt {
	
	Exercises ex = new Exercises();
   Exercises.ConvertInt ci=  ex.new ConvertInt();
    
	@Test
	public void less_6_char_positive_smaller_32767_ret_number() throws Exception {
		char [] num= {'1','5','0'};
		assertEquals(150, ci.convert(num) );
	}
	
	@Test (expected = Exception.class)
	public void less_6_char_positive_greater_32767_throws_exception() throws Exception {
		char [] num= {'4','0','0','0','0'};
		ci.convert(num) ;
	}
	
	@Test (expected = Exception.class)
	public void less_equals_6_char_negative_smaller_minus_32767_throws_exception() throws Exception {
		char [] num= {'-','4','0','0','0','0'};
		ci.convert(num) ;
	}
	
	@Test
	public void less_6_char_negative_greater_minus_32767_ret_number() throws Exception {
		char [] num= {'-','1','5','0'};
		assertEquals(-150, ci.convert(num) );
	}
	
	@Test (expected = Exception.class)
	public void more_6_char_throws_exception() throws Exception {
		char [] num= {'4','0','0','0','0','0','0'};
		ci.convert(num) ;
	}

}
