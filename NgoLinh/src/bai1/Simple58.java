package bai1;

public class Simple58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=2; i<=100; i++)
{
	System.out.println("факторы "+i+ " =");
	for (int j=2; j<=i; j++)
		if ((i%j)==0) System.out.println(j+ " ");
	System.out.println();
}
	}

}
