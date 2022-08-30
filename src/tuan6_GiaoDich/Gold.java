package tuan6_GiaoDich;

import java.util.GregorianCalendar;

public class Gold extends GiaoDich {
	private String loaiVang;

	
	public String getLoaiVang() {
		return loaiVang;
	}


	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}


	public Gold(String maGD, int soLuong, GregorianCalendar ngayGD, double donGia, String loaiVang) {
		super(maGD, soLuong, ngayGD, donGia);
		this.loaiVang = loaiVang;
	}

	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double ThanhTien()
	{
		return this.thanhTien=this.getDonGia()*this.getSoLuong();
	}

	public Gold(String maGD, int soLuong, GregorianCalendar ngayGD, double donGia) {
		super(maGD, soLuong, ngayGD, donGia);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="";
		s+= String.format("%-20.2f%-30s",ThanhTien(),getLoaiVang());
		return super.toString()+ s;
	}

}
