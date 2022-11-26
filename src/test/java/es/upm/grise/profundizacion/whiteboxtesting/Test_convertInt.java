package es.upm.grise.profundizacion.whiteboxtesting;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.suite.api.SelectClasses;

public class Test_convertInt {


	@Test
	public void convertLongIntExceptionTest() throws Exception {
		Exercises o = new Exercises();
		Exercises.convertInt i = o.new convertInt();
		char [] input = new char[8];
		Assertions.assertThrows(new Exception().getClass(), () ->i.convert(input));
	}

	@Test
	public void negativeIntTest() throws Exception {
		Exercises o = new Exercises();
		Exercises.convertInt i = o.new convertInt();
		char [] input = new char[4];
		input[0] = '-';
		input[1] = '1';
		input[2] = '2';
		input[3] = '3';
		Assertions.assertEquals(-123,i.convert(input));
	}

	@Test
	public void outOfRangeIntTest() throws Exception {
		Exercises o = new Exercises();
		Exercises.convertInt i = o.new convertInt();
		char [] input = new char[5];
		input[0] = '9';
		input[1] = '9';
		input[2] = '9';
		input[3] = '9';
		input[4] = '9';
		Assertions.assertThrows(new Exception().getClass(), () ->i.convert(input));
	}

	@Test
	public void outOfNegativeRangeIntTest() throws Exception {
		Exercises o = new Exercises();
		Exercises.convertInt i = o.new convertInt();
		char [] input = new char[6];
		input[0] = '-';
		input[1] = '9';
		input[2] = '9';
		input[3] = '9';
		input[4] = '9';
		input[5] = '9';
		Assertions.assertThrows(new Exception().getClass(), () ->i.convert(input));
	}

}
