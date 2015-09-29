package br.com.renato.dp.strategy;

public interface OperationStrategy {

	public void doOperation();

}

class OperationSubstract implements OperationStrategy {

	private int x;
	private int y;

	public OperationSubstract(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void doOperation() {
		System.out.println("Substract: ");
		System.out.println(x - y);
		System.out.println("#################################");
	}

}

class OperationMultiply implements OperationStrategy {

	private int x;
	private int y;

	public OperationMultiply(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void doOperation() {
		System.out.println("Multiply: ");
		System.out.println(x * y);
		System.out.println("#################################");
	}

}

class OperationAdd implements OperationStrategy {

	private int x;
	private int y;

	public OperationAdd(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void doOperation() {
		System.out.println("Add: ");
		System.out.println(x + y);
		System.out.println("#################################");
	}

}
