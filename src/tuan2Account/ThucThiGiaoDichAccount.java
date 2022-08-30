package tuan2Account;

import java.io.ObjectInputStream.GetField;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThucThiGiaoDichAccount 
{
	
	public static String tieude() {
		String s = "";
		s += s.format("%3s%-25s%-30s", "Số tài khoản", "Tên tài khoản", "Số tiền trong tài khoản");
		return s;
	}
	static double  nhapTienNap()
	{
		double	addMoney=0; 
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Số tiền muốn nạp: ");
			addMoney = input.nextDouble();
		} while (addMoney < 0);
		return addMoney;
	}
	static double  nhapTienRut()
	{
		double	addMoney=0; 
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Số tiền muốn rút: ");
			addMoney = input.nextDouble();
		} while (addMoney < 0);
		return addMoney;
	}
	static double  nhapTienChuyen()
	{
		double	addMoney=0; 
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Số tiền muốn chuyển: ");
			addMoney = input.nextDouble();
		} while (addMoney < 0);
		return addMoney;
	}
	public static ThongTinAccount nhapThongTin() 
	{
		long sTK;
		String tTK;
		double mTK;

		Scanner input = new Scanner(System.in);
		ThongTinAccount acc= new ThongTinAccount();
		try
		{
			System.out.println("Số tài khoản: ");
			sTK = input.nextLong();
			System.out.println("Tên tài khoản: ");
			input.nextLine();// them vao cho so qua chu
			tTK = input.nextLine();
			System.out.println("Số tiền trong tài khoản: ");
			mTK = input.nextDouble();
			acc.setmTK(mTK);
			acc.setsTK(sTK);
			acc.settTK(tTK);
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
			return acc;
		}			
		
	}
	static  void xuatDanhSach( ThongTinAccount [] ds , int sptThat)
	{
		for (int i = 0; i < sptThat; i++) 
		{
		   System.out.println(ds[i]);	
		}
	}
	static void Menu()
	{
		System.out.println("CHUONG TRINH QUAN LY NGAN HANG");
		System.out.println("1. Xuất Danh Sách");
		System.out.println("2. Nạp tiền");
		System.out.println("3. Rút tiền");
		System.out.println("4. Chuyển tiền");
		System.out.println("5. Sửa thông tin tài khoản");
		System.out.println("6. Xóa tài khoản");
		System.out.println("7. Tổng số tiền");
		System.out.println("8. Danh sách sau sắp xếp");
		System.out.println("9. Tìm Tài Khoản ");
		System.out.println("0. Thoát chương trình");
		System.out.println("Lựa chọn của bạn:");
	}
	public static void nhapCung(DanhSachCacAcc dsAcc)
	{
		ThongTinAccount acc = new ThongTinAccount();
		
		acc= new ThongTinAccount(101, "\t Nguyễn Văn Hùng", 30000000);
		dsAcc.ThemAcc(acc);
		acc= new ThongTinAccount(102, "\t Lý Huy Vân", 15000000);
		dsAcc.ThemAcc(acc);
		acc= new ThongTinAccount(103, "\t Phan Sang Vô", 25000000);
		dsAcc.ThemAcc(acc);
		acc= new ThongTinAccount(104, "\t Đoàn Văn Đức", 50000000);
		dsAcc.ThemAcc(acc);
		acc= new ThongTinAccount(105, "\t Trương Công", 400000); 
		dsAcc.ThemAcc(acc);
	}
	public static void main(String[] args) throws Exception {
		
		ThongTinAccount acc= new ThongTinAccount();
		DanhSachCacAcc dsAcc= new DanhSachCacAcc(10);
		Scanner input = new Scanner(System.in);
		int chon = -1;
		long soTaiKhoan;
		double soTienNap=0;
		double soTienRut=0;
		double soTienChuyen=0;
		double mTK;
		String tTK;
		ThongTinAccount accTim;
		Menu();
		chon = input.nextInt();
		if(chon==0)
		{
			System.out.println("Xin Cam on!!!");
		}
		while (chon!=0) 
		{
			switch(chon)
			{
			case 1:
				nhapCung(dsAcc);
				xuatDanhSach(dsAcc.getAllACC(), dsAcc.count);
				break;
			case 2:
				System.out.println("Nhập số tài khoản cần nạp:");
				soTaiKhoan = input.nextLong();
				accTim = dsAcc.timAcc(soTaiKhoan);
				if( accTim!=null)//tim thay
				{
					soTienNap= nhapTienNap();
					accTim.napTien(soTienNap);
				}
				else
					System.out.println("Tài khoản không tồn tại");
				break;
			case 3:
				System.out.println("Nhập tài khoản cần rút:");
				soTaiKhoan = input.nextLong();
				accTim = dsAcc.timAcc(soTaiKhoan);
				if( accTim!=null)//tim thay
				{
					soTienRut= nhapTienRut();
					accTim.rutTien(soTienRut);
				}
				else
					System.out.println("Tài khoản không tồn tại");
				break;
			case 4 :
				System.out.println("Nhập tài khoản cần chuyển:");
				soTaiKhoan = input.nextLong();
				accTim= dsAcc.timAcc(soTaiKhoan);
				if( accTim!=null)//tim thay
				{
					soTienChuyen= nhapTienChuyen();
					accTim.chuyenTien(accTim, soTienChuyen);
				}		
				else
					System.out.println("Tài khoản không tồn tại");
				break;
			case 5 :

				System.out.println("Nhập tài khoản muốn chỉnh sửa:");
				soTaiKhoan = input.nextLong();
				accTim= dsAcc.timAcc(soTaiKhoan);
				if( accTim!=null)//tim thay
				{
					System.out.println("Thông tin tài khoản trước khi sửa:");
					System.out.println(accTim.toString());	
					System.out.println("Nhập thông tin mới");

					Scanner scn = new Scanner(System.in);
					System.out.println("Tên tài khoản:");
					tTK = scn.nextLine();

					System.out.println("Số tiền trong tài khoản:");
					mTK = scn.nextDouble();

					dsAcc.suaThongTin(accTim.sTK, tTK, mTK);
				}		
				else
					System.out.println("Tài khoản không tồn tại");

				break;
			case 6 :
				String choice="";
				System.out.println("Nhập số tài khoản muốn xóa:");
				soTaiKhoan = input.nextLong();
				accTim = dsAcc.timAcc(soTaiKhoan);
				Scanner scn = new Scanner(System.in);
				if( accTim!=null)//tim thay
				{
					System.out.println("Bạn  muốn xóa tài khoản này?");
					System.out.println("Nhấn y để xóa ");
					choice = scn.nextLine();
					if(choice.equals("y")==true)
					{
						dsAcc.XoaAcc(accTim);
						
					}
					else
						break;
				}
				else
					System.out.println("Tài khoản không tồn tại");
				break;
			case 7 : 
				System.out.println("Tổng số tiền các tài khoản:" + String.format("%f", dsAcc.tongTien()));
				break;
			case 8:
				Arrays.sort(dsAcc.getAllACC(),0,dsAcc.count);
				break;
			case 9:
				System.out.println("Nhập số tài khoản cần tìm");
				soTaiKhoan = input.nextLong();
				accTim = dsAcc.timAcc(soTaiKhoan);
				System.out.println("Tai Khoan can tim"+accTim);
			default:
				System.out.println("Lua chon sai");
				break;
			}
			Menu();
			chon = input.nextInt();
			if(chon==0)
			{
				System.out.println("Xin cam on!!!");
				break;
			}		
		}
	}
}
