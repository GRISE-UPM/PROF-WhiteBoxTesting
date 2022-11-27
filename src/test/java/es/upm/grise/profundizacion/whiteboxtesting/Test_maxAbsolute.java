package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;


import org.junit.jupiter.api.*;

public class Test_maxAbsolute {

	Exercises ejs;
	@BeforeEach
	public void init() {
		ejs = new Exercises();
		
	}
	@Test
	public void Testing_Max_Array_length() {

		int [] int_array= {1,2,3,4,5,6};
		
		assertEquals(-1,ejs.maxAbsolute(int_array),1);

	}
	@Test
	public void Testing_Max_Number_Positive() {
		
		int [] int_array= {1,6,3,4,5};
		
		assertEquals(6,ejs.maxAbsolute(int_array),1);

	}
	@Test
	public void Testing_Max_Number_Negative_Numbers() {

		int [] int_array= {-9,3,-10,6,5,};
		
		assertEquals(10,ejs.maxAbsolute(int_array),1);

	}

}
