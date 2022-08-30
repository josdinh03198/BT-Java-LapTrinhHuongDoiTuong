package tuan3KeThua;

public class ChuyenXeNoiThanh extends ChuyenXe
{
	private int soKM;
	private String soTuyen;

	public String getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKM() {
		return soKM;
	}

	public void setSoKM(int soKM) {
		this.soKM = soKM;
	}

	public ChuyenXeNoiThanh(String maXe, String hoTenTX, String soXe, double doanhThu, String soTuyen, int soKM) {
		super(maXe, hoTenTX, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}

	public ChuyenXeNoiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChuyenXeNoiThanh(String maXe, String hoTenTX, String soXe, double doanhThu) {
		super(maXe, hoTenTX, soXe, doanhThu);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String s="";
		s+=String.format("%8d%-30s", getSoKM(), getSoTuyen());
		// TODO Auto-generated method stub
		return super.toString()+s;
	}
}
