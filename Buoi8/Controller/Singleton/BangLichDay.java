package Controller.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.Entity.LichDay;
import Model.Enum.ThoiGian;
import Model.Enum.PhongHoc;

public class BangLichDay {
static private List<LichDay> bangLichDay = new ArrayList<LichDay>();
	
	private BangLichDay(){
	}
	
	public List<LichDay> getInstance() {
		return bangLichDay;
	}
	
	static public boolean addBangLichDay(LichDay LichDay) {
		bangLichDay.add(LichDay);
		return true;
	}
	
	static public boolean isValid(int thoiGian, int phongHoc) {
		for (LichDay i : bangLichDay) {
			if(i.getThoiGian() == ThoiGian.getThoiGian(thoiGian) && i.getPhongHoc() == PhongHoc.getPhongHoc(phongHoc)) {
				return true;
			}
		}
		return false;
	}
	
	static public LichDay getLichDay(int id) {
		for(LichDay i : bangLichDay) {
			if(i.getId() == id) return i;
		}
		return null;
	}
}
