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

		float resultado1= ejs.foo2((float) 1.58, (float) 1.56);
		assertEquals(resultado1,ejs.foo2((float) 1.56, (float) 1.58),1);

	}
	@Test
	public void Testing_First_if_Condition() {

		
		assertEquals(2,ejs.foo2((float) 1.56, (float) 1.56),1);

	}
	@Test
	public void Testing_Second_If_Condition() {

		assertEquals(2,ejs.foo2((float) 2.5, (float) 2.5),1);

	}

}
