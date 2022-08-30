package tuan7_PhongHoc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListPH implements ChucNangPhongHoc{
	ArrayList<PhongHoc> dsPh;
	public ListPH() {
		dsPh = new ArrayList<>();
	}
	
	@Override
	public boolean themPh(PhongHoc ph) {
		// TODO Auto-generated method stub
		if(dsPh.contains(ph))
			return false;
		else 
		{
			dsPh.add(ph);
			return true;
		}
	}
	public ArrayList getAll()
	{
		return dsPh;
	}
	@Override
	public PhongHoc timPhong(String ma) {
		// TODO Auto-generated method stub
		for (PhongHoc ph : dsPh)
		{
			if(ph.getMaPH().equalsIgnoreCase(ma))
				return ph;
		}
		return null;
	}

	@Override
	public int TongPH() {
		// TODO Auto-generated method stub
		return dsPh.size();
	}

	@Override
	public void SXDayNha() {
		// TODO Auto-generated method stub
		Collections.sort(dsPh, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc ph1, PhongHoc ph2) {
				// TODO Auto-generated method stub
				int temp= ph1.getDayNha().compareToIgnoreCase(ph2.getDayNha());
				return temp;
			}
		});
		
	}

	@Override
	public void SXDienTich() {
		// TODO Auto-generated method stub
		Collections.sort(dsPh, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc ph1, PhongHoc ph2) {
				// TODO Auto-generated method stub
				Double dt1 = ph1.getDienTich();
				Double dt2 = ph2.getDienTich(); 
				return dt1.compareTo(dt2); 
						
			}
		});
	}

	@Override
	public void SXBongDen() {
		// TODO Auto-generated method stub
		Collections.sort(dsPh,new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc ph1, PhongHoc ph2) {
				// TODO Auto-generated method stub
				Integer temp1= (Integer) ph1.getSoBongDen();
				Integer temp2= (Integer) ph2.getSoBongDen();
				return temp1.compareTo(temp2);
			}
		});
		
	}

	@Override
	public void Xoa(PhongHoc ph) {
		// TODO Auto-generated method stub
		dsPh.remove(ph);
		
	}

	@Override
	public void Sua(PhongHoc ph) {
		// TODO Auto-generated method stub
		int vitri= dsPh.indexOf(ph);
		if(vitri>=0)
			dsPh.set(vitri, ph);
		
	}
}
