package Laptop;

public class CPU {
	private String name;
	private Hang hang;
	
	public CPU(String name, Hang hang) {
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
