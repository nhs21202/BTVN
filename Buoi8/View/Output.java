package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Singleton.BangLichDay;
import Controller.Singleton.BangLichHoc;
import Controller.Singleton.BangLichTruc;
import Controller.Singleton.DSGiangVien;
import Controller.Singleton.DSNhanVien;
import Controller.Singleton.DSSinhVien;
import Controller.Utils.Utils;
import Model.Entity.LichDay;
import Model.Entity.LichHoc;
import Model.Entity.LichTruc;

public class Output {
	static Scanner sc = new Scanner(System.in);
	static List<LichDay> lichGiangVienCaNhan = new ArrayList<LichDay>();
	static List<LichHoc> lichSinhVienCaNhan = new ArrayList<LichHoc>();
	static List<LichTruc> lichNhanVienCaNhan = new ArrayList<LichTruc>();
	public static void InThongTin() {

	System.out.println("Nhap ID");
	int id = Utils.readInt(sc, 0, 100);
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
