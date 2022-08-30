package tuan3KeThua;

public class ChuyenXe implements Comparable<ChuyenXe> {

	protected String maXe,hoTenTX,soXe;
	protected double doanhThu;
	public String getMaXe() {
		return maXe;
	}
	public void setMaXe(String maXe) {
		this.maXe = maXe;
	}
	public String getHoTenTX() {
		return hoTenTX;
	}
	public void setHoTenTX(String hoTenTX) {
		this.hoTenTX = hoTenTX;
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	public ChuyenXe(String maXe, String hoTenTX, String soXe, double doanhThu) {
		super();
		this.maXe = maXe;
		this.hoTenTX = hoTenTX;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	public ChuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str="";
		str+= String.format("%8s%30s%8s%12.2f",getMaXe(),getHoTenTX(),getSoXe(),getDoanhThu());
		return str;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maXe == null) ? 0 : maXe.hashCode());
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
		ChuyenXe other = (ChuyenXe) obj;
		if (maXe == null) {
			if (other.maXe != null)
				return false;
		} else if (!maXe.equals(other.maXe))
			return false;
		return true;
	}
	@Override
	public int compareTo(ChuyenXe cx) {
		int n;
		if(this.getDoanhThu()==cx.getDoanhThu())
			n=0;
		if(this.getDoanhThu()==cx.getDoanhThu())
			n=1;
		else 
			n=0;
		if(n==0)
			return this.getHoTenTX().compareToIgnoreCase(cx.hoTenTX);
		return 0;
	}
	
}