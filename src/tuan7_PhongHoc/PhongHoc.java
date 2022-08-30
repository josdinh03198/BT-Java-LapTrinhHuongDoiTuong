package tuan7_PhongHoc;

public abstract class PhongHoc {
	protected String maPH;
	protected String dayNha;
	protected double dienTich;
	protected int soBongDen;
	abstract boolean datChuan();
	public String getMaPH() {
		return maPH;
	}
	public void setMaPH(String maPH) {
		this.maPH = maPH;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) throws Exception
	{
		if(dayNha.length()>1)
			this.dayNha = dayNha;
		else 
			throw new Exception("tên phải >= 2 ký tự");
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) throws Exception
	{
		if(soBongDen>0)
			this.soBongDen = soBongDen;
		else
			throw new Exception("Số lượng bóng phải >0");
	}
	public PhongHoc(String maPH, String dayNha, double dienTich, int soBongDen) {
		this.maPH = maPH;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	public PhongHoc() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public boolean duAnhSang()
	{
		if(getDienTich()/getSoBongDen()>=10)
			return true;
		else return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="";
		String temp="";
		if(datChuan())
			temp="Đạt Chuẩn";
		else temp="Không Đạt Chuẩn";
		s+= String.format("%-20s%-20s%-20.1f%-20d%-20s",getMaPH(),getDayNha(),getDienTich()
				,getSoBongDen(),temp);
		return s;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPH == null) ? 0 : maPH.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		if (maPH == null) {
			if (other.maPH != null)
				return false;
		} else if (!maPH.equals(other.maPH))
			return false;
		return true;
	}

}
