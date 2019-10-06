package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {
	
	Exercises object2;
	Exercises.convertInt object;
	
	@Before
	public void setup() throws Exception {
		object2= new Exercises();
		object = object2.new convertInt();
	}
	
	@Test(expected = Exception.class)
	public void primerCamino() throws Exception {
		char [] str = {'1','2','3','4','5','6','7'};
		object.convert(str);
	}
	
	@Test
	public void segundoCamino() throws Exception {
		char [] str = {'1','2','3'};
		assertEquals(object.convert(str), 5451,0);
	}
	
	@Test
	public void tercerCamino() throws Exception {
		char [] str = {'-','1','2','3'};
		assertEquals(object.convert(str), -5451,0);
	}
	
	@Test(expected = Exception.class)
	public void cuartoCamino() throws Exception {
		char [] str = {'-','5','6','7','8','9'};
		object.convert(str);
	}
	
	@Test(expected = Exception.class)
	public void quintoCamino() throws Exception {
		char [] str = {'5','6','7','8','9'};
		object.convert(str);
	}
	
	@Test(expected = Exception.class)
	public void sextoCamino() throws Exception {
		char [] str = null;
		object.convert(str);
	}


}
