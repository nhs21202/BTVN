package BTBook_Buoi6.Entity;

public abstract class Book {
	private int id;
	private String tacgia;
	private int price;
	private int quantity;
	static private int count;

	public Book(String tacgia, int price, int quantity) {
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
		Book.count = count;
	}

	public int getId() {
		return id;
	}
	public abstract void type();

}
