package Buoi7_Daihoc.Singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_Daihoc.Entity.LichDay;
import Buoi7_Daihoc.Enum.ThoiGian;
import Buoi7_Daihoc.Enum.PhongHoc;
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
	
	static public boolean isValid(int tg, int phong) {
		for (LichDay i : bangLichDay) {
			if(i.getThoiGian() == ThoiGian.getThoiGian(tg) && i.getPhongHoc() == PhongHoc.getPhongHoc(phong)) {
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
