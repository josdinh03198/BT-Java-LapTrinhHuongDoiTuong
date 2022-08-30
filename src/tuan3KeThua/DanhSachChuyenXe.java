package tuan3KeThua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

	public class DanhSachChuyenXe {
		ArrayList<ChuyenXe> dsCx;
		public DanhSachChuyenXe()
		{
			dsCx = new ArrayList();
		}
		public boolean themCX(ChuyenXe cx)
		{
			if(dsCx.contains(cx))// nó hiểu đc trùng mã là gì ở class ChuyenXe đã viết hàm hashCode & equals
			{
				return false;
			}
			else 
				dsCx.add(cx);
			return true;// thêm được
		}	
		public double tongDThuNoiThanh()
		{
			double s =0;
			for (ChuyenXe Cx : dsCx ) // lập từng phần tử x trong tập A
			{
				if(Cx instanceof ChuyenXeNoiThanh)// so sánh thuộc kiểu đối tượng nào
					s+= Cx.doanhThu;
			}
			return s;
		}
		public double tongDThuNgoaiThanh()
		{
			double s =0;
			for (ChuyenXe Cx : dsCx ) // lập từng phần tử x trong tập A
			{
				if(Cx instanceof ChuyenXeNgoaiThanh)// so sánh thuộc kiểu đối tượng nào
					s+= Cx.doanhThu;
			}
			return s;
		}
	
		public ChuyenXe timXe(String ma)
		{
			for(ChuyenXe Cx: dsCx)//FOR EACH
			{
				if(Cx.getMaXe().equalsIgnoreCase(ma))
					return Cx;
			}
			return null;
		}
		public int TimBaDao(String hoTenTX)
		{
			int vitri = dsCx.indexOf(hoTenTX);
			return vitri;
		}
		public void xoa(ChuyenXe cx)
		{
			dsCx.remove(cx);
		}
		public void Sua(ChuyenXe cx)
		{
			int vitri=dsCx.indexOf(cx);
			if(vitri>=0)
				dsCx.set(vitri,cx);
		}
		public ArrayList getAllCX()
	{
		return dsCx;
	}
	public void SapXepSoNguyen()
	{
		Collections.sort(dsCx, new Comparator<ChuyenXe>() {
			@Override
			public int compare(ChuyenXe xe1, ChuyenXe xe2) {
				// TODO Auto-generated method stub
				Double tmp1 = (Double) xe1.getDoanhThu();
				Double tmp2 = (Double) xe2.getDoanhThu();
				return tmp1.compareTo(tmp2);
			}
		});
	}
	public void SapXep_Tenvs_DT()
	{
		Collections.sort(dsCx, new Comparator<ChuyenXe>() {
			@Override
			public int compare(ChuyenXe xe1, ChuyenXe xe2) {
				// TODO Auto-generated method stub
				int temp1= xe1.getHoTenTX().compareToIgnoreCase(xe2.getHoTenTX());
				if(temp1==0)//giống nhau
				{
					if(xe1.getDoanhThu()==xe2.getDoanhThu())
						return 0;
					if(xe1.getDoanhThu()>xe2.getDoanhThu())
					return 1;
					else return -1;
				}
				else return temp1;
			}
		});
	}
}
