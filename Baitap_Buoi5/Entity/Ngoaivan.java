package Baitap_Buoi5.Entity;

public class Ngoaivan extends Sach {
	private String maISBN;

	public Ngoaivan(String tacgia, int price, int quantity, String maISBN) {
		super(tacgia,price,quantity);
		this.maISBN = maISBN;
	}

	public String getMaSo() {
		return maISBN;
	}

	public void setMaSo(String maISBN) {
		this.maISBN = maISBN;
	}
}
