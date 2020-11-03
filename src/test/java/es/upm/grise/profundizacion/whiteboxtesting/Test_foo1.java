package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class Test_foo1 {
    private Exercises exercise;

    @BeforeEach
    public void beforeAll() {
        this.exercise = new Exercises();
    }

    @Test
    public void value_x_lower_5() {
        assertEquals(1, this.exercise.foo1(4, 4), 0.0001);
    }

    @Test
    public void value_x_grater_5() {
        assertEquals(2, this.exercise.foo1(6, 32), 0.0001);
    }
}