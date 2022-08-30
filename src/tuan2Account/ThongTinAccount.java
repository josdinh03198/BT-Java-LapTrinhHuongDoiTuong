package tuan2Account;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ThongTinAccount implements Comparable<ThongTinAccount> {
	public long sTK;
	public String tTK;
	public double mTK;
	// double addMoney, withdrawMoney, tienchuyen; methoad
	static final double LAISUAT = 0.035;
	static final double PHIRUT = 100;

	public long getsTK() {
		return sTK;
	}

	public void setsTK(long sTK) {
		this.sTK = sTK;
	}

	public String gettTK() {
		return tTK;
	}

	public void settTK(String tTK) 	throws Exception{
		if(tTK.length()>1)
				this.tTK=tTK;
		else throw new Exception("A");
	}

	public double getmTK() {
		return mTK;
	}

	public void setmTK(double mTK) {
		this.mTK = mTK;
	}

	public ThongTinAccount(long sTK, String tTK, double mTK) {
		super();
		this.sTK = sTK;
		this.tTK = tTK;
		this.mTK = mTK;
	}

	public ThongTinAccount()
	{
		super();
	}
	public ThongTinAccount(long sTK, String tTK) {
		super();
		this.sTK = sTK;
		this.tTK = tTK;
		mTK = 50000;
	}

	public void napTien( double tienNap) {
		
		double tienCon= this.getmTK();
		tienCon+=tienNap;
		this.setmTK(tienCon);
	}
	public void rutTien(double tienRut) {
		double tienCon=this.getmTK();
		if(tienRut>0 && tienCon>=tienRut+PHIRUT+50000)
		{
			tienCon -=(tienRut+PHIRUT);
			this.setmTK(tienCon);
		}
		}
		       
	
	public void chuyenTien(ThongTinAccount accNhan, double tienchuyen)
	{
	    this.rutTien(tienchuyen);
	    accNhan.napTien(tienchuyen);
	}
	public void daoHan()
	{
		double tienCon= this.getmTK();
		double tienLoi= tienCon*LAISUAT;
		this.setmTK(tienCon+tienLoi);	
	}
	
	@Override
	public String toString() {
		String str = "";
		DecimalFormat df = new DecimalFormat("###,000");
		str += str.format("%10d%10s%20s", getsTK(), gettTK(), df.format(getmTK()));
		return str;
	}

	@Override
	public int compareTo(ThongTinAccount acc) {
		// TODO Auto-generated method stub
		int n=this.gettTK().compareToIgnoreCase(acc.gettTK());
		if(n==0)
		{
			if(this.getmTK()>acc.getmTK())
			return 1;
			else  if(this.getmTK()==acc.getmTK())
			return 0;
			else return -1;
			
		}
		return n;
	}

}
