package BTBook_Buoi6.Entity;

public class VanHoc extends Book {
	private int taiBan;

	public VanHoc(String tacgia, int price, int quantity, int taiBan) {
		super(tacgia, price, quantity);
		this.taiBan = taiBan;
	}
	public int getTaiBan() {
		return taiBan;
	}

	public void setTaiBan(int taiBan) {
		this.taiBan = taiBan;
	}
	public void type() {
		System.out.println("Van Hoc");
	}
}
