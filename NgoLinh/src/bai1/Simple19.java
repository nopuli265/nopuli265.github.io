package bai1;

public class Simple19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, j;
boolean b1, b2;
i = 10;
j = 11;
if ( i<j) System.out.println("i<j");
if ( i<=j) System.out.println("i<=j");
if ( i!=j) System.out.println("i != j");
if ( i==j) System.out.println(" Это не будет выполнено");
if ( i>= j) System.out.println(" Это не будет выполнено");
if ( i>j) System.out.println(" Это не будет выполнено");

b1= true;
b2 = false;
if (b1&b2) System.out.println(" Это не будет выполнено");
if (!(b1&b2))System.out.println("!(b1&b2) это верно");
if (b1|b2) System.out.println(" b1 | b2 это верно");
if (b1^b2) System.out.println(" b1^b2 это верно");

	}

}
