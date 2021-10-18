package Controller.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.Entity.LichHoc;
import Model.Enum.ThoiGian;
import Model.Enum.PhongHoc;


public class BangLichHoc {
static private List<LichHoc> bangLichHoc = new ArrayList<LichHoc>();
	
	private BangLichHoc(){
	}
	
	public List<LichHoc> getInstance() {
		return bangLichHoc;
	}
	
	static public boolean addBangLichHoc(LichHoc LichHoc) {
		bangLichHoc.add(LichHoc);
		return true;
	}
	
	static public boolean isValid(int tg, int phong) {
		for (LichHoc i : bangLichHoc) {
			if(i.getThoiGian() == ThoiGian.getThoiGian(tg) && i.getPhongHoc() == PhongHoc.getPhongHoc(phong)) {
				return true;
			}
		}
		return false;
	}
	
	static public LichHoc getLichHoc(int id) {
		for(LichHoc i : bangLichHoc) {
			if(i.getId() == id) return i;
		}
		return null;
	}
}
