package tuan6_Sach;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Sach {
	protected int maSach;
	protected GregorianCalendar ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nXB;
	protected double ThanhTien;
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public GregorianCalendar getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(GregorianCalendar ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getnXB() {
		return nXB;
	}
	public void setnXB(String nXB) {
		this.nXB = nXB;
	}
	public double getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(double thanhTien) {
		ThanhTien = thanhTien;
	}
	public Sach(int maSach, GregorianCalendar ngayNhap, double donGia, int soLuong, String nXB) {
		super();
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nXB = nXB;
	}
	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="";
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		s+= String.format("%-20d%-30s%-20.2f%-20d%20s",getMaSach(),sf.format(ngayNhap.getTime()),getDonGia(),getSoLuong(),getnXB());
		return s;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maSach;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sach other = (Sach) obj;
		if (maSach != other.maSach)
			return false;
		return true;
	}
}
