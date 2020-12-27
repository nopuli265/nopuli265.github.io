package communityuni.com;

import java.util.Scanner;

public class TestIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("mời bạn nhập một tháng:");
int thang= sc.nextInt();
System.out.println("tháng vừa nhập là:"+thang);
if (thang ==1|| thang == 3 || thang == 5|| thang ==7||thang ==8 ||thang==10||thang==12)
{
	System.out.println("tháng có 31 ngày");}
else if (thang == 4|| thang==6 || thang== 9|| thang== 11)
{
	System.out.println("thang "+ thang+" có 30 ngày");
}
else if (thang==2)
{
	System.out.println("thang 2 co 29 hoac 28 ngay");
	
}
else
{
	System.out.println("baj nhap sai thang");
}
}


	}


