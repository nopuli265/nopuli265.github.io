package communityuni.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestSapXep {
	public static void NhapMang(int[]M) {
		Scanner sc= new Scanner(System.in);
		for (int i=0; i<M.length; i++)
		{
			System.out.print("M["+i+"]= ");
			M[i]=sc.nextInt();
		}
	}
	public static void nhapMangRanDom(int M[]) {
		Random rd= new Random();
		for ( int i =0; i< M.length; i++)
		{
			M[i]=rd.nextInt(100)	;
		}
	}
	public static void XuatMang(int[]M)
	{
		for(int i=0; i<M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("nhap kich thuoc cua mang n= ");
		int n = sc.nextInt();
		int M[]= new int [n];
		System.out.println("moi ban nhap mang M:");
		nhapMangRanDom(M);
		System.out.println("mang da nhap la:");
		XuatMang(M);
		System.out.println();
	Arrays.sort(M);
 	System.out.println("mang sau khi sap xep la");
		XuatMang(M);
	}


}
