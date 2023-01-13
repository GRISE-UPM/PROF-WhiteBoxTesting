package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;


import org.junit.jupiter.api.*;

public class Test_foo1 {
	
	Exercises ejs;
	@BeforeEach
	public void init() {
		ejs = new Exercises();
		
	}
		
	

	@Test
	public void Float_Less_than_5_Values_Test() {
		assertEquals((float) 2, ejs.foo1((float)2.1,(float) 4.4),1);
		
	}
	@Test
	public void Float_Equal_to_5() {
		assertEquals((float) 2, ejs.foo1((float)5,(float) 10),1);
	}
	
	
	@Test
	public void Float_Greater_than_5_Values_Test() {
		assertEquals(1, ejs.foo1((float)10.4,(float) 20.4),1);
		
	}

}
