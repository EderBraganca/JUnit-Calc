package com.calc.calc.infra;

import com.calc.calc.domain.Calculator;
import com.calc.calc.domain.Operation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleCalculator implements Calculator {
    @Override
    public double calculate(double a, double b, Operation op){
        return op.apply(a,b);
    }

    double add(double a, double b) {
        return a + b;
    }
}
