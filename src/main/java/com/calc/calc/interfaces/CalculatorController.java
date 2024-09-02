package com.calc.calc.interfaces;

import com.calc.calc.application.CalculatorUseCase;
import com.calc.calc.domain.Calculator;
import com.calc.calc.domain.Operation;

public class CalculatorController {
    private final CalculatorUseCase calculateUseCase;

    public CalculatorController(CalculatorUseCase calculateUseCase) {
        this.calculateUseCase = calculateUseCase;
    }

    public void calculate(double a, double b, Operation operation) {
        double result = calculateUseCase.execute(a, b, operation);
        System.out.println("Result: " + result);
    }
}
