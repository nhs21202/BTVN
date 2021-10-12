package Buoi7_Daihoc.Entity;

import Buoi7_Daihoc.Enum.Tang;
import Buoi7_Daihoc.Enum.ThoiGian;

public class LichTrucNV {
	private int id;
	private ThoiGian tgian;
	private Tang tang;
	
	public LichTrucNV(int id, int tgian, int tang) {
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
