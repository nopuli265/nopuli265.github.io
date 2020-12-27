package communityini.com.test;

import communityini.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NhanVien v1= new NhanVien(1," ngo linh");
NhanVien v2= new NhanVien(2, "tran tien");
v1=v2;
v2.setTen("phuong linh");
System.out.println("ten cua nhan vien 1 "+ v1.getTen());// do cơ chế alias nên nhân viên 1 cung có tên là phương linh du ta chỉ thay thế tên của nhân viên 2
v1.setTen("nguyen van");
System.out.println("ten cua nhan vien 2 la "+ v2.getTen());
NhanVien v3= new NhanVien(3, " quang tien");
NhanVien v4= new NhanVien(4, "ong hung");
v3=v4.copy();
System.out.println("ten nhan vien 3" +v3.getTen());
v4.setTen("puli");
System.out.println("ten nhan vien 3 la"+ v3.getTen());
v3.setTen("mai thuy");
System.out.println("nhan vien 4 cos ten la:"+ v4.getTen());
	}

}
