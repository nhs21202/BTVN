package View;

import java.util.Scanner;

import Controller.Utils.Utils;

public class Menu {
static Scanner sc = new Scanner(System.in);
	
	public static void ThongBao() {
		System.out.println("Nhập công việc bạn muốn thực hiện:");
		System.out.println("1. Thêm thông tin vào các danh sách");
		System.out.println("2. Thêm lịch làm việc");
		System.out.println("3. Tìm thông tin theo ID");
		System.out.println("Chon: ");
		
		int x = Utils.readInt(sc, 1, 3);
		if(x == 1) Input.NhapThongTin();
		else if(x == 2) Input.NhapBangLich();
		else Output.InThongTin();
	}
}
