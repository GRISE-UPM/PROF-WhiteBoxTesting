package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test_foo1 {
	
	@Test
	public void foo1_x_gt_5() {
		assertEquals(1, new Exercises().foo1(6, 16));
	}
	
	@Test
	public void foo1_x_lt_5() {
		assertEquals(1, new Exercises().foo1(4, 4));
	}

}
