package tuan6_GiaoDich;

import java.util.GregorianCalendar;

public class Money extends GiaoDich {
	private double tiGia;
	private int LoaiTienTe;

	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(float tiGia) {
		this.tiGia = tiGia;
	}
	public int getLoaiTienTe() {
		return LoaiTienTe;
	}
	public void setLoaiTienTe(int loaiTienTe) {
		LoaiTienTe = loaiTienTe;
	}
	public Money(String maGD, int soLuong, GregorianCalendar ngayGD, double donGia,float tiGia,
			int loaiTienTe) {
		super(maGD, soLuong, ngayGD, donGia);
		this.tiGia = tiGia;
		LoaiTienTe = loaiTienTe;
	}
	public Money() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Money(String maGD, int soLuong, GregorianCalendar ngayGD, double donGia) {
		super(maGD, soLuong, ngayGD, donGia);
		// TODO Auto-generated constructor stub
	}
	public double ThanhTien()
	{
		if(LoaiTienTe==1)
			return this.thanhTien=this.donGia*this.soLuong;
		else 
			return this.thanhTien=this.donGia*this.soLuong*this.tiGia;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String temp="";
		if(LoaiTienTe==1)
			temp="VND";
		else if(LoaiTienTe==2)
			temp="USB";
		else temp="EURO";
		String s="";
		s+= String.format("%-20.0f%-30s%-20.2f",getTiGia(),temp,ThanhTien());
		return super.toString()+s;
	}
}
