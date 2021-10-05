package Baitap_Buoi5.Entity;

public class Sach {
	private int id;
	private String tacgia;
	private int price;
	private int quantity;
	static private int count;

	public Sach(String tacgia, int price, int quantity) {
		this.tacgia = tacgia;
		this.price = price;
		this.quantity = quantity;
		this.id = ++count;
	}

	public String getTacgia() {
		return tacgia;
	}

	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Sach.count = count;
	}

	public int getId() {
		return id;
	}
	public void addQuantity(int q) {
		this.quantity = this.quantity+q;
	}
}
