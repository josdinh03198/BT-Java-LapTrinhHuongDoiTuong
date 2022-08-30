package tuan2NgayThang;

import tuan2NgayThang.HangThucPham;

public class DanhSachThucPham 
{
	private HangThucPham ds[];
	private int count = 0 ;
	public DanhSachThucPham(int spt) {
		ds= new HangThucPham[spt];
		// TODO Auto-generated constructor stub
	}
	public HangThucPham timHangTP(int maCD) {
		for (int i = 0; i < count; i++)
		{
			if (ds[i].getMaHang()==maCD)
				return ds[i];
		}
		return null;
	}
	//tang kich thuoc
		private void tangKichThuoc() {
			HangThucPham[] temp = new HangThucPham[(int) (ds.length * 2)];
			for (int i = 0; i < ds.length; i++)
			{
				temp[i] = ds[i];
			}
			ds = temp;
		}
		public boolean them(HangThucPham tp) {
			// kiá»ƒm tra trÃ¹ng mÃ£ sinh viÃªn:
			
			if(!(timHangTP(tp.getMaHang())==null))
				return  false;
			// kiá»ƒm tra tÄƒng kÃ­ch thÆ°á»›c máº£ng:
			else
			{
				if (count == ds.length)
					tangKichThuoc();
				ds[count] = tp;
				count++;
				return true;
			}
		}
		public void XuatDS()
		{
			for (int i = 0; i < count; i++)
				System.out.println(ds[i]);
		}
}
