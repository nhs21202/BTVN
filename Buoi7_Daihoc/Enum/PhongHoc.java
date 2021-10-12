package Buoi7_Daihoc.Enum;

public enum PhongHoc {
	A111(1), B222(2), C333(3), D444(4), E555(5);
public final int r;
	
	private PhongHoc(int r) {
		this.r = r;
	}
	
	public static PhongHoc getPhongHoc(int r) {
		for(PhongHoc i : values()) {
			if(i.r == r) return i;
		}
		return null;
	}
}
