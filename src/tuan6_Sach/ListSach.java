package tuan6_Sach;

import java.util.ArrayList;

public class ListSach {
	ArrayList<Sach> ds;
	public ListSach()
	{
		ds= new ArrayList<>();
	}
	public ArrayList<Sach> getAll()
	{
		return ds;
	}
	public boolean themSach(Sach s)
	{
		if(ds.contains(s))
			return false;
		else
		{
			ds.add(s);
			return true;
		}
	}
	public double TBSach()
	{
		double sum=0;
		double dem=0;
		double tb;
		for(Sach s: ds)
		{
			if(s instanceof SachT)
			{
				sum+=s.donGia;
				dem++;	
			}
			
		}
		return tb=sum/dem;
	}
}
