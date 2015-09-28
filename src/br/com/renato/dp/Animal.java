package br.com.renato.dp;

public class Animal {

	private String name;
	private int weight;
	private String sound;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int newWeight) {

		if (newWeight > 0) {
			weight = newWeight;
		} else {
			System.out.println("Weight must be biggerthen 0.");
		}
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

}
