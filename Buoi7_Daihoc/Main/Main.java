package Buoi7_Daihoc.Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Buoi7_Daihoc.Entity.LichDay;
import Buoi7_Daihoc.Entity.GiangVien;
import Buoi7_Daihoc.Entity.LichHoc;
import Buoi7_Daihoc.Entity.LichTrucNV;
import Buoi7_Daihoc.Entity.NhanVien;
import Buoi7_Daihoc.Entity.SinhVien;
import Buoi7_Daihoc.Enum.ChucVu;
import Buoi7_Daihoc.Singleton.BangLichDay;
import Buoi7_Daihoc.Singleton.BangLichHoc;
import Buoi7_Daihoc.Singleton.BangLichTruc;
import Buoi7_Daihoc.Singleton.DSGiangVien;
import Buoi7_Daihoc.Singleton.DSNhanVien;
import Buoi7_Daihoc.Singleton.DSSinhVien;

public class Main {
	public static void main(String[] args) {
		DSSinhVien.addDanhSachSinhVien(new SinhVien(2,19,"Son",1,4,3));
		DSSinhVien.addDanhSachSinhVien(new SinhVien(3,18,"Minh",0,4,1));
		DSSinhVien.addDanhSachSinhVien(new SinhVien(4,19,"Thang",2,4,2));

		DSNhanVien.addDanhSachNhanVien(new NhanVien(3,40,"BV1",1,1));
		DSNhanVien.addDanhSachNhanVien(new NhanVien(1,29,"BV2",0,2));

		DSGiangVien.addDanhSachGiangVien(new GiangVien(1,30,"GV1",0,3));
		DSGiangVien.addDanhSachGiangVien(new GiangVien(2,29,"GV2",1,3));

		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Chon cong viec ban muon thuc hien:");
		System.out.println("1. Them thong tin vao danh sach,lich cua giang vien, sinh vien, nhan vien");
		System.out.println("2. In thong tin theo ID ban nhap");
		System.out.print("Ban chon:");
		choice =sc.nextInt();
		if(choice ==1) {
			System.out.println("Nhap ID: ");
			int id;
			id = sc.nextInt();
			System.out.println("Nhap ten: ");
			sc.nextLine();
			String ten; 
			ten = sc.nextLine();
			System.out.println("Nhap tuoi: ");
			int tuoi;
			tuoi = sc.nextInt();
			System.out.print("Nhap gioi tinh(nhap so tuong ung)(NU(0), NAM(1), KHAC(2)):");
			int gioiTinh; 
			gioiTinh = sc.nextInt();
			System.out.print("Nhap chuc vu(Nhap so tuong ung)(BAOVE(1), VESINH(2), GIANGVIEN(3), SINHVIEN(4)):");
			int chucVu;
			chucVu = sc.nextInt();
			if(ChucVu.getChuc(chucVu) == ChucVu.GIANGVIEN) {
				if(DSGiangVien.isValid(id) == false) {
					DSGiangVien.addDanhSachGiangVien(new GiangVien(id, tuoi, ten, gioiTinh, chucVu));
				}
				System.out.print("Nhap thoi gian can them vao lich(nhap so tuong ung)(_6H45_8H (1), _9H_11H (2), _13H_15H (3), _15H_17H (4)):");
				int tg;
				tg = sc.nextInt();
				System.out.print("Nhap phong hoc can them vao lich (nhap so tuong ung)(A111(1), B222(2), C333(3), D444(4), E555(5):");
				int phong;
				phong = sc.nextInt();
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
				int tg; 
				tg = sc.nextInt();
				System.out.print("Nhap phong hoc can them vao lich (nhap so tuong ung)(A111(1), B222(2), C333(3), D444(4), E555(5):");
				int phong;
				phong = sc.nextInt();
				if(BangLichDay.isValid(tg, phong) == false) {
					BangLichDay.addBangLichDay(new LichDay(id, tg, phong));
				}
			}
			else{
				if(DSNhanVien.isValid(id) == false) {
					DSNhanVien.addDanhSachNhanVien(new NhanVien(id, tuoi, ten, gioiTinh, chucVu));
				}
				System.out.print("Nhap thoi gian can them vao lich(nhap so tuong ung)(_6H45_8H (1), _9H_11H (2), _13H_15H (3), _15H_17H (4)):");
				int tg; 
				tg = sc.nextInt();
				System.out.println("Nhap tang can them vao lich truc(Nhap so tuong ung)(TANG1(1), TANG2(2), TANG3(3), TANG4(4)): ");
				int tang;
				tang = sc.nextInt();
				if(BangLichTruc.isValid(tg, tang) == false) {
					BangLichTruc.addBangLichTruc(new LichTrucNV(id, tg, tang));
				}
			}
		}
		else if(choice ==2) {
			System.out.println("Nhap ID");
			int id; 
			id = sc.nextInt();
			System.out.println("Thong tin chi tiet");
			if(DSGiangVien.getGiangVien(id) != null) {
				System.out.println(DSGiangVien.getGiangVien(id).getId());
				System.out.println(DSGiangVien.getGiangVien(id).getTen());
				System.out.println(DSGiangVien.getGiangVien(id).getTuoi());
				System.out.println(DSGiangVien.getGiangVien(id).getGT());
				System.out.println(DSGiangVien.getGiangVien(id).getChuc());	
				
				if(BangLichDay.getLichDay(id) !=null) {
					System.out.println(BangLichDay.getLichDay(id).getPhongHoc());
					System.out.println(BangLichDay.getLichDay(id).getThoiGian());
				}
			}
			else if(DSNhanVien.getNhanVien(id) != null) {
				System.out.println(DSNhanVien.getNhanVien(id).getId());
				System.out.println(DSNhanVien.getNhanVien(id).getTen());
				System.out.println(DSNhanVien.getNhanVien(id).getTuoi());
				System.out.println(DSNhanVien.getNhanVien(id).getGT());
				System.out.println(DSNhanVien.getNhanVien(id).getChuc());
				
				if(BangLichTruc.getLichTruc(id) !=null) {
					System.out.println(BangLichTruc.getLichTruc(id).getTang());
					System.out.println(BangLichTruc.getLichTruc(id).getThoiGian());
				}
			}
			else if(DSSinhVien.getSinhVien(id) != null){
				System.out.println(DSSinhVien.getSinhVien(id).getId());
				System.out.println(DSSinhVien.getSinhVien(id).getTen());
				System.out.println(DSSinhVien.getSinhVien(id).getTuoi());
				System.out.println(DSSinhVien.getSinhVien(id).getGT());
				System.out.println(DSSinhVien.getSinhVien(id).getChuc());

				if(BangLichHoc.getLichHoc(id) !=null) {
					System.out.println(BangLichHoc.getLichHoc(id).getPhongHoc());
					System.out.println(BangLichHoc.getLichHoc(id).getThoiGian());
				}
			}
		}
	}
}
