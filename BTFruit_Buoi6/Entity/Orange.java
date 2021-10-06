package BTFruit_Buoi6.Entity;

public class Orange extends Fruit {
	private double weight;

	public Orange(String name, double price, int quanity, double weight) {
		super(name, price, quanity);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void vitamin() {
		System.out.println("Vitamin A,B,C");
	}

}
