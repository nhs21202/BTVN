package Baitap_Buoi5.Singleton;

import java.util.ArrayList;
import java.util.List;
import Baitap_Buoi5.Entity.Sach;
public class Inventory {
	static private List<Sach> inventory = new ArrayList<Sach>();
	private Inventory() {
	}
	static public List<Sach> getInstance() {
		return inventory;
	}

	static public void addToInventory(Sach Sach) {
		inventory.add(Sach);
	}

	static public boolean isValid(int id) {
		for (Sach i : inventory) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public Sach getBook(int id) {
		return inventory.get(id - 1);
	}

	static public boolean addQuantity(int id, int quantity) {
		if(!Inventory.isValid(id)) {
			System.out.println("Không có loại sách này");
			return false;
		}else {
			Inventory.getBook(id).addQuantity(quantity);
		}
		return true;
	}
}
