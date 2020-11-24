package Buldenko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticRunnerTest {
    @Test
    void name() {
        assertTrue(StaticRunner.forTest());
    }
}