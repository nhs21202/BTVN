package Fruit_management;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Fruit> fruitlst = new ArrayList<Fruit>();
		fruitlst.add(new Apple("Táo Mỹ",25000,15,20));
		fruitlst.add(new Apple("Táo đỏ",10000,20,30));
		fruitlst.add(new Apple("Táo Tàu",5000,50,40));
		fruitlst.add(new Banana("Chuối ngự",14000,25,28));
		fruitlst.add(new Banana("Chuối tiêu",20000,15,30));
		fruitlst.add(new Banana("Chuối hột",30000,20,61));
		fruitlst.add(new Orange("Cam sành",34000,18,40));
		fruitlst.add(new Orange("Cam canh",40000,26,25));
		fruitlst.add(new Orange("Cam Vinh",20000,10,60));
		System.out.println("Chọn công việc bạn muốn thực hiện: ");
		System.out.println("1. In ra thông tin các mặt hàng hoa quả sẵn có");
		System.out.println("2. Tính toán lượng hoa quả tối đa có thể mua với số tiền bạn đang có");
		System.out.print("Bạn đã chọn: ");
		int choice=input.nextInt();
		if(choice == 1) {
			for(Fruit item : fruitlst) System.out.println(item.toString());
		} else {
			System.out.print("Mời nhập số tiền bạn đang có: ");
			int money=input.nextInt();
			for(Fruit item :fruitlst) {
				if(item.getPrice()<=money) {
					int dem = 0, m1=money;
					while(money >=0) {
						money -= item.getPrice();
						dem++;
					}
					if(dem>=item.getQuant()+1) 
						System.out.println( "có thể mua tối đa là: " + item.getQuant() + " quả "+item.getName());
					else
						System.out.println( "có thể mua tối đa là: " + (dem-1) + " quả "+item.getName());
					money = m1;
				}
			}
		}
	}
}
