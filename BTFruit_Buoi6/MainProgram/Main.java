package BTFruit_Buoi6.MainProgram;

import java.util.List;
import java.util.Scanner;

import BTFruit_Buoi6.Entity.Apple;
import BTFruit_Buoi6.Entity.Banana;
import BTFruit_Buoi6.Entity.Fruit;
import BTFruit_Buoi6.Entity.Orange;
import BTFruit_Buoi6.Singleton.Cart;
import BTFruit_Buoi6.Singleton.Inventory;

public class Main {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		Inventory.addToInventory(new Apple("Táo A", 150, 20, 40));
		Inventory.addToInventory(new Apple("Táo B", 200, 15, 35));
		Inventory.addToInventory(new Apple("Táo C", 400, 8, 50));
		Inventory.addToInventory(new Banana("Chuối D ", 300, 75, 0.01));
		Inventory.addToInventory(new Banana("Chuối E ", 240, 15, 0.04));
		Inventory.addToInventory(new Banana("Chuối F ", 110, 25, 0.05));
		Inventory.addToInventory(new Orange("Cam G", 400, 16, 20.5));
		Inventory.addToInventory(new Orange("Cam H", 450, 28, 25));
		Inventory.addToInventory(new Orange("Cam I", 600, 50, 18.2));
		List<Fruit> lf = Inventory.getInstance();
		System.out.println("Chọn công việc bạn muốn thực hiện:");
		System.out.println("1. In ra thông tin các loại hoa quả trong kho");
		System.out.println("2. Thêm hoa quả vào giỏ hàng của bạn");
		System.out.print("Bạn đã chọn:");
		choice = sc.nextInt();
		switch(choice) {
			case 1:{
				System.out.println("Thông tin trong kho hàng:");
				for (Fruit i : lf) {
					System.out.printf(i.getId() + ":" + i.getName() + " - " + "Giá thành: " + i.getPrice()
							+ " nghìn/kg- Số lượng: " + i.getQuantity()+ " - Các loại vitamin có trong quả: ");
					i.vitamin();
				}
				break;
			}
			case 2:{
				int id,quant,nextchoice=1;
				while (nextchoice == 1) {
					System.out.print("Nhập mã loại quả bạn muốn cho vào giỏ hàng: ");
					id = sc.nextInt();
					System.out.print("Nhập số lượng quả bạn muốn cho vào giỏ hàng: ");
					quant = sc.nextInt();
					if (Cart.addToCart(id, quant) == false) {
						System.out.println("Không thêm được loại quả vào giỏ hàng theo yêu cầu, mời thử lại");
					}else {
						System.out.println("Loại quả bạn yêu cầu đã được thêm thành công vào giỏ hàng");
					}
					System.out.println("Chọn 1 để tiếp tục mua hàng");
					System.out.println("Chọn 0 để dừng việc mua hàng");
					nextchoice = sc.nextInt();
				}
				System.out.println("Các loại quả còn lại trong kho: ");
				for (Fruit i : lf) {
					System.out.println(i.getId() + ":" + i.getName() + " - " + "Giá thành: " + i.getPrice()
							+ " nghìn/kg- Số lượng: " + i.getQuantity());
				}
			}
		}
	}
}
