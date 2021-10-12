package Buoi7_Daihoc.Entity;

import Buoi7_Daihoc.Enum.ChucVu;
import Buoi7_Daihoc.Enum.GioiTinh;
import Buoi7_Daihoc.Enum.Type;

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
