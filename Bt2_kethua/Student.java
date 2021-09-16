package Bai2_kethua;

public class Student extends Infor{
	String cls;
	public Student(String ten,int tuoi,String cccd, String cls ) {
		this.ten = ten ;
		this.tuoi=tuoi;
		this.cccd= cccd;
		this.cls = cls;
		}
	public String getTen() {
		return ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public String getCCCD() {
		return cccd;
	}public String getLop() {
		return cls ;
	}
}
