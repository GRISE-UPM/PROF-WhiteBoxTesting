package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test_foo2 {

	@Test
	public void foo2_a_gt_b() {
		assertEquals(1.5, new Exercises().foo2(1, 2));
	}
	
	@Test
	public void foo2_a_lt_b() {
		assertEquals(1.5, new Exercises().foo2(2, 1));
	}
	
}
