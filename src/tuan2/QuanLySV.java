package tuan2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLySV {
	
	public static String tieuDe()
	{
		String s="";
		s+= String.format("%15s%30s%20s%15s","Ma Sinh Vien","Ho va Ten","Dia Chi","So Dien Thoai");
		return s;
	}
	public static SinhVien nhap()
	{
		int mSV;
		String hoTen;
		String diaChi;
		int sDT;
		Scanner input = new Scanner(System.in);
		SinhVien sv = new SinhVien();
		try
		{
			System.out.println("Ma Sinh Vien");
			mSV= input.nextInt();
			
			System.out.println("Tên Sinh Vien ");
			input.nextLine();// them vao cho so qua chu
			hoTen= input.nextLine();
			System.out.println("Dia Chi");
			diaChi= input.nextLine();
			System.out.println("So Dien Thoai");
			sDT= input.nextInt();
			sv.setmSV(mSV);
			sv.setHoTen(hoTen);
			sv.setDiaChi(diaChi);
			sv.setsDT(sDT);
		}catch (InputMismatchException e1) {
			System.out.println("Lỗi nhập liệu");
		}
		catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Vượt kích thước mảng");
		}
		catch (Exception e) {
			System.out.println("Bị lỗi: " + e.getMessage());
		}
		
		finally {
			return sv;
		}			
	}
	public static void xuat(SinhVien [] ds, int spt)
	{
		for(int i=0;i<spt;i++)
		{
			System.out.println(ds[i]);
		}
	}
	public static void main(String[] args) {
		SinhVien sv= new SinhVien();
		DanhSachSV ds= new DanhSachSV(10);
		sv=null;
		while(sv == null)
		{
			sv= nhap();
		}
		ds.themSV(sv);
		System.out.println(tieuDe());
		xuat(ds.getAll(),ds.count);
		// TODO Auto-generated method stub

	}

}
