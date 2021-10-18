package Controller.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.Entity.SinhVien;


public class DSSinhVien {
	static private List<SinhVien> dsSinhVien = new ArrayList<SinhVien>();

	private DSSinhVien(){
	}

	public List<SinhVien> getInstance() {
		return dsSinhVien;
	}

	static public boolean addDanhSachSinhVien(SinhVien sinhVien) {
		dsSinhVien.add(sinhVien);
		return true;
	}

	static public boolean isValid(int id) {
		for (SinhVien i : dsSinhVien) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}

		static public SinhVien getSinhVien(int id) {
			for (SinhVien i : dsSinhVien) {
				if(i.getId() == id) {
					return i;
				}
			}
			return null;
		}
}
