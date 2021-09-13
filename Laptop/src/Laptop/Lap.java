package Laptop;

public class Lap {
	private Hang hang;
	private CPU cpu;
	private Ram ram;
	private Mainboard mainboard;
	private int soluong;
	public Lap(Hang hang, CPU cpu, Ram ram, Mainboard mainboard, int soluong) {
		super();
		this.hang = hang;
		this.cpu = cpu;
		this.ram = ram;
		this.mainboard = mainboard;
		this.soluong = soluong;
	}
	public Hang getHang() {
		return hang;
	}
	public CPU getCpu() {
		return cpu;
	}
	public Ram getRam() {
		return ram;
	}
	public Mainboard getMainboard() {
		return mainboard;
	}
	public int getSL() {
		return soluong;
	}
}
