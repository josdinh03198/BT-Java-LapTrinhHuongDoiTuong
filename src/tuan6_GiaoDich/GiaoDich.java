package tuan6_GiaoDich;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class GiaoDich {
	protected String maGD;
	protected int soLuong;
	protected GregorianCalendar ngayGD;
	protected double donGia;
	protected double thanhTien;
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public GregorianCalendar getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(GregorianCalendar ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	
	public GiaoDich(String maGD, int soLuong, GregorianCalendar ngayGD, double donGia) {
		super();
		this.maGD = maGD;
		this.soLuong = soLuong;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
	}
	public GiaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		String s= String.format("%-20s%-20d%-30s%-20.2f", getMaGD(), getSoLuong(), df.format(ngayGD.getTime()), getDonGia());
		
		return s;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maGD == null) ? 0 : maGD.hashCode());
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
		GiaoDich other = (GiaoDich) obj;
		if (maGD == null) {
			if (other.maGD != null)
				return false;
		} else if (!maGD.equals(other.maGD))
			return false;
		return true;
	}
	
}
