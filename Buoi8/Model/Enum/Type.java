package Model.Enum;
public enum Type {
CHINHQUY(1), LIENTHONG(2), TAICHUC(3);
	
	public final int t;
	
	private Type(int t) {
		this.t = t;
	}
		
	public static Type getType(int t) {
		for(Type i : values()) {
			if(i.t == t) {
				return i;
			}
		}
		return null;
	}
}
