package tuan6_Sach;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainSach {
		public static String tieuDe1()
		{
			String s="";
			s+=String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-15s","Mã GD","Ngày Nhập","Số lượng","Đơn Gía","Nhà Xuất Bản","Thành Tiền","Tinh Trạng");
			return s;
		}

		public static String tieuDe2()
		{
			String s="";
			s+=String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-15s","Mã GD","Ngày Nhập","Số lượng","Đơn Gía","Nhà Xuất Bản","Thành Tiền","Thuế");
			return s;
		}
		public static void xuat(ArrayList<Sach> ds)
		{
			System.out.println("Sách Giáo Khoa");
			System.out.println(tieuDe1());
			for(Sach s: ds)
				if(s instanceof SGK)
					System.out.println(s);
			System.out.println("Sách tham khảo");
			System.out.println(tieuDe2());
			for(Sach s: ds)
				if(s instanceof SachT)
					System.out.println(s);
					
		}
		public static void nhapCung(ListSach ds)
		{
			GregorianCalendar ngay1= new GregorianCalendar(2017,3,12);
			GregorianCalendar ngay2= new GregorianCalendar(2013,4,2);
			GregorianCalendar ngay3= new GregorianCalendar(2016,7,15);
			Sach s1 = new SGK(001, ngay1,50000,100,"Kim Đồng",1);
			ds.themSach(s1);
			Sach s2= new SGK(002,ngay2,100000,79,"Giáo Dục",2);
			ds.themSach(s2);
			Sach s3 = new SachT(003,ngay3, 65000,130,"Tuổi Trẻ",0.5);
			ds.themSach(s3);
			Sach s4 = new SachT(004,ngay3, 35000,50,"Thiếu Nhi",0.5);
			ds.themSach(s4);
			
		}
		public static void meNu()
		{
			System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SÁCH");
			System.out.println("1.Thêm Sách");
			System.out.println("2.Xuất Danh Sách");
			System.out.println("3.Trung Bình Cộng Của Các Sách Tham Khảo");
			System.out.println("4.");
			System.out.println("0.Thoát Chương Trình");
			System.out.println("Mời Chọn");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maSach;
		GregorianCalendar ngayNhap;
		 double donGia;
		int soLuong;
		String nXB;
		double ThanhTien;
		
		ListSach ds = new ListSach();
		Sach s = new Sach();
		Scanner input= new Scanner(System.in);
		int choise =-1;
		meNu();
		choise = input.nextInt();
		if(choise ==0)
			System.out.println("Xin Cảm Ơn");
		while(choise !=0)
		{
			switch(choise)
			{
			case 1:
				nhapCung(ds);
				break;
			case 2:
				xuat(ds.getAll());
				break;
			case 3:
				System.out.println("Trung Bình Cộng các sách tham khảo la"+ds.TBSach());
				break;
			}
			meNu();
			choise = input.nextInt();
			if(choise ==0)
				System.out.println("Xin Cảm Ơn");
		}
	}

}
