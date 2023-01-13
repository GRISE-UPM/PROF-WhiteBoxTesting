package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;


import org.junit.jupiter.api.*;
public class Test_foo2 {

	
	Exercises ejs;
	@BeforeEach
	public void init() {
		ejs = new Exercises();
		
	}
	
	@Test
	public void testing_First_Parameter_Greater_Than_second() {

		
		assertEquals(5,ejs.foo2((float) 10, (float) 0),1);

	}
	
	@Test
	public void testing_First_Parameter_Lesser_Than_second() {

		
		assertEquals(5,ejs.foo2((float) 0, (float) 10),1);

	}
	
	@Test
	public void testing_First_Parameter_Equal_To_second() {

		
		assertEquals(2,ejs.foo2((float) 10, (float) 10),1);

	}	
	
	
	//Cos(A)<0
	@Test
	public void Testing_First_Parameter_Coss_Less_Than_Zero_Second_Greater_Than_0() {

		
		assertEquals((float)2,ejs.foo2((float) 2, (float) 5),1);

	}
	
	@Test
	public void Testing_First_Parameter_Coss_Less_Than_Zero_Second_Lesser_than_0() {

		//Se cambian valores por el primer cond
		assertEquals((float)2,ejs.foo2((float) 5, (float) 4),1);

	}
	
	
	//Cos(A)>0
	@Test
	public void Testing_First_Parameter_Coss_Greater_Than_Zero_Second_Greater_Than_0() {

		
		assertEquals((float)2,ejs.foo2((float) 5, (float) 5),1);

	}
	
	@Test
	public void Testing_First_Parameter_Coss_Greater_Than_Zero_Second_Lesser_than_0() {

		assertEquals((float)7.5,ejs.foo2((float) 5, (float) 8),1);

	}

}
