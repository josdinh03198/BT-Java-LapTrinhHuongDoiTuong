package tuan2;

public class DanhSachSV {
	private static final SinhVien NULL = null;
	public int count;
	SinhVien sv[];
	public DanhSachSV(int spt)
	{
		sv= new SinhVien[spt];
	}
	public boolean themSV(SinhVien acc)
	{
		if(timSV(acc.getmSV())!=NULL)
			return false;
		if(count==sv.length)
			MangTangKichThuoc();
		sv[count]=acc;
		count ++;
		return true;
	}
	private void MangTangKichThuoc()
	{
		SinhVien [] temp= new SinhVien[(int)(sv.length*2)];
		for(int i=0;i<sv.length;i++)
		{
			temp[i]=sv[i];
			sv=temp;
		}
	}
	public SinhVien timSV(int mSV)
	{
		for(int i=0;i<count;i++)
		{
			if(sv[i].getmSV()==mSV)
				return sv[i];
		}
		return NULL;
	}
	public SinhVien [] getAll()
	{
		return sv;
	}
}
