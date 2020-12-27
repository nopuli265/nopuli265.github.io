package bai1;

import java.util.Scanner;

public class testBT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BaiTap2 xe= new BaiTap2();
int sl;
while(true) {
xe.menu();
String name = new Scanner(System.in).nextLine();
System.out.println("количество дней, на которое вы хотете взять машину");
 sl= new Scanner(System.in).nextInt();
xe.In(name,sl);
System.out.print("Вы хотите продолжить?(да/нет)?");
String line1= new Scanner(System.in).nextLine();
if(line1.equalsIgnoreCase("нет"))
	break;

}
xe.tongTien();
System.out.println("Спасибо за использование программы!");
System.out.println("goodbye!");
}
	

}
