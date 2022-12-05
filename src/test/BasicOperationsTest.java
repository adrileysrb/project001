package test;

import exceptions.DivisionByZero;
import operations.BasicOperations;

import static org.junit.jupiter.api.Assertions.*;

class BasicOperationsTest {

    private static BasicOperations basicOperations;

    @org.junit.jupiter.api.BeforeAll
    public static void setUpBeforeClass() {
        basicOperations = new BasicOperations();
    }

    @org.junit.jupiter.api.Test
    void sum() {
        Double result = basicOperations.sum(1.0, 3.0);
        assertEquals(4.0, result);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Double result = basicOperations.subtract(5.0, 3.0);
        assertEquals(2.0, result);
    }

    @org.junit.jupiter.api.Test
    void divide() throws DivisionByZero {
        Double result = basicOperations.divide(10.0, 2.0);
        assertEquals(5.0, result);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Double result = basicOperations.multiply(2.0, 2.0);
        assertEquals(4.0, result);
    }
}