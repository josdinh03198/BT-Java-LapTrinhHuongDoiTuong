package javaTuan1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLyXe {
	static final float T1=0.01f,T2=0.03f,T3=0.05f;
	
	public static String tieuDe()
	{
		String s="";
		s+= String.format("%20s%20s%15s%20s%20s","Ten Chu Xe","Ten Xe","Dung Tich","Gia Tri","Thue");
		return s;
	}
	static String nhapTen(String a)
	{
		String x;
		Scanner scn = new Scanner(System.in);
		System.out.println(a);
		x=scn.nextLine();
		return x;
		
	}
	static int nhapSo(String a)
	{
		int x;
		Scanner scn= new Scanner(System.in);
		System.out.println(a);
		x=scn.nextInt();
		return x;
	}
	public static Xe nhap() {
		String tenChu="";
		String loaiXe="";
		 int gt,dungTich;
		Scanner sc = new Scanner(System.in);
		Xe acc = new Xe();
		boolean flag = false;
		try
		{
			System.out.println("Nhập tên chủ xe: ");
			tenChu = sc.nextLine();
			System.out.println("Nhập tên xe:");
			loaiXe= sc.nextLine();
			System.out.println("Nhập dung tich:");
			dungTich= sc.nextInt();
			System.out.println("Nhập gia tri:");
			gt= sc.nextInt();
			
			acc.setTenChu(tenChu);
			acc.setLoaiXe(loaiXe);
			acc.setDungTich(dungTich);
			acc.setGt(gt);
			flag = true;
		}
		catch (InputMismatchException e1) {
			System.out.println("Lỗi nhập liệu");
		}
		catch (Exception e) {
			System.out.println("Bị lỗi: " + e.getMessage());
		}
		finally {
			return (flag) ? acc : null;
		}
		
	}
	
	public static void main(String[] args) {
		String tenChu,loaiXe;
		int gt,dungTich;
		int choice=0;
		Xe x1 = null;
		Xe x2 = null;
		Xe x3 = null;
		Scanner scn = new Scanner(System.in);
		do{
			Scanner x= new Scanner(System.in);
			System.out.print("\t\t THÔNG TIN XE\n");
			System.out.println("Hãy nhâp yêu cầu:");
			System.out.println("1.Nhập thông tin xe");
			System.out.println("2.Xuất thông tin xe");
			System.out.println("3.Thoát Chương trình");
			System.out.println("Hãy nhập giá trị:");
			choice = x.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					x1 = null;	
					while (x1 == null) {
						x1 = nhap();
					}
					x2 = new Xe("Nguyen luong Dat", "Sirius", 110,21000000);
					x3 = new Xe("Truong Thanh Cong", "Exciter", 150, 40000000);
					break;
				}
				case 2:
				{
					System.out.println(tieuDe());
					System.out.println(x1.toString());
					System.out.println(x2.toString());
					System.out.println(x3.toString());
					break;
				}
				default:
					System.out.println("Xin cam on");
			}
			
		}
		while(choice==1|| choice ==2);
	}

}
