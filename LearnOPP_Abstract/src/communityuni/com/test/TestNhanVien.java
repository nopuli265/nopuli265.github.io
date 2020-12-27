package communityuni.com.test;

import communityuni.com.model.NhanVienChinhThuc;
import communityuni.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NhanVienChinhThuc linh= new NhanVienChinhThuc(1,"ngo thi phuong linh");
linh.tinhLuong();
NhanVienThoiVu thao = new NhanVienThoiVu(2, "ngo thi phuowng thao");
thao.tinhLuong();
	}

}
