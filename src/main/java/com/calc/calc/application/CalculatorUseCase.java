package com.calc.calc.application;

import com.calc.calc.domain.Calculator;
import com.calc.calc.domain.Operation;

public class CalculatorUseCase {
    private final Calculator calculator;

    public CalculatorUseCase(Calculator calculator) {
        this.calculator = calculator;
    }

    public double execute(double a, double b, Operation operation) {
        return calculator.calculate(a, b, operation);
    }
}
