package Design_principles.OCP;

class Pear implements Fruit {
	Pear() {
		this.plant();
	}

	public void plant() {
		System.out.println("Plant a Pear");
	};

	public void blossom() {
		System.out.println("Pear blossomed");
	};

	public void outcome() {
		System.out.println("Pear outcomed");
	};
}