package tuan3KeThua;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgay;
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	public ChuyenXeNgoaiThanh(String maXe, String hoTenTX, String soXe, double doanhThu, String noiDen, int soNgay) {
		super(maXe, hoTenTX, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}
	public ChuyenXeNgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChuyenXeNgoaiThanh(String maXe, String hoTenTX, String soXe, double doanhThu) {
		super(maXe, hoTenTX, soXe, doanhThu);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String s="";
		s= String.format("%30s%8d",getNoiDen(),getSoNgay());
		// TODO Auto-generated method stub
		return super.toString()+s;
	}
}
