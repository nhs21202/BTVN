package Bai1_kethua;
import java.util.Scanner;
public class Rhombus extends Sides {
	Scanner input = new Scanner(System.in);
	public void input() {
	System.out.println("Enter two diagonals of rhombus: ");
	a= input.nextDouble();
	b= input.nextDouble();
	System.out.println("Enter the side of rhombus: ");
	c = input.nextDouble();

	}
	public double area() {
		return a*b/2;
	}
	public double perimeter() {
		return 4*c;
	}
}
