package javaTuan1;

import java.util.Scanner;

public class XuLyHCN {
	public static String tieuDe()
	{
		String str="";
		str+= String.format("%15s%15s%15s%15s","Chieu Dai","Chieu Rong","Chu Vi","Dien Tich" );
		return str;
	}
	static int nhapSoNguyen(String k)
	{
		int a=0;
		Scanner scn =new Scanner(System.in);
		System.out.println(k);
		a=scn.nextInt();
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,r;
		d=nhapSoNguyen("Bạn nhâp chiều dài");
		r=nhapSoNguyen("Bạn nhập chiều rộng");
		HCN cn1= new HCN();
		cn1.setChieuDai(d);
		cn1.setChieuRong(r);
		System.out.println(tieuDe());
		System.out.println(cn1);
	}

}
