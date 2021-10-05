package Baitap_Buoi5.Main;
import java.util.List;
import java.util.Scanner;
import Baitap_Buoi5.Entity.Khoahoc;
import Baitap_Buoi5.Entity.Ngoaivan;
import Baitap_Buoi5.Entity.Sach;
import Baitap_Buoi5.Entity.Vanhoc;
import Baitap_Buoi5.Singleton.Cart;
import Baitap_Buoi5.Singleton.Inventory;
public class MainProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Inventory.addToInventory(new Khoahoc("TgKH1", 65000, 80, 1998));
		Inventory.addToInventory(new Khoahoc("TgKH2", 70000, 8, 2003));
		Inventory.addToInventory(new Vanhoc("TgVH1", 33000, 15, 12));
		Inventory.addToInventory(new Vanhoc("TgVH2", 40000, 30, 20));
		Inventory.addToInventory(new Ngoaivan("TgNV1", 20000, 22, "012345678"));
		Inventory.addToInventory(new Ngoaivan("TgNV2", 100000, 15, "024681012"));
		List<Sach> ls = Inventory.getInstance();
		int choice;
		System.out.println("Mời chọn công việc:");
		System.out.println("1. In ra thông tin sách trong kho");
		System.out.println("2. Thêm sách vào trong kho ");
		System.out.println("3. Thêm sách vào giỏ hàng của bạn");
		System.out.println("Đưa ra lựa chọn của bạn:");
		choice = sc.nextInt();
		switch(choice) {
			case 1:	{
				for (Sach i:ls) {
					System.out.println(i.getId()+"  "+i.getTacgia()+"  "+i.getPrice()+"  "+i.getQuantity());
				}
				break;
			}
			case 2:{
				int n,id,quant;
				System.out.println("Nhập vào số lần bạn muốn thêm sách vào kho: ");
				n= sc.nextInt();
				
				for (int i=1; i<=n; i++) {
					System.out.println("Mời bạn nhập id sách và số lượng muốn thêm vào kho");
					id= sc.nextInt();
					quant= sc.nextInt();
					if (Inventory.addQuantity(id, quant)) 
						System.out.println("Sách đã được thêm vào kho");
					else System.out.println("Sách không thể được thêm vào kho");
				}
				break;
				
			}
			case 3:{
				int n,id,quant;
				System.out.println("Nhập vào số lần bạn muốn thêm sách vào giỏ hàng : ");
				n= sc.nextInt();
				
				for (int i=1; i<=n; i++) {
					System.out.println("Mời bạn nhập id sách và số lượng muốn thêm vào giỏ hàng của bạn: ");
					id= sc.nextInt();
					quant= sc.nextInt();
				
					if(Cart.addToCart(id, quant)) {
							System.out.println("Sách đã thêm vào giỏ hàng của bạn");
					}
					else System.out.println("Không thể thêm sách vào giỏ hàng của bạn ");
				}
				break;
			}
		}
	}
}

