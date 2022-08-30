package javaTuan1;

import java.util.Scanner;

public class Xe {
	private String tenChu,loaiXe;
	private int gt,dungTich;
	private final float T1=0.01f,T2=0.03f,T3=0.05f;
	
	public String getTenChu() {
		return tenChu;
	}

	public void setTenChu(String tenChu) throws Exception {
		if(tenChu.length()>1) 
			this.tenChu = tenChu;
		else
			throw new Exception("Tên phải >1 ký tự");
			
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public int getGt() {
		return gt;
	}

	public void setGt(int gt) {
		this.gt = gt;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

//	public static float getT1() {
//		return T1;
//	}
//
//	public static float getT2() {
//		return T2;
//	}
//
//	public static float getT3() {
//		return T3;
//	}

	public Xe(String tenChu, String loaiXe, int gt, int dungTich) {
		super();
		this.tenChu = tenChu;
		this.loaiXe = loaiXe;
		this.gt = gt;
		this.dungTich = dungTich;
	}

	public Xe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float thue()
	{
		float thueNop=0;
		if(getDungTich()<100)
			thueNop=getGt()*T1;
		if(getDungTich()<200)
			thueNop=getGt()*T2;
		if(getDungTich()>200)
			thueNop=getGt()*T3;
		return thueNop;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str="";
		str= String.format("%20s%20s%15d%20d%20.2f",getTenChu(),getLoaiXe(),getDungTich(),getGt(),thue());
		return str;
	}
}

