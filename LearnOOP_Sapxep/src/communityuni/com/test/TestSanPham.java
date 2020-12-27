package communityuni.com.test;

import java.util.ArrayList;
import java.util.Collections;

import communityuni.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<SanPham>dsSP = new ArrayList<SanPham>();
dsSP.add(new SanPham(1,"coca", 25));
dsSP.add(new SanPham(2, "pepsi", 12));
dsSP.add(new SanPham(3, "redbull", 45));
System.out.println("danh sach san pham la");
for (SanPham sp:dsSP)
	System.out.println(sp);
	Collections.sort(dsSP);

	 System.out.println("danh sach sau khi sap xep la:");
for (SanPham sp: dsSP)
	System.out.println(sp);
	}
}
