package Laptop;
import java.util.ArrayList;
import Laptop.CPU;
import Laptop.Hang;
import Laptop.Lap;
import Laptop.Mainboard;
import Laptop.Ram;
public class Main {
	public static void main(String[] args) {
		ArrayList<Hang> list_Hang = new ArrayList<Hang>();
		list_Hang.add(new Hang("Asus"));
		list_Hang.add(new Hang("Dell"));
		list_Hang.add(new Hang("Lenovo"));
		list_Hang.add(new Hang("MSI"));
		
		
		ArrayList<CPU> list_CPU = new ArrayList<CPU>();
		list_CPU.add(new CPU("ADM Ryzen 5", list_Hang.get(0)));
		list_CPU.add(new CPU("ADM Ryzen 7 3700X", list_Hang.get(1)));
		list_CPU.add(new CPU("Intel Core i7", list_Hang.get(2)));
		list_CPU.add(new CPU("Intel Core i9", list_Hang.get(3)));
		
		ArrayList<Ram> list_Ram = new ArrayList<Ram>();
		list_Ram.add(new Ram("DDR SDRAM", list_Hang.get(0)));
		list_Ram.add(new Ram("DDR3 SDRAM", list_Hang.get(1)));
		list_Ram.add(new Ram("SDR SDRAM", list_Hang.get(2)));
		list_Ram.add(new Ram("DDR2 RAM", list_Hang.get(3)));
		
		ArrayList<Mainboard> list_Mainboard = new ArrayList<Mainboard>();
		list_Mainboard.add(new Mainboard("Mainboard AT", list_Hang.get(0)));
		list_Mainboard.add(new Mainboard("Mainboard ATX", list_Hang.get(1)));
		list_Mainboard.add(new Mainboard("Mainboard EATX", list_Hang.get(2)));
		list_Mainboard.add(new Mainboard("Mainboard ITX", list_Hang.get(3)));
		
		ArrayList<Lap> list_Laptop = new ArrayList<Lap>();
		list_Laptop.add(new Lap(list_Hang.get(0), list_CPU.get(1), list_Ram.get(2), list_Mainboard.get(3), 3));
		list_Laptop.add(new Lap(list_Hang.get(3), list_CPU.get(2), list_Ram.get(1), list_Mainboard.get(0), 4));
		list_Laptop.add(new Lap(list_Hang.get(1), list_CPU.get(0), list_Ram.get(3), list_Mainboard.get(2), 5));
		list_Laptop.add(new Lap(list_Hang.get(2), list_CPU.get(3), list_Ram.get(0), list_Mainboard.get(1), 6));
		
		
		
		for (int i=0; i<=3; i++)
		{
			System.out.printf("%s %s %s %s %d \n", list_Laptop.get(i).getHang().getName(),list_Laptop.get(i).getCpu().getName(), list_Laptop.get(i).getRam().getName(),
                list_Laptop.get(i).getMainboard().getName(), list_Laptop.get(i).getSL());
			
		}
	}
}
