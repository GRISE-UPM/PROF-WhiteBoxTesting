package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {

private Exercises ex;
private convertInt ci;
	
	@Before
	public void createExercice(){
		ex = new Exercises();
		ci= ex.new convertInt();
	}
	@Test
	public void testException() {
		char [] ch= {'a','b','c','d','e','f','g'};
		assertThrows(Exception.class, ()->{
			ci.convert(ch);
		});
	}
	
	@Test
	public void testPositivoSinMax() {
		char [] ch= {'1','0','3'};
		int res = 0;
		try {
			res = ci.convert(ch);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(res);
		assertEquals(res, 103);
	}
	@Test
	public void testException2() {
		char [] ch= {'3','2','7','6','8'};
		assertThrows(Exception.class, ()->{
			ci.convert(ch);
		});
	}
	@Test
	public void testException3() {
		char [] ch= {'-','3','2','7','6','9'};
		assertThrows(Exception.class, ()->{
			ci.convert(ch);
		});
	}
	

}
