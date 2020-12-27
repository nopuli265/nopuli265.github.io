package communityuni.com.test;

import java.util.Scanner;
public class Test3 {
	public static void sum(int b[]) {
		int s=0;
		for (int i=0;i< b.length;i++)
		{
			s+=b[i];
		}
		System.out.println("сумма= " +s);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("вводить аргумент: "); 
		int n= new Scanner(System.in).nextInt();
		int b[]= new int[n];
		for (int i=0; i<n; i++)
		{
			System.out.print("b["+i+"]=");
			 b[i]=sc.nextInt();
			System.out.println();
		}
		for (int i=0;i< b.length; i++)
			System.out.print(b[i]+"\t");
		System.out.println();
	sum(b);
	}



}
