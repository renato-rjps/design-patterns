package br.com.renato.dp;

public class Dog extends Animal {

	public void digHole() {
		System.out.println("Dog a hole");
	}

	public Dog() {
		super();
		setSound("Bark");
	}
}
