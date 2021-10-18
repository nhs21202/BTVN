package Model.Enum;

public enum Tang {
ANG1(1), TANG2(2), TANG3(3), TANG4(4);
	
	private final int f;
	
	private Tang(int f) {
		this.f = f;
	}
	
	public static Tang getTang(int f) {
		for(Tang i : values()) {
			if(i.f == f) return i;
		}
		return null;
	}
}
