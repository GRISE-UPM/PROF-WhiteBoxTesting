package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class Test_convertInt {

	private static Exercises exercise;
	private static Exercises.convertInt intConverter;

	@Test
	public void test() throws Exception{
		exercise = new Exercises();
		intConverter = exercise.new convertInt();
		char [] str = {'1','4','3'};
		int actualResult = intConverter.convert(str);
		assertEquals(143, actualResult);
	}



	@Test
	public void exceptionEntradaIncorrecta(){
		exercise = new Exercises();
		Exercises.convertInt intConverter = exercise.new convertInt();
		char [] str = {'h','o','l','a'};

		assertThrows(Exception.class, () -> intConverter.convert(str));
	}

	@Test
	public void testArrayLengthMayorQue5() throws Exception{
		exercise = new Exercises();
		intConverter = exercise.new convertInt();
		char [] str = {'1','4','3','1','4','3','1','4','3'};
		System.out.println("Str.length: "+str.length);
		assertThrows(Exception.class, ()->intConverter.convert(str));
	}

	@Test
	public void testPrimerValorNegativo() throws Exception{
		exercise = new Exercises();
		intConverter = exercise.new convertInt();
		char [] str = {'-','4','3'};
		int actualResult = intConverter.convert(str);
		assertEquals(-43, actualResult);
	}

	@Test
	public void exceptionNumeroCorrectoPeroMuyGrandePositivo(){
		exercise = new Exercises();
		intConverter = exercise.new convertInt();
		char [] str = {'9','9','9','9','9','9'};

		assertThrows(Exception.class, () -> intConverter.convert(str));
	}

	@Test
	public void exceptionNumeroCorrectoPeroMuyGrandeNegativo(){
		exercise = new Exercises();
		intConverter = exercise.new convertInt();
		char [] str = {'9','9','9','9','9','9'};

		assertThrows(Exception.class, () -> intConverter.convert(str));
	}
}
