package communityuni.com.test;

import communityuni.com.model.NhanVien;

public class NhanVienChinhThuc extends NhanVien {
	
	
	public NhanVienChinhThuc() {
		super();
		
	}
public NhanVienChinhThuc(int ma, String ten)
{
	super (ma,ten);
}
	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		super.tinhLuong();
		System.out.println("day la nhan vien chinh thuc");
	}
}
