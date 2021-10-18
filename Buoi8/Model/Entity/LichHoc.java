package Model.Entity;

import Model.Enum.PhongHoc;
import Model.Enum.ThoiGian;

public class LichHoc {
	private int id;
	private ThoiGian tgian;
	private PhongHoc phong;
	
	public LichHoc(int id, int tgian, int phong) {
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
