package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_convertInt {
	
	private Exercises exercises;
	private Exercises.ConvertInt convertint;
	
	@Before
	public void beforeTest() {
		exercises = new Exercises();
		convertint = exercises.new ConvertInt();
	}

	/*@Test
	public void test1() {
		int[] i = {1,2,3,4,5,6};
		assertEquals(-1,this.convertint.convert(),0);
	}*/
	


}
