package communityuni.com.test;

import java.util.Scanner;

import communityuni.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NhanVien nv1,nv2;
System.out.println("mời bạn nhập thông tin của nhân viên 1:");
System.out.println("nhập họ:");
String ho1= new Scanner(System.in).nextLine();
System.out.println("nhập tên:");
String ten1= new Scanner(System.in).nextLine();
System.out.println("nhập số sản phẩm:");
int sp1= new Scanner(System.in).nextInt();
System.out.println("mời bạn nhập thông tin của nhân viên 2:");
System.out.println("nhập họ:");
String ho2= new Scanner(System.in).nextLine();
System.out.println("nhập tên:");
String ten2= new Scanner(System.in).nextLine();
System.out.println("nhập số sản phẩm");
int sp2= new Scanner(System.in).nextInt();
nv1= new NhanVien(ten1, ho1, sp1);
nv2= new NhanVien(ten2, ho2, sp2);
System.out.println("lương của nhân viên 1 là: "+nv1.getLuong());
System.out.println("luong cua nhân viên 2 là: "+ nv2.getLuong());
nv2.getLuong();
//so sánh dùng hàm lonHan
if(nv1.lonHon(nv2))
	System.out.println("nhân viên 1 có số sản phẩm lơn hơn và lớn hơn "+(nv1.getSoSP()-nv2.getSoSP())+ " sản phẩm");
else
	System.out.println("nhân viên 2 có số sản phẩm lớn hơn và lớn hơn " + (nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
// so sánh không dùng hàm lớn hơn
if (nv1.getSoSP()>nv2.getSoSP())
	{System.out.println("nhân viên "+nv1.getHo()+ "\t"+nv1.getTen()+" có số sản phẩm lớn hơn");
System.out.println(" cụ thê là : "+(nv1.getSoSP()-nv2.getSoSP())+ " sản phẩm");}
else
{
	System.out.println("nhân viên "+nv2.getHo()+ "\t"+nv2.getTen()+" có số sản phẩm lớn hơn");
	System.out.println(" cụ thê là : "+(nv2.getSoSP()-nv1.getSoSP())+ " sản phẩm");
}
	}

}
