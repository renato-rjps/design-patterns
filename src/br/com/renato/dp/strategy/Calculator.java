package br.com.renato.dp.strategy;

public class Calculator {

	private OperationStrategy operation;

	public void calculate() {
		operation.doOperation();
	}

	public void setOperation(OperationStrategy operation) {
		this.operation = operation;
	}

}
