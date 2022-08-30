package tuan6_GiaoDich;

import java.util.ArrayList;

public class ListGD {
	ArrayList<GiaoDich> dsGD;
	public ListGD()
	{
		dsGD = new ArrayList();
	}
	public ArrayList GetAll()
	{
		return dsGD;
	}
	public boolean themGD(GiaoDich GD)
	{
		if(dsGD.contains(GD))
			return false;
		else 
		{
			dsGD.add(GD);
			return true;
		}
	}
	public int TongSLGold()
	{
		int s=0;
		for(GiaoDich GD: dsGD)
		{
			if(GD instanceof Gold)
				s+= GD.soLuong;
		}
		return s;
	}
	public int TongSLMoney()
	{
		int s=0;
		for(GiaoDich GD: dsGD)
		{
			if(GD instanceof Money)
				s+= GD.soLuong;
		}
		return s;
	}	
	public double TBGD()
	{
		double tb=0;
		double sum=0;
		int dem=0;
		//System.out.println(dem);
		for(GiaoDich x: dsGD)
			if(x instanceof Money)
			{
				sum+= ((Money) x).ThanhTien();
				dem++;
			}
		return tb= sum/dem;
	}
	public ArrayList<GiaoDich> GiaoDich1Ty()
	{
		ArrayList<GiaoDich> temp= new ArrayList<GiaoDich>();
		for(GiaoDich x: dsGD)
			if(x.getDonGia() > 1000000000)
				temp.add(x);
		return temp;
	}
}
