package tuan6_Sach;

import java.util.GregorianCalendar;

public class SachT extends Sach {
	private double thue;

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public SachT(int maSach, GregorianCalendar ngayNhap, double donGia, int soLuong, String nXB, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nXB);
		this.thue = thue;
	}

	public SachT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SachT(int maSach, GregorianCalendar ngayNhap, double donGia, int soLuong, String nXB) {
		super(maSach, ngayNhap, donGia, soLuong, nXB);
		// TODO Auto-generated constructor stub
	}
	public double ThanhTien()
	{
		return this.ThanhTien=this.donGia*this.soLuong+ this.thue;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="";
		s+= String.format("%-20.2f%-20.2f",ThanhTien(),getThue());
		return super.toString()+s;
	}
}
