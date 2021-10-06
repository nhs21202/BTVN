package BTBook_Buoi6.Entity;

public class KhoaHoc extends Book {
	private int year;

	public KhoaHoc(String tacgia, int price, int quantity, int year) {
		super(tacgia, price, quantity);
		this.year = year;
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void type() {
		System.out.println("Khoa Hoc");
	}

}
