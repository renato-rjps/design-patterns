package br.com.renato.dp.strategy;

public class OperationTest {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		//Add
		calculator.setOperation(new OperationAdd(10, 5));
		calculator.calculate();
		
		//Substraction
		calculator.setOperation(new OperationSubstract(10, 5));
		calculator.calculate();
		
		//Multiply
		calculator.setOperation(new OperationMultiply(10, 5));
		calculator.calculate();
		
	}

}
