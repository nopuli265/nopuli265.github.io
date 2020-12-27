package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<SinhVien> dsSV= new ArrayList<SinhVien>();
dsSV.add(new SinhVien(1, "linh", 10));
dsSV.add(new SinhVien(2, "thao", 7));
dsSV.add(new SinhVien(3, "dai", 3));
dsSV.add(new SinhVien(4, "huyen", 6));
System.out.println("danh sach sinh vien");
for (SinhVien sv: dsSV)
	System.out.println(sv);
	}

}
