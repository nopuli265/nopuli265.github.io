package communityuni.com;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("nhap thang:");
int t= sc.nextInt();
System.out.println(" thang vua nhap la:"+t);
switch (t)
{
case 1:
	System.out.println("thang " + t+ "co 31 ngay");
	break;
case 3:
	System.out.println("thang" + t+ "co 31 ngay");
	break;
case 5:
	System.out.println("");
	break;
case 7:
	System.out.println("thang" + t+ "co 31 ngay");
	break;
case 8:
	System.out.println("thang" + t+ "co 31 ngay");
	break;
case 10:
	System.out.println("thang" + t+ "co 31 ngay");
	break;
case 12:
	System.out.println("thang " + t+ "co 31 ngay");
	break;
	
case 4:
	System.out.println("thang" + t+ "co 30 ngay");
	break;
case 6:
	System.out.println("thang" + t+ "co 30 ngay");
	break;
case 9:
	System.out.println("thang" + t+ "co 30 ngay");
	break;
case 11:
	System.out.println("thang" + t+ "co 30 ngay");
	break;
case 2:
	System.out.println("thang" + t+ "co 28 hoac 29 ngay");
	break;
	default:
		System.err.println("banj nhaap sai thang");
}
	}

}
