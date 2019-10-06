package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {
	Exercises prueba =new Exercises();
	Exercises.convertInt prueba2 = prueba.new convertInt();
	
	@Test(expected = Exception.class)
	public void test() throws Exception{
		char[] ejemplo = {'a','b','-','.','a','u','q'};
	    prueba2.convert(ejemplo);
	}

	@Test(expected = Exception.class)
	public void test1() throws Exception{
		char[] ejemplo = {'a','b','-','.','a'};
	    prueba2.convert(ejemplo);
	}
	
	@Test
	public void test2() throws Exception{
		char[] ejemplo = {'e','z'};
	    assertEquals(1132, prueba2.convert(ejemplo),0);
	}
	
	@Test
	public void test3() throws Exception{
		char[] ejemplo = {'-','b'};
	    assertEquals(-98, prueba2.convert(ejemplo),0);
	}
	
	@Test(expected = Exception.class)
	public void test4() throws Exception{
		char[] ejemplo = {'-','b','-','.','a'};
	    prueba2.convert(ejemplo);
	}
}
