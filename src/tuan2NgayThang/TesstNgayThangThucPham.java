package tuan2NgayThang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesstNgayThangThucPham {
	public static String tieuDe()
	{
		String s="";
		s+= s.format("%10s%10s%20%10s%10s","Ma Hang","Don Gia","Ten Mat Hang","Ngay Sxuat","So Ngay HH");
		return s;
	}
	public static HangThucPham nhapThongTin()
	{
		int maHang;
		double donGia;
		String tenHang;
		GregorianCalendar ngaySXuat, ngayHHan;
		Scanner input = new Scanner(System.in);
		HangThucPham acc = new HangThucPham();
		try 
		{
		System.out.println("Nhap Ma Hang:");
		maHang= input.nextInt();
		System.out.println("Nhap don gia");
		donGia= input.nextDouble();
		System.out.println("Nhap ten hang");
		tenHang= input.nextLine();
	//????
		acc.setMaHang(maHang);
		acc.setDonGia(donGia);
		acc.setTenHang(tenHang);
		}
		catch (InputMismatchException e1) {
			System.out.println("Lỗi nhập liệu");
		}
		catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Vượt kích thước mảng");
		}
		catch (Exception e) {
			System.out.println("Bị lỗi: " + e.getMessage());
		}
		finally 
		{
			return acc;
		}
	}
	static void menu()
	{
		System.out.println("1.Chương trình quản lý hàng thực phẩm");
		System.out.println("2.Nhâp danh sách");
		System.out.println("3.Xuất Danh Sách");
		System.out.println("4.Tính khoảng cách giữa 2 ngày");
		System.out.println("5.Sắp xếp danh sách");
		System.out.println("6.Tìm thông tin thực phẩm");
		System.out.println("7.Thoát chương trình");
		System.out.println("Lựa chọn của bạn la:");
	}
	public static void main(String[] args) throws ParseException
	{
		GregorianCalendar ngay1= new GregorianCalendar(2015, Calendar.AUGUST, 12);
		GregorianCalendar ngay2= new GregorianCalendar(2017, 2, 1);
		GregorianCalendar ngay3= new GregorianCalendar(2017, 1, 27);
		//t khoáº£ng cÃ¡ch giá»¯a 2 ngÃ y
		long t=(ngay2.getTime().getTime() - ngay3.getTime().getTime())/(24*3600*1000);;	
		System.out.println(t);
		GregorianCalendar ngayHomNay= new GregorianCalendar();
		//so sanh xem ngay nao lon
		
		if(ngay2.getTime().getTime()>ngay3.getTime().getTime())
			System.out.println("ngay 2 Lon");
		else
			System.out.println("ngay 3  Lon");
		HangThucPham tp1= new HangThucPham(11, 10, "BÃ¡nh mÃ¬", ngay1, ngay2);
		HangThucPham tp2= new HangThucPham(55, 30, "BÃ¡nh Xe", ngay1, ngay3);
		DanhSachThucPham obj= new DanhSachThucPham(10);
		HangThucPham tp3=ThemThuPhamNhaptay();
		obj.them(tp1);
		obj.them(tp2);
		obj.them(tp3);
		obj.XuatDS();//??
	}
	static HangThucPham ThemThuPhamNhaptay() throws ParseException  {
		int magd;
		String ngaysx;
		System.out.println("nhap ngay san xuat dd/mm/yyyy");	
		ngaysx = new Scanner(System.in).nextLine();
		GregorianCalendar ngaySXDangNgay = new GregorianCalendar();
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		ngaySXDangNgay.setTime(sf.parse(ngaysx));
		GregorianCalendar ngay2= new GregorianCalendar(2016, 10, 25);
		HangThucPham tp1= new HangThucPham(113, 20, "BÃ¡nh trung thu", ngaySXDangNgay, ngay2);

		return tp1;

	}
}
