package Controller.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.Entity.GiangVien;


public class DSGiangVien {
static private List<GiangVien> dsGiangVien = new ArrayList<GiangVien>();
	
	private DSGiangVien(){
	}
	
	public List<GiangVien> getInstance() {
		return dsGiangVien;
	}
	
	static public boolean addDanhSachGiangVien(GiangVien giangVien) {
		dsGiangVien.add(giangVien);
		return true;
	}
	
	static public boolean isValid(int id) {
		for (GiangVien i : dsGiangVien) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}

		static public GiangVien getGiangVien(int id) {
			for (GiangVien i : dsGiangVien) {
				if(i.getId() == id) {
					return i;
				}
			}
			return null;
		}
}
