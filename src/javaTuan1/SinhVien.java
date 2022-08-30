package javaTuan1;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private float LT,TH;
	private int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getLT() {
		return LT;
	}
	public void setLT(float lT) {
		LT = lT;
	}
	public float getTH() {
		return TH;
	}
	public void setTH(float tH) {
		TH = tH;
	}


	public SinhVien(int maSV, String hoTen, float lT, float tH) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		LT = lT;
		TH = tH;
	}
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public float diemTB()
	{
		float tb;
		tb=(getLT()+getTH())/2;
		return tb;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str="";
		str+= String.format("%15d%20s%15.2f%15.2f%15.2f",getMaSV(),getHoTen(),getLT(),getTH(),diemTB());
		return str;
	}
}
