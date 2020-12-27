package comunityuni.com.test;

import java.util.Scanner;

public class Bai2r {
	public static int factorial(int x) {
		if (x<0) throw new IllegalArgumentException("x должен быть >=0");
		int fact =1;
		for (int i=2;i<=x;i++)
			fact*=i;
		return fact;
	}
	public static void main(String[] args) {
		System.out.println("moi nhap x= ");
		int x= new Scanner(System.in).nextInt();
		System.out.println("fact= "+factorial(x));
	}

}
