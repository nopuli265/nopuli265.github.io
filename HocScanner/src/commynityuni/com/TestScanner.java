package commynityuni.com;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("mời bạn nhập số:");
int a= sc.nextInt();
System.out.println(" số vừa nhập là:" + a);
System.out.println("mời bạn nhấp 1 số double:");
 double b= sc.nextDouble();
 System.out.println("số double bạn vừa nhấp là:"+b);
 System.out.println("nhập một chuỗi");
 String line = new Scanner(System.in).nextLine();

 System.out.println("chuỗi vừa nhập là:"+line);
	}
 
}