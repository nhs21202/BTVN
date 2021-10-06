package BTFruit_Buoi6.Entity;

public class Apple extends Fruit {
	private int sugar;
	public Apple(String name,double price,int quantity,int sugar) {
		super(name,price,quantity);
		this.sugar = sugar;
	}
	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void vitamin() {
		System.out.println("Vitamin X,Y,Z");
	}
}
