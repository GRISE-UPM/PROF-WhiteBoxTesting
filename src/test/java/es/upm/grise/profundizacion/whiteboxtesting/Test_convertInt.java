package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//OSCAR: La CC = 7, por lo que harían falta 7 tests. Bien es cierto que se puede conseguir
//una cobertura del 100% con menos tests al incluir más de una rama en cada camino indepen-
//diente

public class Test_convertInt {
	
	public Exercises testExercise = new Exercises();
	public Exercises.convertInt varTestConvert = testExercise.new convertInt();
	public char[] testr;
	
	//Test para número de strlength > 6
	@Test(expected = Exception.class)
	public void test_convertInt_Strlength6() throws Exception {
		varTestConvert.convert(testr = new char[]{'q','w','e','r','t','y','u'} );
	}
	
	
	//Test para un return de valores positivos
	@Test
	public void test_convertInt_positive_value() throws Exception {
		assertEquals(1067,varTestConvert.convert(testr = new char[] {'a','a'}));
	}
	
	//Test para un return pasando por los if de '-' que además devolverá un valor negativo
	@Test
	public void test_convertInt_hyphen() throws Exception{
		assertEquals(-1022, varTestConvert.convert(testr = new char[] {'-','c',' '}));
		
		
	}
	
	//Test para excepción por número mayor de 32767
	@Test(expected = Exception.class)
	public void test_convertInt_biggerThan() throws Exception {
		varTestConvert.convert(testr = new char[]{'q','w','e','r','t','y'} );	
	}
	
	//Test para excepción por número menor de -32768
	@Test(expected = Exception.class)
	public void test_convertInt_lowerThan() throws Exception{
		varTestConvert.convert(testr = new char[] {'-','a','a','a','z'});
	}
	

}
