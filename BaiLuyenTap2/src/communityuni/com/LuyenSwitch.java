package communityuni.com;

import java.util.Scanner;

public class LuyenSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		while (true)
		{
			System.out.print("nhap so a = ");
			float a= sc.nextFloat();
			System.out.print("nhap so b = ");
			float b= sc.nextFloat();
			System.out.print("nhap ki tu ch=");
			char ch = new Scanner(System.in).nextLine().charAt(0);
			switch (ch)
			{
			case '+':
				System.out.println("tong cua a va b la:\n a+b= "+(a+b));
				break;
			case '-':
				System.out.println("hieu hai so a va b la \n a-b= "+(a-b));
				break;
			case '*':
				System.out.println("tich cua hai so a vaf b \n a*b= "+(a*b));
				break;
			case '/':
			{if (b==0)
			{
				System.out.println("khong the thuc hien phep chia cho so khong");
			}
			else
			{
				System.out.println("thuowng cuar phep chia a/b la \n a/ b= "+(a/b));
			}
			break;
			}
			default:
				System.err.println("nhap sai ki tu!");
			}
			System.out.println("con tiep thuc thuc hien khong??");
			String line = new Scanner(System.in).nextLine();
			if (line.equalsIgnoreCase("k"))
				break;
		}
		System.out.println("thanks!");
	}

}
