package Fruit_management;

public class Apple extends Fruit{
 private double sugar;
 public Apple(String fruitname,int price,int quant,double sugar) {
	 super(fruitname,price,quant);
	 this.sugar = sugar;
 }
 public double getSugar() {
	 return sugar;
 }
 public void setSugar(double sugar) {
	 this.sugar = sugar;
 }
 @Override
 public String toString() {
	 return"Fruit's name: "+ getName() + "\nPrice: " + getPrice() + "\nQuantity: " +getQuant() +"\nAmount of sugar: "+getSugar()+"\n";
 }
}
