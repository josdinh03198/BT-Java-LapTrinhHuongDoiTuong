package javaTuan1;

import java.util.Scanner;

public class QuanLySinhVien {

	static String tieuDe()
	{
		String str="";
		str+= String.format("%15s%20s%15s%15s%15s","Ma SV","Ho va Ten","Diem LT","Diem TH","Diem TB");
		return str;
	}
	static int nhapMa(String a)
	{
		int x;
		Scanner scn = new Scanner(System.in);
		System.out.println(a);
		x=scn.nextInt();
		return x;
	}
	static String nhapTen(String a)
	{
		String x;
		Scanner scn= new Scanner(System.in);
		System.out.println(a);
		x= scn.nextLine();
		
		return x;
	}
	static float nhapDiem(String a)
	{
		float x;
		Scanner scn= new Scanner(System.in);
		System.out.println(a);
		x= scn.nextFloat();
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maSV;
		String hoTen;
		float a,b;
		maSV= nhapMa("Bạn hãy nhâp mã SV");
		hoTen= nhapTen("Bạn hãy nhâp họ tên");
		a= nhapDiem("Bạn nhập vào điểm lý thuyết");
		b= nhapDiem("Bạn nhập vào điểm thực hành");
		SinhVien sv1= new SinhVien();
		sv1.setMaSV(maSV);
		sv1.setHoTen(hoTen);
		sv1.setLT(a);
		sv1.setTH(b);
		
		System.out.println(tieuDe());
		System.out.println(sv1);
		
		
	}

}
