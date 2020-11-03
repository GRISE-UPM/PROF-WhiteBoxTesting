package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class Test_maxAbsolute {
    private Exercises exercise;

    @BeforeEach
    public void beforeAll() {
        this.exercise = new Exercises();
    }

    @Test
    public void length_grater_than_5() {
        assertEquals(-1, this.exercise.maxAbsolute(new int[]{0, 0, 0, 0, 0, 0}));
    }

    @Test
    public void empty_list() {
        assertEquals(0, this.exercise.maxAbsolute(new int[]{}));
    }

    @Test
    public void negative_values_list() {
        assertEquals(4, this.exercise.maxAbsolute(new int[]{-1, -4, -3}));
    }

    @Test
    public void positive_values_list() {
        assertEquals(4, this.exercise.maxAbsolute(new int[]{1, 4, 3, 0}));
    }

    @Test
    public void mixed_values_list() {
        assertEquals(10, this.exercise.maxAbsolute(new int[]{-10, 4}));
    }
}
