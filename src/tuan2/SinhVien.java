package tuan2;

public class SinhVien {
	private int mSV;
	private String hoTen;
	private String diaChi;
	private int sDT;	
	public int getmSV() {
		return mSV;
	}
	public void setmSV(int mSV) {
		this.mSV = mSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getsDT() {
		return sDT;
	}
	public void setsDT(int sDT) {
		this.sDT = sDT;
	}
	public SinhVien(int mSV, String hoTen, String diaChi, int sDT) {
		super();
		this.mSV = mSV;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.sDT = sDT;
	}
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str="";
		str= String.format("%15d%30s%20s%15d",getmSV(),getHoTen(),getDiaChi(),getsDT());
		return str;
	}
}
