package Bai1_kethua;
import java.util.Scanner;

public class Parallelogram extends Sides {
	Scanner input = new Scanner(System.in);
	public void input() {
	System.out.println("Enter two sides of parallelogram: ");
	a= input.nextDouble();
	b= input.nextDouble();
	System.out.println("Enter the height of parallelogram: ");
	c = input.nextDouble();
	}
	public double area() {
		return a*c;
	}
	public double perimeter() {
		return (a+b)*2;
	}
}
