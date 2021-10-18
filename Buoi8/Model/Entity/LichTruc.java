package Model.Entity;

import Model.Enum.Tang;
import Model.Enum.ThoiGian;

public class LichTruc {
	private int id;
	private ThoiGian tgian;
	private Tang tang;
	
	public LichTruc(int id, int tgian, int tang) {
		this.id = id;
		this.tgian = ThoiGian.getThoiGian(tgian);
		this.tang = Tang.getTang(tang);
	}
	
	public int getId() {
		return id;
	}
	
	public ThoiGian getThoiGian() {
		return tgian;
	}
	
	public Tang getTang() {
		return tang;
	}
}
