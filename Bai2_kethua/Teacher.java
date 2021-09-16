package Bai2_kethua;

public class Teacher extends Infor{
	public Teacher(String ten,int tuoi,String cccd) {
		this.ten = ten ;
		this.tuoi=tuoi;
		this.cccd= cccd;
		}
	public String getTen() {
		return ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public String getCCCD() {
		return cccd;
	}
}
