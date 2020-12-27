package communityuni.com.test;

import java.util.Scanner;

public class DeQuy {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println(" вводить строку:");
String ch= sc.nextLine();
char a[]=ch.toCharArray();
char[]b=new char[ch.length()];
for (int i=0; i<ch.length();i++)
	b[i]=a[ch.length()-i-1];
	System.out.println(" cocтавлять строку в обратном порядке:");
	for (int i=0; i< ch.length();i++)
	{
		System.out.print(b[i]);
	}
}
}
