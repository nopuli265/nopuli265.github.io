package communityuni.com;

import java.util.Scanner;

public class HocBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
	Scanner sc= new Scanner(System.in);
	System.out.println("nhap so n = ");
	int n = sc.nextInt();
	if (n%2==0)
		System.out.println(n+"laf so chan");
	else 
		System.out.println(n+" la so le");
System.out.println("co tiep tuc khong(c/k)?");
String line= new Scanner(System.in).nextLine();
if(line.equalsIgnoreCase("k"))
	break;
	}
		System.out.println("ket thuc!");

}
}
