package Bai2_kethua;

public class Teacher_Sub extends Teacher {
	private String mon;
	public Teacher_Sub(String ten, int tuoi, String cccd, String mon) {
		super(ten, tuoi, cccd);
		this.mon = mon;
	}
	public String getMon() {
		return this.mon;
	}
}
