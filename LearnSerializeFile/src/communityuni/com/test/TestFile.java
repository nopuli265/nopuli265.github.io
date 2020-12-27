package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.io.SerializeFilefactory;
import communityuni.com.model.KhachHang;

public class TestFile {

	public static void main(String[] args) {
/*ArrayList<KhachHang>dsKH= new ArrayList<KhachHang>();
dsKH.add(new KhachHang(1, "linh"));
dsKH.add(new KhachHang(2 , "thao"));
dsKH.add(new KhachHang(3, "uyen"));
dsKH.add(new KhachHang(4, "van "));
dsKH.add(new KhachHang(5, "tien"));
boolean kq= SerializeFilefactory.luuFile(dsKH, "E:/data_kh.dat");
if (kq==true)
	System.out.println("luu file thanh cong ");
else
	System.out.println("luu that bai");*/
		Object data= SerializeFilefactory.docFile("E:/data_kh.dat");
		ArrayList<KhachHang>dsKh=(ArrayList<KhachHang>)data;
		for(KhachHang kh:dsKh)
			System.out.println(kh.getMa()+ " - "+kh.getTen());
	}

}
