package Fruit_management;

public class Banana extends Fruit {
	private double k40;
	public Banana(String fruitname,int price,int quant,double k40) {
		super(fruitname,price,quant);
		this.k40=k40;
	}
	public double getK40() {
		return k40;
	}
	public void setK40(double k40) {
		this.k40 = k40;
	}
	@Override
	public String toString () {
		 return"Fruit's name: "+ getName() + "\nPrice: " + getPrice() + "\nQuantity: " +getQuant()+"\nAmount of Kali 40: "+ getK40()+"\n";
	}
}
