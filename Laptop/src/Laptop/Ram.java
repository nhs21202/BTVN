package Laptop;

public class Ram {
	private String name;
	private Hang hang;
	
	public Ram(String name, Hang hang) {
		this.name = name;
		this.hang = hang;
	}

	public String getName() {
		return name;
	}

	public Hang getHang() {
		return hang;
	}
}
