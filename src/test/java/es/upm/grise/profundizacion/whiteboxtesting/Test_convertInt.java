package es.upm.grise.profundizacion.whiteboxtesting;
import static org.junit.Assert.*;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class Test_convertInt {


	Exercises ej = new Exercises();
	Exercises.convertInt convInt = ej.new convertInt();

		@Test
		public void correctConversion() throws Exception {

			int expected = 159;
			char[] chars= {'1','5','9'};
			int actual = convInt.convert(chars);

			assertEquals(expected, actual);

		}

		@Test
		public void stringTooLong(){

			char[] chars= {'1','5','9','1','5','9','7'};
			System.out.println((chars.length));
			assertThrows(Exception.class,()-> convInt.convert(chars));

		}

		@Test
		public void stringTooBig(){

			char[] chars= {'3','3','3','3','3'};

			assertThrows(Exception.class,()-> convInt.convert(chars));

		}

		@Test
		public void negetiveNumber() throws Exception {

			int expected = -10;
			char[] chars= {'-','1','0'};
			int actual = convInt.convert(chars);

			assertEquals(expected, actual);

		}
	}