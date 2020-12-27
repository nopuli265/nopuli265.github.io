package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien {

	@Override
	public void tinhLuong(int ngayCong) {
		// TODO Auto-generated method stub
		if (ngayCong< 20)
			System.out.println("luong 5 trieu");
		else
			System.out.println("luong 20 trieu");
	}

}
