package Controller.Main;

import java.util.Scanner;

import Controller.Utils.Utils;
import View.Menu;

public class Main {
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("1. Thực hiện công việc");
			System.out.println("2. Thoát khỏi hệ thống");
			System.out.println("Mời bạn chọn: ");
			int choice =Utils.readInt(sc, 1, 2);
			if(choice == 1) Menu.ThongBao();
			else break;
		}
	}
}
