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
if ( i==j) System.out.println(" ��� �� ����� ���������");
if ( i>= j) System.out.println(" ��� �� ����� ���������");
if ( i>j) System.out.println(" ��� �� ����� ���������");

b1= true;
b2 = false;
if (b1&b2) System.out.println(" ��� �� ����� ���������");
if (!(b1&b2))System.out.println("!(b1&b2) ��� �����");
if (b1|b2) System.out.println(" b1 | b2 ��� �����");
if (b1^b2) System.out.println(" b1^b2 ��� �����");

	}

}
