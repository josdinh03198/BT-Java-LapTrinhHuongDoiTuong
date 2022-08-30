package javaTuan1;

public class HCN {
	private int chieuDai;
	private int chieuRong;
	
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public HCN(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public HCN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int chuVi()
	{
		int cv;
		cv=(this.getChieuDai()+getChieuRong())*2;
		return cv;
	}
	public int dienTich()
	{
		int dt;
		dt= this.getChieuDai()*getChieuRong();
		return dt;
	}
	@Override
	public String toString() {
		String str="";
		str+= String.format("%15d%15d%15d%15d",getChieuDai(),getChieuRong(),chuVi(),dienTich());
		return str;
	}
}
