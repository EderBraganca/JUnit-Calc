package com.calc.calc;

import com.calc.calc.application.CalculatorUseCase;
import com.calc.calc.domain.Calculator;
import com.calc.calc.domain.Operation;
import com.calc.calc.infra.SimpleCalculator;
import com.calc.calc.interfaces.CalculatorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcApplication.class, args);
		Calculator calculator = new SimpleCalculator();
		CalculatorUseCase calculatorUseCase = new CalculatorUseCase(calculator);
		CalculatorController controller = new CalculatorController(calculatorUseCase);

		Operation addition = Double::sum;

		controller.calculate(5, 3, addition);
	}
}