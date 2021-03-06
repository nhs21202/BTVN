package View;

import java.util.Scanner;

import Controller.Singleton.BangLichDay;
import Controller.Singleton.BangLichHoc;
import Controller.Singleton.BangLichTruc;
import Controller.Singleton.DSGiangVien;
import Controller.Singleton.DSNhanVien;
import Controller.Singleton.DSSinhVien;
import Controller.Utils.Utils;
import Model.Entity.GiangVien;
import Model.Entity.LichDay;
import Model.Entity.LichHoc;
import Model.Entity.LichTruc;
import Model.Entity.NhanVien;
import Model.Entity.SinhVien;
import Model.Enum.ChucVu;
import Model.Enum.GioiTinh;
import Model.Enum.PhongHoc;
import Model.Enum.Tang;
import Model.Enum.ThoiGian;

public class Input {
 static Scanner sc= new Scanner(System.in);
	static public void NhapThongTin() {
		System.out.println("Nhap ID: ");
		int id = Utils.readInt(sc, 1, 100);
		System.out.println("Nhap ten: ");
		sc.nextLine();
		String ten; 
		ten = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		int tuoi = Utils.readInt(sc, 18, 70);
		System.out.print("Nhap gioi tinh(nhap so tuong ung)(NU(0), NAM(1), KHAC(2)):");
		int gioiTinh = Utils.readInt(sc, 0, 2);
		System.out.print("Nhap chuc vu(Nhap so tuong ung)(BAOVE(1), VESINH(2), GIANGVIEN(3), SINHVIEN(4)):");
		int chucVu = Utils.readInt(sc,1,4);
		if(ChucVu.getChuc(chucVu) == ChucVu.GIANGVIEN) {
			if(DSGiangVien.isValid(id) == false) {
				DSGiangVien.addDanhSachGiangVien(new GiangVien(id, tuoi, ten, gioiTinh, chucVu));
			}
			System.out.print("Nhap thoi gian can them vao lich(nhap so tuong ung)(_6H45_8H (1), _9H_11H (2), _13H_15H (3), _15H_17H (4)):");
			int tg = Utils.readInt(sc,1,4);
			System.out.print("Nhap phong hoc can them vao lich (nhap so tuong ung)(A111(1), B222(2), C333(3), D444(4), E555(5):");
			int phong = Utils.readInt(sc,1,5);
			if(BangLichDay.isValid(tg, phong) == false) {
				BangLichDay.addBangLichDay(new LichDay(id, tg, phong));
			}
		}
		else if(ChucVu.getChuc(chucVu) == ChucVu.SINHVIEN) {
			System.out.print("Nhap he dao tao sinh vien(Nhap so tuong ung):(CHINHQUY(1), LIENTHONG(2), TAICHUC(3))");
			int loaiSinhVien; 
			loaiSinhVien = sc.nextInt();
			if(DSSinhVien.isValid(id) == false) {
				DSSinhVien.addDanhSachSinhVien(new SinhVien(id, tuoi, ten, gioiTinh, chucVu, loaiSinhVien));
			}
			System.out.print("Nhap thoi gian can them vao lich(nhap so tuong ung)(_6H45_8H (1), _9H_11H (2), _13H_15H (3), _15H_17H (4)):");
			int tg= Utils.readInt(sc,1,4);
			System.out.print("Nhap phong hoc can them vao lich (nhap so tuong ung)(A111(1), B222(2), C333(3), D444(4), E555(5):");
			int phong= Utils.readInt(sc,1,5);
			if(BangLichDay.isValid(tg, phong) == false) {
				BangLichDay.addBangLichDay(new LichDay(id, tg, phong));
			}
		}
		else{
			if(DSNhanVien.isValid(id) == false) {
				DSNhanVien.addDanhSachNhanVien(new NhanVien(id, tuoi, ten, gioiTinh, chucVu));
			}
			System.out.print("Nhap thoi gian can them vao lich(nhap so tuong ung)(_6H45_8H (1), _9H_11H (2), _13H_15H (3), _15H_17H (4)):");
			int tg= Utils.readInt(sc,1,4); 
			System.out.println("Nhap tang can them vao lich truc(Nhap so tuong ung)(TANG1(1), TANG2(2), TANG3(3), TANG4(4)): ");
			int tang= Utils.readInt(sc,1,4);
			if(BangLichTruc.isValid(tg, tang) == false) {
				BangLichTruc.addBangLichTruc(new LichTruc(id, tg, tang));
			}
		}
	}
	static public void NhapBangLich() {
		System.out.println("1. Th??m v??o b???ng l???ch d???y");
		System.out.println("2. Th??m v??o b???ng l???ch h???c");
		System.out.println("3. Th??m v??o b???ng l???ch tr???c");
		System.out.println("L???a ch???n c???a b???n : ");
		int x =Utils.readInt(sc, 1, 3);
		if(x == 1) Input.NhapCaDay();
		else if(x == 2) Input.NhapCaHoc();
		else Input.NhapCaTruc();
	}
	public static void NhapCaDay() {
		System.out.println("Nh???p ID gi???ng vi??n: ");
		int id = Utils.readInt(sc, 1, 100);
		System.out.println("Nh???p th???i gian c???n th??m v??o l???ch(Nh???p s??? t????ng ???ng)(_6H45_8H (1), _9H_11H (2), _13H_15H (3), _15H_17H (4))");
		int tg = Utils.readInt(sc, 1, 4);
		System.out.println("Nh???p ph??ng h???c c???n th??m (Nh???p s??? t????ng ???ng)((A111(1), B222(2), C333(3), D444(4), E555(5))");
		int ph = Utils.readInt(sc, 1, 5);
		
		if(BangLichDay.isValid (tg, ph) == false) {
			BangLichDay.addBangLichDay(new LichDay(id, tg, ph));
		}
	}
	 
	 public static void NhapCaHoc() {
		System.out.println("Nh???p ID sinh vi??n: ");
		int id = Utils.readInt(sc, 1, 100);
		System.out.println("Nh???p th???i gian c???n th??m v??o l???ch(Nh???p s??? t????ng ???ng)(_6H45_8H (1), _9H_11H (2), _13H_15H (3), _15H_17H (4))");
		int tg = Utils.readInt(sc, 1, 4);
		System.out.println("Nh???p ph??ng h???c c???n th??m (Nh???p s??? t????ng ???ng)((A111(1), B222(2), C333(3), D444(4), E555(5))");
		int ph = Utils.readInt(sc, 1, 5);
		if(BangLichHoc.isValid(tg, ph) == false) {
			BangLichHoc.addBangLichHoc(new LichHoc(id, tg, ph));
		}
	}
	 
	public static void NhapCaTruc(){
		System.out.println("Nh???p ID nh??n vi??n tr???c: ");
		int id = Utils.readInt(sc, 1, 100);
		System.out.println("Nh???p th???i gian c???n th??m v??o l???ch(Nh???p s??? t????ng ???ng)(_6H45_8H (1), _9H_11H (2), _13H_15H (3), _15H_17H (4))");
		int tg = Utils.readInt(sc, 1, 4);
		System.out.println("Nh???p t???ng c???n th??m(Nh???p s??? t????ng ???ng)(TANG1(1), TANG2(2), TANG3(3), TANG4(4))");
		int tang = Utils.readInt(sc, 1, 4);
		
		if(BangLichTruc.isValid(tg, tang) == false) {
			BangLichTruc.addBangLichTruc(new LichTruc(id,tg, tang));
		}
	}
}
