package Baitap_Buoi5.Entity;

public class Vanhoc extends Sach {
	private int taiban;

	public Vanhoc(String tacgia, int price, int quantity, int taiban) {
		super(tacgia, price, quantity);
		this.taiban = taiban;
	}

	public int getTaiBan() {
		return taiban;
	}

	public void setTaiBan(int taiban) {
		this.taiban = taiban;
	}
}
