package Controller.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.Entity.NhanVien;


public class DSNhanVien {
static private List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
	
	private DSNhanVien(){
	}
	
	public List<NhanVien> getInstance() {
		return dsNhanVien;
	}
	
	static public boolean addDanhSachNhanVien(NhanVien nhanVien) {
		dsNhanVien.add(nhanVien);
		return true;
	}
	
	static public boolean isValid(int id) {
		for (NhanVien i : dsNhanVien) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	static public NhanVien getNhanVien(int id) {
		for (NhanVien i : dsNhanVien) {
			if(i.getId() == id) {
				return i;
			}
		}
		return null;
	}
}
