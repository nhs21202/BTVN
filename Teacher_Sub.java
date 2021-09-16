package Bai2_kethua;

public class Teacher_Sub extends Infor  {
	String sub;
		public Teacher_Sub(String ten,int tuoi,String cccd,String sub) {
			this.ten = ten ;
			this.tuoi=tuoi;
			this.cccd= cccd;
			this.sub = sub;
			}
		public String getTen() {
			return ten;
		}
		public int getTuoi() {
			return tuoi;
		}
		public String getCCCD() {
			return cccd;
		}
		public String getMon() {
			return sub;
		}
		}


