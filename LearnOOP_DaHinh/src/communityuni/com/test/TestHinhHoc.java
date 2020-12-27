package communityuni.com.test;

import communityuni.com.model.HinhChuNhat;
import communityuni.com.model.HinhHoc;
import communityuni.com.model.HinhVuong;

public class TestHinhHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HinhHoc h;
h= new HinhChuNhat(4, 5);
System.out.println(" chu vi = "+h.tinhChuVi());
System.out.println("dien tich = "+h.tinhDienTich());
h= new HinhVuong(3);
System.out.println("chu vi= "+h.tinhChuVi());
System.out.println("dien tich= "+ h.tinhDienTich());
	}

}
