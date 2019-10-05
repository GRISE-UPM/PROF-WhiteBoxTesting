package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_convertInt {
	
	public Exercises testExercise = new Exercises();
	public Exercises.convertInt varTestConvert = testExercise.new convertInt();
	public char[] testr;
	
	@Test(expected = Exception.class)
	public void test1() throws Exception {
		varTestConvert.convert(testr = new char[]{'q','w','e','r','t','y','u'} );
	}
	
	
	@Test
	public void test2() throws Exception {
		assertEquals(1067,varTestConvert.convert(testr = new char[] {'a','a'}));
	}
	
	@Test
	public void test3() throws Exception{
		assertEquals(-1022, varTestConvert.convert(testr = new char[] {'-','c',' '}));
		
		
	}
	
	@Test(expected = Exception.class)
	public void test4() throws Exception {
		varTestConvert.convert(testr = new char[]{'q','w','e','r','t','y'} );	
	}
	
	@Test(expected = Exception.class)
	public void test5() throws Exception{
		varTestConvert.convert(testr = new char[] {'-','a','a','a','z'});
	}
	

}
