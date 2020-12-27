package communityuni.com;

import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.print("nhập một số n=");
int n = sc.nextInt();
int i =1;
int gt =1;
while (i<=n)
{
	gt*=i;
	i++;
}
System.out.println("giai thua cua " +n+" bang "+gt);
}
	}


