package Fruit_management;

public class Orange extends Fruit{
	private double weight;
	public Orange(String fruitname, int price,int quant,double weight) {
		super(fruitname,price,quant);
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
	this.weight = weight;
	}
	@Override
	public String toString() {
		 return"Fruit's name: "+ getName() + "\nPrice: " + getPrice() + "\nQuantity: " +getQuant() +"\nWeight: "+getWeight()+"\n";

	}
}
