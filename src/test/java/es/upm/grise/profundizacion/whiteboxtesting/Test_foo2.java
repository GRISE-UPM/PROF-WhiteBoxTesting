package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class Test_foo2 {
    private Exercises exercise;

    @BeforeEach
    public void beforeAll() {
        this.exercise = new Exercises();
    }

    @Test
    public void a_grater_than_b() {
        assertEquals(2, this.exercise.foo2(180, 90), 0.0001);
    }

    @Test
    public void a_lower_than_b() {
        assertEquals(67.5, this.exercise.foo2(45, 90), 0.0001);
    }

    @Test
    public void cos_a_lower_0() {
        assertEquals(2, this.exercise.foo2(180, 90), 0.0001);
    }

    @Test
    public void cos_b_grater_0() {
        assertEquals(2, this.exercise.foo2(45, 0), 0.0001);
    }
}
