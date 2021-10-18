package Controller.Singleton;

import java.util.ArrayList;
import java.util.List;

import Model.Entity.LichTruc;
import Model.Enum.ThoiGian;
import Model.Enum.Tang;


public class BangLichTruc {
static private List<LichTruc> bangLichTruc = new ArrayList<LichTruc>();
	
	private BangLichTruc(){
	}
	
	public List<LichTruc> getInstance() {
		return bangLichTruc;
	}
	
	static public boolean addBangLichTruc(LichTruc LichTruc) {
		bangLichTruc.add(LichTruc);
		return true;
	}
	
	static public boolean isValid(int tg, int tang) {
		for (LichTruc i : bangLichTruc) {
			if(i.getThoiGian() == ThoiGian.getThoiGian(tg) && i.getTang() == Tang.getTang(tang)) {
				return true;
			}
		}
		return false;
	}
	
	static public LichTruc getLichTruc(int id) {
		for(LichTruc i : bangLichTruc) {
			if(i.getId() == id) return i;
		}
		return null;
	}
}
