package tuan6_Sach;

import java.util.GregorianCalendar;

public class SGK extends Sach {
	private int tinhTrang;

	public int getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(int tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public SGK(int maSach, GregorianCalendar ngayNhap, double donGia, int soLuong, String nXB, int tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nXB);
		this.tinhTrang = tinhTrang;
	}

	public SGK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SGK(int maSach, GregorianCalendar ngayNhap, double donGia, int soLuong, String nXB) {
		super(maSach, ngayNhap, donGia, soLuong, nXB);
		// TODO Auto-generated constructor stub
	}
	public double ThanhTien()
	{
		if(tinhTrang==1)
			return this.ThanhTien=this.donGia*this.soLuong;
		else
			return this.ThanhTien=this.donGia*this.soLuong*0.5;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String temp;
		if(tinhTrang==1)
			temp="Moi";
			else temp= "Cu";
		String s="";
		s+= String.format("%-20.2f%-20s",ThanhTien(),temp);
		return super.toString()+s;
	}
}
