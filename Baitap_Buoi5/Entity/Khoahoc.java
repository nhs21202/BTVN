package Baitap_Buoi5.Entity;

public class Khoahoc extends Sach {
	private int year;

	public Khoahoc(String tacgia, int price, int quantity, int year) {
		super(tacgia, price, quantity);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
