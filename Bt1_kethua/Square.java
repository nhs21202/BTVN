package Bai1_kethua;
import java.util.Scanner;
public class Square extends Sides {
	Scanner input = new Scanner(System.in);
	public void input() {
		System.out.println("Enter the side of square: ");
		a = input.nextDouble();
	}
	public double area() {
		return a*a;
	}
	public double perimeter() {
		return 4*a;
	}
}
