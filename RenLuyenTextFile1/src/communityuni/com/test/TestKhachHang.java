package communityuni.com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import communityuni.com.io.TextFileFactory;
import communityuni.com.model.KhachHang;
import communityuni.com.util.DateConverter;

public class TestKhachHang {
static ArrayList<KhachHang>dsKH = new ArrayList<KhachHang>();
public static void menu()
{
	System.out.println("1.nhap");
	System.out.println("2.xuat");
	System.out.println("3.luu");
	System.out.println("4.mo");
	System.out.println("5.thoat");
	System.out.println("bạn muốn :");
	int n= new Scanner(System.in).nextInt();
	switch(n)
	{
	case 1:
		nhap();
		break;
	case 2:
		xuat();
		break;
	case 3:
		luu();
		break;
	case 4:
		mo();
		break;
	case 5:
System.exit(0);
System.err.println("thoat");	
break;
	}
}

private static void mo() {
 	dsKH= TextFileFactory.readFile("E:/dulieukh.txt");
}

private static void luu() {
if(TextFileFactory.saveFile(dsKH, "E://dulieukh.txt")==true)
	{System.out.println(" da luu thanh cong");}
}

private static void xuat() {
for (KhachHang kh:dsKH)
	System.out.println(kh);
}

private static void nhap() {
System.out.println(" moi ban nhap ma");
int ma= new Scanner(System.in).nextInt();
System.out.println("moi ban nhap ten");
String ten= new Scanner(System.in).nextLine();
System.out.println(" moi ban nhap nam sinh(dd/MM/yyyy");
Date ns= DateConverter.fromString(new Scanner(System.in).nextLine());
KhachHang kh= new KhachHang(ma, ten, ns);
dsKH.add(kh);

}
public static void main(String []args)
{
	while (true)
	{
		menu();
	}
}
	

}
