package communityuni.com;

import java.util.Scanner;

public class TestDoWhille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("nhaap so n = ");
int n = sc.nextInt();
int gt =1;
int i= 1;
do
{gt*=i;
i++;
}
while(i<=n);
System.out.println("giai thua cua "+n+" = "+gt);
}
	}


