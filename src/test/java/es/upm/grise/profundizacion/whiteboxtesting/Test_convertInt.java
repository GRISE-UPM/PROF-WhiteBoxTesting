package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {
	
	Exercises ej;
	convertInt ejs;
	
	@BeforeEach
	public void init() {
		 ej = new Exercises();
		 ejs= ej.new convertInt();
	}

	@Test
	public void Test_String_more_than_6() {

		char [] char_array= {'1','6','3','4','5','9','8'};
		assertThrows(Exception.class, ()-> ejs.convert(char_array));
	
	}
	
	
	
	@Test
	public void Test_String_Length_less_than_6_Positive() throws Exception {

		char [] char_array= {'1','6','3','4','5'};
		assertEquals(16345,  ejs.convert(char_array),1);
	
	}
	
	@Test
	public void Test_String_Length_less_than_6_Negative() throws Exception {

		char [] char_array= {'-','6','3','4','5'};
		assertEquals(-6345,  ejs.convert(char_array),1);
	
	}
	@Test
	public void Test_Number_Bigger_Than_Max_Value() throws Exception {

		
		char [] char_array= {'3','2','7','6','8'};
		assertThrows(Exception.class, ()-> ejs.convert(char_array));
	
	}
	@Test
	public void Test_Number_Smaller_Than_Min_Value() throws Exception {

		char [] char_array= {'-','4','0','0','0','0'};
		assertThrows(Exception.class, ()-> ejs.convert(char_array));
	
	}

}
