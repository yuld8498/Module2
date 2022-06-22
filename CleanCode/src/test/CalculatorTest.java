package test;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import source.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    @Test
    @DisplayName("Testing addition")
    public void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = ADDITION;
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("Testing subtraction")
  public   void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = SUBTRACTION;
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
   public void testCalculateMul() {
        int firstOperand = 2;
        int secondOperand = 2;
        char operator = MULTIPLICATION;
        int expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    public void testCalculateDiv() {
        int firstOperand = 6;
        int secondOperand = 3;
        char operator = DIVISION;
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
   public void testCalculateDivByZero() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = DIVISION;

        assertThrows(RuntimeException.class,
                ()-> {
                    Calculator.calculate(firstOperand, secondOperand, operator);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    public void testCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '=';

        assertThrows(RuntimeException.class,
                ()-> {
                    Calculator.calculate(firstOperand, secondOperand, operator);});
    }}

