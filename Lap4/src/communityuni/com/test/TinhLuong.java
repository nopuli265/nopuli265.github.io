package communityuni.com.test;

import java.util.Scanner;

public class TinhLuong {

	public static void main(String[] args) {
System.out.println("Самые распространенные из них – это вычеты за несовершеннолетних детей.\n"
		+ " Если у работника есть один или два ребенка до 18 лет,\n "
		+ "за каждого из них из дохода вычитается 1 400 рублей,\n"
		+ " а за третьего и последующих – 3 000 рублей.");
System.out.println("В 2018 году НДФЛ считается по ставке 13%");
System.out.println("============================================");
System.out.print("month: ");
int th= new Scanner(System.in).nextInt();
System.out.println();

System.out.print("имя: ");
 String ten= new Scanner(System.in).nextLine();

 System.out.print("количество детей(<18 лет): ");
 int sl= new Scanner(System.in).nextInt();
 System.out.println();
 
 System.out.print(" оклад/день: ");
 int luong= new Scanner(System.in).nextInt();
 System.out.println();
 
 System.out.print(" количество отпуск:");
 int nghi= new Scanner(System.in).nextInt();
 System.out.println();
 
 System.out.print(" количество больничный:");
 int om= new Scanner(System.in).nextInt();
 System.out.println();
 
 double tongluong;
 switch(th)
 {
 case 1:
 case 3:
 case 5:
 case 7:
 case 8:
 case 10:
 case 12:
 if (sl<=2)
 {
	 tongluong=((31-nghi-om)*luong-1400*sl)*0.87;
 }
 else
 {
	 tongluong= ((31-nghi-om)*luong-(1400*2+3000*(sl-2)))*0.87;
 }
 System.out.println("заработной платы сотрудника "+ ten+ ": "+tongluong +" руб");

 break;
 case 4:
 case 6:
 case 9:
 case 11:
	 if (sl<=2)
	 {
		 tongluong=((30-nghi-om)*luong-1400*sl)*0.87;
	 }
	 else
	 {
		 tongluong= ((30-nghi-om)*luong-(1400*2+3000*(sl-2)))*0.87;
	 }
	 System.out.println("заработной платы сотрудника "+ ten+ ": "+tongluong +" руб");
	 break;
 case 2:
	 if (sl<=2)
	 {
		 tongluong=((28-nghi-om)*luong-1400*sl)*0.87;
	 }
	 else
	 {
		 tongluong= ((28-nghi-om)*luong-(1400*2+3000*(sl-2)))*0.87;
	 }
	 System.out.println("заработной платы сотрудника "+ ten+ ": "+tongluong +" руб");
	 break;
	 default:
	 System.err.println("khong co thang nay");
	 break;
 }
	
}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    