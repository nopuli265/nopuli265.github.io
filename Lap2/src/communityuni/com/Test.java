package communityuni.com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
System.out.println("ввод строку:");
	String ch= new Scanner(System.in).nextLine();
	char a[]=ch.toCharArray();
	for(int i=0;i<ch.length();i++)
	{
		if(a[i]=='a')
			System.out.println(i);
	}
		
	
	System.out.println();
	}

}
