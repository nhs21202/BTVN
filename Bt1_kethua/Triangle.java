package Bai1_kethua;
import java.util.Scanner;

public class Triangle extends Sides{
	Scanner input = new Scanner(System.in);
	public void input() {
	System.out.println("Enter three sides of triangle: ");
	a = input.nextDouble();
	b = input.nextDouble();
	c = input.nextDouble();
	}
	public double perimeter() {
		return a+b+c;
	}
	public double area() {
		double p = this.perimeter()/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
