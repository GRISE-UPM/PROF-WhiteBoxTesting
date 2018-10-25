package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion2018.whiteboxtesting.Exercises.ConvertInt;

public class Test_convertInt {
	
	private Exercises ejercicio = new Exercises();
	@Test
	public void prueba1() throws Exception {
		char[] num = {'1','2','3'};
		
		ConvertInt con = ejercicio.new ConvertInt();
		assertTrue(con.convert(num) == 5451);
	}
	
	@Test (expected = Exception.class)
	public void prueba2() throws Exception {
		char [] num= {'4','0','0','0','0'};
		
		ConvertInt con = ejercicio.new ConvertInt();
		con.convert(num) ;
	}
	
	@Test (expected = Exception.class)
	public void prueba3() throws Exception {
		char [] num= {'-','4','0','0','0','0'};
		
		ConvertInt con = ejercicio.new ConvertInt();
		con.convert(num) ;
	}
	
	@Test
	public void prueba4() throws Exception {
		char[] num = {'-','1','2','3'};
		
		ConvertInt con = ejercicio.new ConvertInt();
		con.convert(num) ;
	}
	
	@Test (expected = Exception.class)
	public void prueba5() throws Exception {
		char [] num= {'0','0','0','0','0','0','0'};
		
		ConvertInt con = ejercicio.new ConvertInt();
		con.convert(num) ;
	}
	
}