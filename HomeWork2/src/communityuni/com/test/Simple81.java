package communityuni.com.test;

public class Simple81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
int num1[] = new int [10];
int num2[]= new int [10];
 for (i=0; i<10; i++)
	 num1[i]=i;
 for (i=0; i<10;i++)
	 num2[i]=-i;
 System.out.print(" Это массив1: ");
 for (i=0; i<10;i++)
	 System.out.print(" "+num1[i]);
 System.out.println();
 System.out.print("Это массив2:");
 for (i=0; i<10;i++)
	 System.out.print(" "+num2[i]);
 System.out.println();
 num1=num2;
 System.out.print(" это массив1 после присваивания ссылки: ");
 for (i=0; i<10; i++)
	 System.out.print(num2[i]+" ");
 System.out.println();	
num2[3]=99;
System.out.println(" Это массив1 после изменения элемента 3 через массив2:");
 for (i=0; i<10; i++)
	 System.out.print(num1[i]+" ");
 System.out.println();
	}

}
