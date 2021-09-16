package Bai1_kethua;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		Square hv = new Square();
		Rectangle hcn =new Rectangle();
		Triangle tg=new Triangle();
		Parallelogram hbh=new Parallelogram();
		Rhombus ht = new Rhombus();
		System.out.println("Choose your shape:");
		System.out.println("1.Square");
		System.out.println("2.Rectangle");
		System.out.println("3.Triangle");
		System.out.println("4.Parallelogram");
		System.out.println("5.Rhombus");
		System.out.printf("Your choice: ");
		choice= input.nextInt();
			switch(choice) {
			case 1:
				hv.input();
				System.out.printf("The perimeter :%f\n",hv.perimeter());
				System.out.printf("The area :%f\n",hv.area());
				break;
			case 2:
				hcn.input();
				System.out.printf("The perimeter :%f\n",hcn.perimeter());
				System.out.printf("The area :%f\n",hcn.area());
				break;
			case 3:
				tg.input();
				System.out.printf("The perimeter :%f\n",tg.perimeter());
				System.out.printf("The area :%f\n",tg.area());
				break;
			case 4:
				hbh.input();
				System.out.printf("The perimeter :%f\n",hbh.perimeter());
				System.out.printf("The area :%f\n",hbh.area());
				break;
			case 5:
				ht.input();
				System.out.printf("The perimeter :%f\n",ht.perimeter());
				System.out.printf("The area :%f\n",ht.area());
			}
	}
}
