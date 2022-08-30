package tuan7_PhongHoc;

public class PMayTinh extends PhongHoc {
	private int soMayTinh;
	

	public int getSoMayTinh() {
		return soMayTinh;
	}


	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}
	

	public PMayTinh(String maPH, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPH, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}


	public PMayTinh() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PMayTinh(String maPH, String dayNha, double dienTich, int soBongDen) {
		super(maPH, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}


	@Override
	boolean datChuan() {
		// TODO Auto-generated method stub
		if(getDienTich()/getSoMayTinh()>=1.5&&duAnhSang())
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="";
		s+= String.format("%-20d",getSoMayTinh());
		return super.toString()+s;
	}
}
