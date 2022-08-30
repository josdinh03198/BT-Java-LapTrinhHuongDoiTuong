package tuan7_PhongHoc;

public class PThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private int sucChua;
	private boolean bonRua;

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isBonRua() {
		return bonRua;
	}

	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}

	public PThiNghiem(String maPH, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
			boolean bonRua) {
		super(maPH, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}

	public PThiNghiem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PThiNghiem(String maPH, String dayNha, double dienTich, int soBongDen) {
		super(maPH, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean datChuan() {
		// TODO Auto-generated method stub
		if(isBonRua()&&duAnhSang())
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String bonRua="";
		String s="";
		if(isBonRua())
			bonRua="Có";
		else 
			bonRua="Không";
		s+=String.format("%-20s%-20d%-20s",getChuyenNganh(),getSucChua(),bonRua);
		return super.toString()+s;
	}
}
