package communityuni.com;

import java.util.Scanner;

public class TestbienThe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("nhap thang:");
int t= sc.nextInt();
switch (t)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
	System.out.println("thang "+ t + " co 31 ngay");
	break;
case 4:
case 6:
case 9:
case 11:
	System.out.println("thang "+ t + "co 30 ngay");
	break;
case 2:
 
	System.out.println("moi nhap mot nam:");
	int y = new Scanner(System.in).nextInt();
	if( (y%4==0&& y% 100!=0)||(y%400 == 0))
	{
		System.out.println("nam "+y+" la nam nhuan");
		System.out.println("thang 2 co 29 ngay");
	}
	else
	{
		System.out.println(" nam" + y+ "khong nhuan");
	System.out.println("tháng 2 có 28 ngày");
	}
	break;
	

default:
	System.err.println("ban nhap sai thang");
	break;
	}
}

	}


