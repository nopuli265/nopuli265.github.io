package communityuni.com;

import java.util.Scanner;

public class HocFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.print("nhap n= ");
int n = sc.nextInt();
int i;
int gt= 1;
for (i=1;i<=n;i++)
{
	gt*=i;
}
System.out.println(+n+"!= "+gt);
	}

}
