package communityuni.com.test;

import java.sql.Time;
import java.util.Scanner;

public class TestContact {
	public static void menu()
	{
		System.out.println("1. them");
		System.out.println("2. xuat");
		System.out.println("3. sua");
		System.out.println("4. xoa");
		System.out.println("5.tim");
		System.out.println("6.sap xep");
		System.out.println("7. luu file");
		System.out.println("8.doc file");
		System.out.println("9. thoat");
		System.out.println("muon thuoc hien cai gi : ");
		int n= new Scanner(System.in).nextInt();
		switch (n)
		{
		case 1:
			them();
		break;
		case 2:
			xuat();
		break;
		case 3:
			sua();
			break;
		case 4:
			xoa();
			break;
		case 5:
			Time();
			break;
		case 6:
			sapxep();
			break;
		case 7:
			luu();
		case 8:
			doc();
			break;
		case 9:
System.err.println("tam biet");			
			
		}
	}

	private static void doc() {
		// TODO Auto-generated method stub
		
	}

	private static void luu() {
		// TODO Auto-generated method stub
		
	}

	private static void sapxep() {
		// TODO Auto-generated method stub
		
	}

	private static void Time() {
		// TODO Auto-generated method stub
		
	}

	private static void xoa() {
		// TODO Auto-generated method stub
		
	}

	private static void sua() {
		// TODO Auto-generated method stub
		
	}

	private static void xuat() {
		// TODO Auto-generated method stub
		
	}

	private static void them() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
