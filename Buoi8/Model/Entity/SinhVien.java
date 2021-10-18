package Model.Entity;

import Model.Enum.ChucVu;
import Model.Enum.GioiTinh;
import Model.Enum.Type;

public class SinhVien extends Info {
	private GioiTinh gioitinh;
	private ChucVu chucvu;
	private Type type;
	
	public SinhVien(int id, int tuoi, String ten, int gioitinh, int chucvu, int type) {
		super(id, tuoi, ten);
		this.gioitinh = GioiTinh.getGT(gioitinh);
		this.chucvu = ChucVu.getChuc(chucvu);
		this.type = Type.getType(type);
	}
	
	public GioiTinh getGT() {
		return gioitinh;
	}
	
	public ChucVu getChuc() {
		return chucvu;
	}
	
	public Type getType() {
		return type;
	}
}