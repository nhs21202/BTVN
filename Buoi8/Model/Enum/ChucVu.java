package Model.Enum;
public enum ChucVu {
	BAOVE(1), VESINH(2), GIANGVIEN(3), SINHVIEN(4);

	public final int a;
	
	private ChucVu(int a) {
		this.a= a;
	}
		
	public static ChucVu getChuc(int a) {
		for(ChucVu i : values()) {
			if(i.a == a) {
				return i;
			}
		}
		return null;
	}
}
