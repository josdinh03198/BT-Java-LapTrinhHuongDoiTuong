package tuan7_PhongHoc;
import java.util.ArrayList;
import java.util.Scanner;
	public class QuanLyPhongHoc {
		public static String tieuDeLT()
		{
			String s="";
			s+=String.format("%-20s%-20s%-20s%-20s%-20s%-20s","Ma PH","Dãy nhà","Diện tích","Bóng đèn","Đạt chuẩn","Máy Chiếu");
			return s;
		}
		public static String tieuDeMT()
		{
			String s="";
			s+=String.format("%-20s%-20s%-20s%-20s%-20s%-20s","Ma PH","Dãy nhà","Diện tích","Bóng đèn","Đạt chuẩn","Số máy");
			return s;
		}
		public static String tieuDeTN()
		{
			String s="";
			s+=String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s","Ma PH","Dãy nhà","Diện tích","Bóng đèn","Đạt chuẩn","Chuyên Ngành","Sức Chứa","Bồn Rửa");
			return s;
		}
		public static void xuat(ArrayList<PhongHoc> dsPh)
		{
			System.out.println("Danh Sách Phòng Lý Thuyết");
			System.out.println(tieuDeLT());
			for (PhongHoc phongHoc : dsPh) {
				if(phongHoc instanceof PLyThuyet)
					System.out.println(phongHoc.toString());
			}
			System.out.println("Danh Sách Phòng Máy Tính");
			System.out.println(tieuDeMT());
			for (PhongHoc phongHoc : dsPh) {
				if(phongHoc instanceof PMayTinh)
					System.out.println(phongHoc.toString());
			}
			System.out.println("Danh Sách Phòng Thí Nghiệm");
			System.out.println(tieuDeTN());
			for (PhongHoc phongHoc : dsPh) {
				if(phongHoc instanceof PThiNghiem)
					System.out.println(phongHoc.toString());
			}
		}
		public static void menu()
		{
			System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHÒNG HỌC");
			System.out.println("1.Nhập phòng học");
			System.out.println("2.Xuất danh sách");
			System.out.println("3.Tìm phòng học");
			System.out.println("4.Xuất phòng đạt chuẩn");
			System.out.println("5.Danh sách sắp xếp theo dãy nhà");
			System.out.println("6.Danh sách sắp xếp theo diện tích");
			System.out.println("7.Danh sách sắp xếp theo số bóng đèn");
			System.out.println("8.Tổng số phòng học");
			System.out.println("9.Phòng máy có 60 máy");
			System.out.println("10.Sửa phòng máy");
			System.out.println("11.Xoá phòng học");
			System.out.println("0.Thoát chương trình");
			System.out.println("Mời bạn chọn");
		}
		public static void nhapCung(ListPH dsPh)
		{
		 PhongHoc ph1= new PLyThuyet("101","Nhà A",500,40,true);
		 dsPh.themPh(ph1);
		 PhongHoc ph2= new PLyThuyet("102","Nhà D",600,60,false);
		 dsPh.themPh(ph2);
		 PhongHoc ph3= new PLyThuyet("103","Nhà B",300,50,true);
		 dsPh.themPh(ph3);
		 
		 PhongHoc ph4= new PMayTinh("201","Nhà F",460,40,60);
		 dsPh.themPh(ph4);
		 PhongHoc ph5= new PMayTinh("202","Nhà V",500,70,60);
		 dsPh.themPh(ph5);
		 PhongHoc ph6= new PMayTinh("203","Nhà A",340,50,40);
		 dsPh.themPh(ph6);
		 
		 PhongHoc ph7 = new PThiNghiem("301","Nhà B",700.3,40,"Sinh Học",630,false);
		 dsPh.themPh(ph7);
		 PhongHoc ph8= new PThiNghiem("302","Nhà A",550.5,75,"Hóa Học",516,true);
		 dsPh.themPh(ph8);
		 PhongHoc ph9 = new PThiNghiem("303","Nhà D",620.2,46,"Dệt May",550,true);
		 dsPh.themPh(ph9);
		 
		 
		}
		public static void XuatDatChuan(ArrayList<PhongHoc> dsPh)
		{
			System.out.println("Danh Sách Phòng Lý Thuyết");
			System.out.println(tieuDeLT());
			for (PhongHoc phongHoc : dsPh) {
				if(phongHoc instanceof PLyThuyet&& phongHoc.datChuan())
					System.out.println(phongHoc.toString());
			}
			System.out.println("Danh Sách Phòng Máy Tính");
			System.out.println(tieuDeMT());
			for (PhongHoc phongHoc : dsPh) {
				if(phongHoc instanceof PMayTinh&& phongHoc.datChuan())
					System.out.println(phongHoc.toString());
			}
			System.out.println("Danh Sách Phòng Thí Nghiệm");
			System.out.println(tieuDeTN());
			for (PhongHoc phongHoc : dsPh) {
				if(phongHoc instanceof PThiNghiem&& phongHoc.datChuan())
					System.out.println(phongHoc.toString());
			}
		}
		public static void XuatMay(ArrayList<PhongHoc> dsPh)
		{
			System.out.println("Danh sách phòng máy có 60 máy");
			for (PhongHoc ph : dsPh) {
				if(ph instanceof PMayTinh && ((PMayTinh) ph).getSoMayTinh()==60)
					System.out.println(ph.toString());
			}
		}
		public static void Sua(ListPH dsPh)
		{
			
			PhongHoc Sua=null;
			Scanner input= new Scanner(System.in);
			String ma;
			int soMayTinh;
			int choise=-1;
			System.out.println("Nhập mã muốn sửa");
			ma=input.nextLine();
			Sua= dsPh.timPhong(ma);
			if(Sua!=null)
			{
				if(Sua instanceof PMayTinh)
				{
					System.out.println("Thông tin trước khi sửa");
					System.out.println(Sua.toString());
					System.out.println("Bạn có muốn sửa không(1:Yes/2:No)");
					choise= input.nextInt();
					if(choise==1)
					{
						System.out.println("Số máy tính");
						soMayTinh=input.nextInt();
						((PMayTinh) Sua).setSoMayTinh(soMayTinh);
					}
					else 
						System.out.println("Cảm ơn");
				}
			}
			else 
				System.out.println("Mã phòng không tồn tại");
			
		}
		public static void XoaPhong(ListPH dsPh)
		{
			PhongHoc pXoa=null;
			Scanner input = new Scanner(System.in);
			String ma;
			int choise =-1;
			System.out.println("Nhập mã muốn xóa");
			ma=input.nextLine();
			pXoa=dsPh.timPhong(ma);
			if(pXoa!=null)
			{
				System.out.println("Bạn có chắc chắn muốn xóa không(1:Yes/2:No)");
				choise=input.nextInt();
				if(choise==1)
				{
					dsPh.Xoa(pXoa);
					System.out.println("Xóa thành công");
				}
				else 
					System.out.println("Không xóa còn làm mất thời gian");
			}
			else 
				System.out.println("Mã phòng không tồn tại");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String maPH;
//			int soMayTinh;
//			String dayNha;
//			int soBongDen,dienTich;
//			boolean mayChieu;
//			boolean bonRua;
//			int sucChua;
//			String ChuyenNganh;
			int choise=-1;
			Scanner input= new Scanner(System.in);
			ListPH dsPh= new ListPH();
			menu();
			choise= input.nextInt();
			if(choise==0)
			{
				System.out.println("Xin Cảm Ơn!!!");
			}
			while(choise!=0)
			{
				switch(choise)
				{
				case 1:
					//PhongHoc ph=null;
					nhapCung(dsPh);
					System.out.println("Thêm OK");
					break;
				case 2: 
					xuat(dsPh.getAll());
					break;
				case 3:
				System.out.println("Nhập phòng học cần tìm");
				input.nextLine();
				maPH=input.nextLine();
				PhongHoc tim =dsPh.timPhong(maPH);
				System.out.println("Phòng học cần tìm");
				System.out.println("a"+tim);
				break;
				case 4:
					XuatDatChuan(dsPh.getAll());
					break;
				case 5:
					dsPh.SXDayNha();
					break;
				case 6:
					dsPh.SXDienTich();
					break;
				case 7:
					dsPh.SXBongDen();
					break;
				case 8: 
					System.out.println("Tổng số phòng học là:"+ dsPh.TongPH());
					break;
				case 9:
					XuatMay(dsPh.getAll());
					break;
				case 10:
					Sua(dsPh);
					break;
				case 11:
					XoaPhong(dsPh);
					break;
				default:
					System.out.println("Không có chức năng này");
					break;
				}
				menu();
				choise= input.nextInt();
				if(choise==0)
				{
					System.out.println("Xin Cảm Ơn!!!");
				}
			}
		}
}
