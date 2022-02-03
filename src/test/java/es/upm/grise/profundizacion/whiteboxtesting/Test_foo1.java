package es.upm.grise.profundizacion.whiteboxtesting;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

public class Test_foo1 {
	private Exercises exercises = new Exercises();
	
	@Test
	@DisplayName ("x mayor de 5")
	public void footest1() {
		
		assertEquals(1,exercises.foo1(10, 20), 0.0);
	}

	@Test
	@DisplayName ("x menor o igual de 5")
	public void footest2() {
		
		assertEquals(4,exercises.foo1(2,8), 0.0);
	}
	

}
