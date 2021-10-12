package Buoi7_Daihoc.Enum;

public enum GioiTinh {
	NAM(1), NU(0), KHAC(2);

	public final int g;
	private GioiTinh(int g) {
		this.g = g;
	}
	
	public static GioiTinh getGT(int g) {
		for(GioiTinh i : values()) {
			if(i.g== g) return i;
		}
		return null;
	}
}
