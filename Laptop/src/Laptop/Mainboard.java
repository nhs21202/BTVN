package Laptop;

public class Mainboard {
	private String name;
	private Hang hang;
	
	public Mainboard (String name, Hang hang) {
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
