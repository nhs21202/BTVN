package Fruit_management;

public class Fruit {	
	private String fruitname;
	private int price;
	private int quant;
	public Fruit(String fruitname, int price,int quant) {
		this.fruitname= fruitname;
		this.price= price;
		this.quant = quant;
	}
	public String getName() {
		return fruitname;
	}
	public void setName(String fruitname) {
		this.fruitname = fruitname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
}
