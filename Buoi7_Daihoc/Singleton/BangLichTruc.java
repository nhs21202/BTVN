package Buoi7_Daihoc.Singleton;
import java.util.ArrayList;
import java.util.List;
import Buoi7_Daihoc.Enum.Tang;
import Buoi7_Daihoc.Entity.LichTrucNV;
import Buoi7_Daihoc.Enum.ThoiGian;
public class BangLichTruc {
static private List<LichTrucNV> bangLichTruc = new ArrayList<LichTrucNV>();
	
	private BangLichTruc(){
	}
	
	public List<LichTrucNV> getInstance() {
		return bangLichTruc;
	}
	
	static public boolean addBangLichTruc(LichTrucNV LichTrucNV) {
		bangLichTruc.add(LichTrucNV);
		return true;
	}
	
	static public boolean isValid(int tg, int tang) {
		for (LichTrucNV i : bangLichTruc) {
			if(i.getThoiGian() == ThoiGian.getThoiGian(tg) && i.getTang() == Tang.getTang(tang)) {
				return true;
			}
		}
		return false;
	}
	
	static public LichTrucNV getLichTruc(int id) {
		for(LichTrucNV i : bangLichTruc) {
			if(i.getId() == id) return i;
		}
		return null;
	}
}
