package tuan7_PhongHoc;

public class PLyThuyet extends PhongHoc {
	private boolean mayChieu;

	public boolean isMayChieu() {
		return mayChieu;
	}
	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}
	
	public PLyThuyet(String maPH, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPH, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}
	public PLyThuyet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PLyThuyet(String maPH, String dayNha, double dienTich, int soBongDen) {
		super(maPH, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	@Override
	boolean datChuan() {
		// TODO Auto-generated method stub
		if(isMayChieu()&&duAnhSang())
			return true;
		else 
			return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="";
		String mayChieu="";
		if(isMayChieu())
			mayChieu="Có";
		else 
			mayChieu="Không";
		s+=String.format("%-20s",mayChieu);
		return super.toString()+s;
	}
}
