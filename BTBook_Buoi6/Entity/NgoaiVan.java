package BTBook_Buoi6.Entity;

public class NgoaiVan extends Book {
	private String maISBN;

	public NgoaiVan(String tacgia, int price, int quantity, String maISBN) {
		super(tacgia, price, quantity);
		this.maISBN = maISBN;
	}
	public String getMa() {
		return maISBN;
	}

	public void setMa(String maISBN) {
		this.maISBN = maISBN;
	}
	public void type() {
		System.out.println("Ngoai Van");
	}
}
