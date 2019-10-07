package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {
	Exercises ej = new Exercises();
	Exercises.convertInt convInt = ej.new convertInt();
	
	@Test(expected = Exception.class)
	public void test1() throws Exception{
		char [] str = new char[] {'\1', '\0', '\0', '\0', '\0', '\0', '\0'};
		convInt.convert(str);
	}
	@Test(expected = Exception.class)
	public void test2() throws Exception{
		char [] str = new char[] {'\4', '\0', '\0', '\0', '\0'};
		convInt.convert(str);
	}
	@Test(expected = Exception.class)
	public void test3() throws Exception{
		char [] str = new char[] {'-', '\4', '\0', '\0', '\0', '\0'};
		convInt.convert(str);
	}
	@Test
	public void test4() throws Exception {
		char [] str = new char[] {'\1'};
		assertEquals(1, convInt.convert(str));
	}
	@Test
	public void test5() throws Exception {
		char [] str = new char[] {'-', '\1'};
		assertEquals(-1, convInt.convert(str));
	}

}
