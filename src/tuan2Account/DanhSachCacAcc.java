package tuan2Account;


public class DanhSachCacAcc
{
// khai bao mang
// xu ly them, xoa , sua, tim kiem, tang kthuc khi mang day
	public 	int count;
	ThongTinAccount	 dsAcc[];
	
	public DanhSachCacAcc(int spt) 
	{
		dsAcc= new ThongTinAccount[spt];
		// TODO Auto-generated constructor stub
	}
	public boolean ThemAcc( ThongTinAccount acc)
	{
		if(timAcc(acc.getsTK())!=null)//tim thay nghia la trung ma
				return false;
		
		if(count==dsAcc.length)
			MangTangKichThuoc();
		dsAcc[count]=acc;
		count++;
		return true;
	}
	public int timViTriAcc(long soTk)
	{
		int i;
		for(i=0;i<count;i++)
		{
			if(dsAcc[i].getsTK()==soTk)
				break;
		}
		return i;
	}
	public void XoaAcc(ThongTinAccount acc)
	{
		int vitri = timViTriAcc(acc.getsTK());
		for(int i=vitri; i<dsAcc.length-1; i++)
		{
			dsAcc[i] = dsAcc[i+1];
		}
		count--;
		
	}
	private void MangTangKichThuoc()
	{
		ThongTinAccount [] temp=new ThongTinAccount [(int)(dsAcc.length*2)];
		for(int i=0;i<dsAcc.length;i++)
			temp[i]=dsAcc[i];
		dsAcc=temp;
	}
	public ThongTinAccount timAcc(long soTK)
	{
		for(int i=0;i<count;i++)
		{
			if(dsAcc[i].getsTK()==soTK)
				return dsAcc[i];
		}
		return null;
	}
	
	
	public ThongTinAccount	 [] getAllACC()
	{
	    return dsAcc;	
	}
	
	public double tongTien()
	{
		double sum = 0;
		for(int i=0; i<count; i++)
		{
			sum += dsAcc[i].getmTK();
		}
		return sum;
	}
	public void suaAcc(ThongTinAccount acc)
	{
		for(int i=0;i<count;i++)
		{
			if(dsAcc[i].getsTK()==acc.getsTK())
			{
				dsAcc[i]=acc;
				break;
		}
	}
	}
	public boolean suaThongTin(long sTK, String tTK, double mTK) throws Exception {
		int index = timViTriAcc(sTK);
		dsAcc[index].settTK(tTK);;
		dsAcc[index].setmTK(mTK);
		return true;
	}
}
	
	
