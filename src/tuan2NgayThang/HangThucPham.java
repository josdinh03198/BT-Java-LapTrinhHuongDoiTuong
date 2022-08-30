package tuan2NgayThang;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class HangThucPham 
{
	private int maHang;
	private double donGia;
	private String tenHang;
	private  GregorianCalendar ngaySXuat, ngayHHan;
	public int getMaHang() {
		return maHang;
	}
	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public GregorianCalendar getNgaySXuat() {
		return ngaySXuat;
	}
	public void setNgaySXuat(GregorianCalendar ngaySXuat) {
		this.ngaySXuat = ngaySXuat;
	}
	public GregorianCalendar getNgayHHan() {
		return ngayHHan;
	}
	public void setNgayHHan(GregorianCalendar ngayHHan) {
		this.ngayHHan = ngayHHan;
	}
	public HangThucPham(int maHang, double donGia, String tenHang, GregorianCalendar ngaySXuat,
			GregorianCalendar ngayHHan) {
		super();
		this.maHang = maHang;
		this.donGia = donGia;
		this.tenHang = tenHang;
		this.ngaySXuat = ngaySXuat;
		this.ngayHHan = ngayHHan;
	}

	public HangThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//viet nam dd/mm/yy==> dinh dang
		//15/02/2017==> ngaySXuat.getTime().getYear() khong dung 2017
		//15/02/2017==> ngaySXuat.getTime().getYear()+1900 ==>dung 2017
		String s="";
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
	
		s+=String.format("%10d%20s%5.2f%s%4d", getMaHang(),getDonGia(), getTenHang(), df.format(ngaySXuat.getTime())+"\t", 
				df.format(ngayHHan.getTime())+"\t",  ngaySXuat.getTime().getYear()+1900);
		return s;
	}
	 

}
