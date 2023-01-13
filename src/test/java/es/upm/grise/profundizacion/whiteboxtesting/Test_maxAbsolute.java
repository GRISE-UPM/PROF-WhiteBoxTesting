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
	public void Testing_Array_length_Greater_Than_5() {

		int [] int_array= {1,2,3,4,5,6};
		
		assertEquals(-1,ejs.maxAbsolute(int_array),1);

	}
	@Test
	public void Testing_Array_length_Lesser_Than_5_All_Positive(){
		
		int [] int_array= {1,6,3,4,5};
		
		assertEquals(6,ejs.maxAbsolute(int_array),1);

	}
	@Test
	public void Testing_Array_length_Lesser_Than_5_NOT_All_Positive() {

		int [] int_array= {-9,3,-10,6,5,};
		
		assertEquals(10,ejs.maxAbsolute(int_array),1);

	}
	
	@Test
	public void Testing_Array_Empty() {

		int [] int_array= {};
		
		assertEquals(0,ejs.maxAbsolute(int_array),1);

	}

}
