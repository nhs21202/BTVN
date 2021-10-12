package Buoi7_Daihoc.Enum;

public enum ThoiGian {
_6H45_8H (1), _9H_11H (2), _13H_15H (3), _15H_17H (4); 
	
	public final int tiet;
	
	private ThoiGian(int tiet) {
		this.tiet = tiet;
	}
	
	public static ThoiGian getThoiGian(int tiet) {
		for(ThoiGian i : values()) {
			if(i.tiet == tiet) {
				return i;
			}
		}
		return null;
	}
}
