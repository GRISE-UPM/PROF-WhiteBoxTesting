package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Test_convertInt {

	@Test
	public void test() throws Exception{
		Exercises exercise = new Exercises();
		Exercises.convertInt intConverter = exercise.new convertInt();
		char [] str = {'1','4','3'};
		int actualResult = intConverter.convert(str);
		assertEquals(143, actualResult);
	}

	@Test
	public void exceptionEntradaIncorrecta(){
		Exercises exercise = new Exercises();
		Exercises.convertInt intConverter = exercise.new convertInt();
		char [] str = {'h','o','l','a'};

		assertThrows(Exception.class, () -> intConverter.convert(str));
	}

}
