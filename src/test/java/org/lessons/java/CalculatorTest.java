package org.lessons.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = null;

    @BeforeEach
    void init(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Verifica un'addizione")
    void add() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    @DisplayName("Verifica una sottrazione")
    void subtract() {
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    @DisplayName("Verifica una divisione")
    void divide() {
        assertThrows(IllegalArgumentException.class, ()->  calculator.divide(3, 5));
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    @DisplayName("Verifica una moltiplicazione")
    void multiply() {
        assertEquals(25, calculator.multiply(5, 5));
    }
}