package BTBook_Buoi6.Main;

import java.util.List;
import java.util.Scanner;

import BTBook_Buoi6.Entity.Book;
import BTBook_Buoi6.Entity.KhoaHoc;
import BTBook_Buoi6.Entity.NgoaiVan;
import BTBook_Buoi6.Entity.VanHoc;
import BTBook_Buoi6.Singleton.Cart;
import BTBook_Buoi6.Singleton.Inventory;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, nextchoice = 1;
		Inventory.addToInventory(new VanHoc("TacgiaVH1", 25000, 18, 11));
		Inventory.addToInventory(new VanHoc("TacgiaVH2", 30000, 20, 15));
		Inventory.addToInventory(new VanHoc("TacgiaVH1", 40000, 30, 20));
		Inventory.addToInventory(new KhoaHoc("TacgiaKH1", 80000, 20, 2009));
		Inventory.addToInventory(new KhoaHoc("TacgiaKH2", 75000, 7, 1995));
		Inventory.addToInventory(new KhoaHoc("TacgiaKH3", 100000, 50, 2020));
		Inventory.addToInventory(new NgoaiVan("TacgiaNV1", 24000, 7, "NV001"));
		Inventory.addToInventory(new NgoaiVan("TacgiaNV2", 30000, 26, "NV002"));
		Inventory.addToInventory(new NgoaiVan("TacgiaNV3", 40000, 68, "NV003"));
		
		List<Book> lb = Inventory.getInstance();
		System.out.println("Chọn công việc bạn muốn thực hiện: ");
		System.out.println("1.In ra thông tin trong kho sách ");
		System.out.println("2.Thêm sách vào giỏ hàng của bạn ");
		System.out.print("Lựa chọn của bạn: ");
		choice = sc.nextInt();
		switch(choice) {
			case 1: {
				System.out.println("Thông tin kho sách: ");
				for (Book i : lb) {
					System.out.printf(i.getId() + ":Tác giả: " + i.getTacgia() + " - Giá thành: "+ i.getPrice() + " - Số lượng sách: " + i.getQuantity()+" - Thể  loại: ");
					i.type();
				}
				break;
			}
			case 2:{
				int id,quant;
				while(nextchoice == 1) {
					System.out.print("Nhập mã sách bạn muốn thêm vào giỏ: ");
					id = sc.nextInt();
					System.out.print("Nhập số lượng sách bạn muốn thêm vào giỏ: ");
					quant = sc.nextInt();
					if(Cart.addToCart(id, quant)==false) {
						System.out.println("Sách không được thêm vào giỏ hàng của bạn");
					}
					else {
						System.out.println("Sách đã được thêm thành công vào giỏ hàng của bạn");
					}
					System.out.println("Chọn số 1 để tiếp tục thêm sách vào giỏ hàng");
					System.out.println("Chọn số 0 để kết thúc công việc");
					System.out.print("Lựa chọn của bạn:");
					nextchoice = sc.nextInt();
					System.out.println("Thông tin về số sách còn lại trong kho:");
					for (Book i : lb) {
						System.out.println(i.getId() + ":Tác giả: " + i.getTacgia() + " - Giá thành: "+ i.getPrice() + " - Số lượng sách: " + i.getQuantity());
					}
				}
				break;
			}
		}

	}
}
