package communityuni.com;

import java.util.Scanner;

public class TestTimKiem {
	public static void NhapMang(int M[])
	{
		Scanner sc= new Scanner(System.in);
		for (int i= 0; i< M.length; i++)
		{
			System.out.print("M["+i+"]= ");
			M[i]=sc.nextInt();
		}
	}

	public static void XuatMang(int M[])
	{
		for (int i=0; i< M.length; i++)
		{
			System.out.print(M[i]+"\t");
		}
	}
	public static void TimKiem(int M[], int k)
	{
		boolean timThay= false;
		for (int i=0; i< M.length; i++)
		{
			if(M[i]==k)
			{
				timThay= true;
				break;
			}
		}
		if(timThay==true)
		{

			System.out.println("co tim thay so "+k+" trong mang M");
		}
		else 
			System.out.println("khong tim thay "+k+" trong mang M");
	}
	public static void TimThayViTri(int M[], int k)
	{
		String S = "";
		int soLan=0;
		for ( int i=0; i< M.length; i++)
		{
			if (M[i]==k)
			{
				S += i + ",";
				soLan++;
			}
		}
		if(S.length() >0 )
		{
			System.out.println(" so "+k+" xuat hien trong mang M " +soLan+ "lan, tai cac vi trí: "+S);
		}
		else 
			System.out.println("khong tim thay "+k +"trong mang M");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("moi ban nhap so phan tu cua mang n= ");
		int n= sc.nextInt();
		int []M = new int[n];
		System.out.println("moi ban nhap so phan tu cua mang");
		NhapMang(M);
		System.out.println("mang sau khi xuat la");
		XuatMang(M);
		System.out.println();
		System.out.println("moi ban nhap so can tim k = ");
		int k= sc.nextInt();
		TimKiem(M, k);
		System.out.println("moi ban nhap so can tim h= ");
		int h= sc.nextInt();
		TimThayViTri(M, h);
	}

}
