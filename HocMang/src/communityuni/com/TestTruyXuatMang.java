package communityuni.com;

import java.util.Scanner;

public class TestTruyXuatMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lam viec voi mang");
		System.out.print("moi ban nhap gia tri toi da cuar mang n= ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int []M;
		M= new int[n];
		for (int i=0; i< M.length; i++)
		{
			System.out.print("M["+i+"]= " );
			M[i]= sc.nextInt();
		}
		
		System.out.println("mang da nhap la:");
		for (int i=0; i<M.length;i++)
		{
			System.out.print(M [i]+"\t");
		}
		System.out.println();
		M[3]=45;
		System.out.println("xuat mang theo gia tri");
		for (int i:M)
		{
			System.out.print(i+"\t");
		}
		System.out.println(M.length);
	}

}
