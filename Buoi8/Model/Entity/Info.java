package Model.Entity;

import Model.Enum.ChucVu;
import Model.Enum.GioiTinh;

abstract public class Info {
	private int id;
	private int tuoi;
	private String ten;
	static private int count;


	public Info(int id, int tuoi, String ten) {
		this.id = id;
		this.tuoi = tuoi;
		this.ten = ten;
		this.id =++count;
	}
	abstract public GioiTinh getGT();
	abstract public ChucVu getChuc();
	
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public int getId() {
		return id;
	}
}
