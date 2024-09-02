package com.calc.calculateUseTest;

import com.calc.calc.application.CalculatorUseCase;
import com.calc.calc.domain.Calculator;
import com.calc.calc.domain.Operation;
import com.calc.calc.infra.SimpleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateUseCaseTest {
    Calculator calculator = new SimpleCalculator();
    CalculatorUseCase calculatorUseCase = new CalculatorUseCase(calculator);

    Operation addition = Double::sum;
    Operation subtract = (a, b) -> a - b;
    Operation multiply = (a, b) -> a * b;
    Operation division = (a, b) -> a / b;

    @Test
    public void additionTests() {
        System.out.print("Add Test 1: ");
        assertEquals(10.0, calculatorUseCase.execute(5.0, 5.0, addition));
        System.out.println("OK");
        System.out.print("Add Test 2: ");
        assertEquals(10.0, calculatorUseCase.execute(8.0, 2.0, addition));
        System.out.println("OK");
        System.out.print("Add Test 3: ");
        assertEquals(10.0, calculatorUseCase.execute(10.0, 0.0, addition));
        System.out.println("OK");
        System.out.print("Add Test 4: ");
        assertEquals(10.0, calculatorUseCase.execute(-10.0, 20.0, addition));
        System.out.print("OK");
    }
    @Test
    public void subtractTests() {
        System.out.print("Sub Test 1: ");
        assertEquals(10.0, calculatorUseCase.execute(15.0, 5.0, subtract));
        System.out.println("OK");
        System.out.print("Sub Test 2: ");
        assertEquals(10.0, calculatorUseCase.execute(30.0, 20.0, subtract));
        System.out.println("OK");
        System.out.print("Sub Test 3: ");
        assertEquals(-3.0, calculatorUseCase.execute(5.0, 8.0, subtract));
        System.out.println("OK");
        System.out.print("Sub Test 4: ");
        assertEquals(45.0, calculatorUseCase.execute(50.0, 5.0, subtract));
        System.out.println("OK");
    }
    @Test
    public void multiplyTests() {
        System.out.print("Multiply Test 1: ");
        assertEquals(25.0, calculatorUseCase.execute(5.0, 5.0, multiply));
        System.out.println("OK");
        System.out.print("Multiply Test 2: ");
        assertEquals(75.0, calculatorUseCase.execute(15.0, 5.0, multiply));
        System.out.println("OK");
        System.out.print("Multiply Test 3: ");
        assertEquals(10.0, calculatorUseCase.execute(5.0, 2.0, multiply));
        System.out.println("OK");
        System.out.print("Multiply Test 4: ");
        assertEquals(250.0, calculatorUseCase.execute(50.0, 5.0, multiply));
        System.out.println("OK");
    }
    @Test
    public void divisionTests() {
        System.out.print("Div Test 1: ");
        assertEquals(1.0, calculatorUseCase.execute(5.0, 5.0, division));
        System.out.println("OK");
        System.out.print("Div Test 2: ");
        assertEquals(3.0, calculatorUseCase.execute(15.0, 5.0, division));
        System.out.println("OK");
        System.out.print("Div Test 3: ");
        assertEquals(2.5, calculatorUseCase.execute(5.0, 2.0, division));
        System.out.println("OK");
        System.out.print("Div Test 4: ");
        assertEquals(10.0, calculatorUseCase.execute(50.0, 5.0, division));
        System.out.println("OK");
    }
}
