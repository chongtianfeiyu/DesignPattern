package Design_principles.OCP;

class Apple implements Fruit {
	Apple() {
		this.plant();
	}

	public void plant() {
		System.out.println("Plant a apple");
	};

	public void blossom() {
		System.out.println("Apple blossomed");
	};

	public void outcome() {
		System.out.println("Apple outcomed");
	};
}