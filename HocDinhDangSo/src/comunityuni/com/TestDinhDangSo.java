package comunityuni.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestDinhDangSo {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap diem toan:");
double toan= sc.nextDouble();
System.out.println("moi ban nhap vao diem hoa");
double hoa= sc.nextDouble();
System.out.println("moi ban nhap diem li");
double li= sc.nextDouble();
double dtb= (hoa+toan+li)/3;
System.out.println("diem trung binh la " +dtb);

DecimalFormat dcf = new DecimalFormat("#.##");
System.out.println("DTB= "+ dcf.format(dtb));

	}

}
