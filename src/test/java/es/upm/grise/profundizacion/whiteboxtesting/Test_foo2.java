package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

public class Test_foo2 {

	
	private Exercises exercises = new Exercises();
	
	@Test
	@DisplayName ("a>b, cos(a)<0 y cos(b)>0")
	public void footest21() {
		
		assertEquals(2,exercises.foo2(120, 60), 0.0);
	}

	@Test
	@DisplayName ("a>b, cos(a)>0 y cos(b)<0")
	public void footest22() {
		
		assertEquals(7.5,exercises.foo2(10, 5), 0.0);
	}

	@Test
	@DisplayName ("a<b, cos(a)>0 y cos(b)<0")
	public void footest23() {
		
		assertEquals(7.5,exercises.foo2(5, 10), 0.0);
	}

	@Test
	@DisplayName ("a<b, cos(a)<0 y cos(b)>0")
	public void footest24() {
		
		assertEquals(2,exercises.foo2(120, 320), 0.0);
	}

}
