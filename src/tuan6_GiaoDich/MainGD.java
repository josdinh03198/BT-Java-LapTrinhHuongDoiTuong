package tuan6_GiaoDich;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import tuan3KeThua.DanhSachChuyenXe;

public class MainGD {
	public static String tieuDe1()
	{
		String s="";
		s+=String.format("%-20s%-20s%-30s%-20s%-20s%-20s","Mã GD","Số lượng","Ngày Giao Dịch","Đơn Gía","Thành Tiền","Loại Vàng");
		return s;
	}

	public static String tieuDe2()
	{
		String s="";
		s+=String.format("%-20s%-20s%-30s%-20s%-30s%-20s%-20s","Mã GD","Số lượng","Ngày Giao Dịch","Đơn Gía","Tỉ Gía","Loại Tiền Tệ","Thành Tiền");
		return s;
	}
	public static void nhapCung(ListGD dsGD)
	{
		GregorianCalendar ngay1= new GregorianCalendar(2018,9,03);
		GregorianCalendar ngay2= new GregorianCalendar(2014,5,11);
		GregorianCalendar ngay3= new GregorianCalendar(2015,6,21);
		GiaoDich gd1= new Gold("001",500,ngay1,10000,"SJC-999");
		dsGD.themGD(gd1);
		GiaoDich gd2= new Gold("003",510,ngay2,44000,"SJC-999");
		dsGD.themGD(gd2);
		GiaoDich gd3 = new Money("002",300,ngay3,50000,2000,1);
		dsGD.themGD(gd3);
	}
	public static void xuat(ArrayList<GiaoDich> dsGD)
	{
		System.out.println("Giao Dịch Vàng");
		System.out.println(tieuDe1());
		for(GiaoDich GD: dsGD)
			if(GD instanceof Gold)
				System.out.println(GD);
		System.out.println("Giao Dịch Tiền Tệ");
		System.out.println(tieuDe2());
		for(GiaoDich GD: dsGD)
			if(GD instanceof Money)
				System.out.println(GD);
	}
	public static void menu()
	{
		System.out.println("Chương trình Quản Lý Giao Dịch");
		System.out.println("1.Nhập Giao Dịch Mới");
		System.out.println("2.Xuất Giao Dịch");
		System.out.println("3.Tổng số lượng các loại giao dịch");
		System.out.println("4.Trung bình thành tiền của các loại giao dịch");
		System.out.println("5.Giao dịch có đơn giá trên 1 tỷ");
		System.out.println("0.Thoát Chương Trình");
		System.out.println("Nhập lựa chọn của bạn.");
	}
	public static GiaoDich nhapMem()
	{
		GiaoDich GD = new GiaoDich();
		Scanner input = new Scanner(System.in);
		String maGD;
		int soLuong,loaiTienTe,x;
		GregorianCalendar ngayGD = null;
		double donGia;
		float tiGia;
		String loaiVang;
		try
		{
			System.out.println("Nhập Mã giao dịch:");
			maGD= input.nextLine();
			System.out.println("Nhập ngày GD");
			System.out.println("Nhập đơn giá");
			donGia=input.nextDouble();
			System.out.println("Nhập số lượng ");
			soLuong= input.nextInt();
			System.out.println("Nhập 1 để thêm giao dịch Vàng ");
			System.out.println("Nhập 2 để thêm giao dịch tiền tệ");
			System.out.println("Mời bạn chọn");
			x=input.nextInt();
			switch(x)
			{
			case 1: 
				System.out.println("Nhập loại vàng");
				input.nextLine();
				loaiVang=input.nextLine();
				GD= new Gold(maGD, soLuong, ngayGD, donGia,loaiVang);
				break;
			case 2:
				System.out.println("Nhập tỉ giá");
				tiGia=input.nextFloat();
				System.out.println("Nhập loại tiền tệ");
				loaiTienTe= input.nextInt();
				GD = new Money(maGD, soLuong, ngayGD, donGia, tiGia, loaiTienTe);
			}
			
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Lỗi nhập liệu");
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Vượt kích thước mảng");
		}
		catch(Exception e)
		{
			System.out.println("Bị lỗi"+e.getMessage());
		}
		finally
		{
			return GD;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maGD,soLuong,loaiTienTe;
		GregorianCalendar ngayGD = null;
		double donGia;
		float tiGia;
		String loaiVang;
		
		GiaoDich GD = new GiaoDich();
		Scanner input = new Scanner(System.in);
		ListGD dsGD = new ListGD();
		menu();
		int choise = -1;
		choise = input.nextInt();
		if(choise==0)
		{
			System.out.println("Xin cảm ơn");
		}
		while(choise!=0)
		{
			switch(choise)
			{
			case 1:
				nhapCung(dsGD);
				break;
			case 2:
				xuat(dsGD.GetAll());
				break;
			case 3:
				System.out.println("Tổng số lượng giao dịch Vàng:"+dsGD.TongSLGold());
				System.out.println("Tổng số lượng giao dịch Tiền Tệ:"+dsGD.TongSLMoney());
				break;
			case 4:
				System.out.println("Trung bình thành tiền của giao dịch tiền tệ: TB= "+dsGD.TBGD());
				break;
			case 5:
				int ktra= dsGD.GiaoDich1Ty().size();
				System.out.println("Số giao dịch lớn hơn 1 tỷ: " + dsGD.GiaoDich1Ty().size());
				System.out.println("Thông tin của các giao dịch lớn hơn 1 tỷ là: ");
				if(dsGD.GiaoDich1Ty().size()!= 0)
				xuat(dsGD.GiaoDich1Ty());
			}
			menu();
			choise = input.nextInt();
			if(choise==0)
			{
				System.out.println("Xin cảm ơn");
			}

		}
		
	}

}
