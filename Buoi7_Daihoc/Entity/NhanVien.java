package Buoi7_Daihoc.Entity;

import Buoi7_Daihoc.Enum.ChucVu;
import Buoi7_Daihoc.Enum.GioiTinh;

public class NhanVien extends Info {
	private GioiTinh gioitinh;
	private ChucVu chucvu;
	
	public NhanVien(int id, int tuoi, String ten, int gioitinh, int chucvu) {
		super(id, tuoi, ten);
		this.gioitinh = GioiTinh.getGT(gioitinh);
		this.chucvu = ChucVu.getChuc(chucvu);
	}
	
	public GioiTinh getGT() {
		return gioitinh;
	}
	
	public ChucVu getChuc() {
		return chucvu;
	}
}
