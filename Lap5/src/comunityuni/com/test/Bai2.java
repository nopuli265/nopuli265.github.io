package comunityuni.com.test;

import java.util.Scanner;

public class Bai2 {
	
public static long factorial(long x) {
	if (x<0) throw new IllegalArgumentException("x должен быть >=0");
	if (x<=1) return 1;
	else 
		return x*factorial(x-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("moi nhap x= ");
long x= new Scanner(System.in).nextLong();
System.out.println("fact="+factorial(x));
	}

}
