package Bai1_kethua;
import java.util.Scanner;

public class Rectangle extends Sides {
	Scanner input = new Scanner(System.in);
	public void input() {
	System.out.println("Enter two sides of parallelogram: ");
	a= input.nextDouble();
	b= input.nextDouble();
	}
	public double area() {
		return a*b;
	}
	public double perimeter() {
		return (a+b)*2;
	}
}
