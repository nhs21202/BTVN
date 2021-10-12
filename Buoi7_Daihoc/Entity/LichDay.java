package Buoi7_Daihoc.Entity;

import Buoi7_Daihoc.Enum.PhongHoc;
import Buoi7_Daihoc.Enum.ThoiGian;

public class LichDay {
	private int id;
	private ThoiGian tgian;
	private PhongHoc phong;
	
	public LichDay(int id, int tgian, int phong) {
		this.id = id;
		this.tgian = ThoiGian.getThoiGian(tgian);
		this.phong = PhongHoc.getPhongHoc(phong);
	}
	
	public int getId() {
		return id;
	}
	
	public ThoiGian getThoiGian() {
		return tgian;
	}
	
	public PhongHoc getPhongHoc() {
		return phong;
	}
}
