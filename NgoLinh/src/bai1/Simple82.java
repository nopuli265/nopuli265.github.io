package bai1;

public class Simple82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int list[]=new int[10];
int num[]= {1,2,3};
int table[][]= {
		{1,2,3},
		{4,5},
		{6,7,8,9}
};
System.out.println(" длина массива list = " +list.length);
System.out.println(" длина массива num = " +num.length);
System.out.println(" длина массива table = " +table.length);
System.out.println("размер 0 строки двухмерного массива table:" + table[0].length);
System.out.println("размер 1 строки двухмерного массива table:" + table[1].length);
System.out.println("размер 2 строки двухмерного массива table:" + table[2].length);
System.out.println();
for (int i=0; i<list.length;i++)
	list[i]=i*i;
System.out.print("это массив list:");
for (int i=0; i<list.length;i++)
System.out.print(" "+ list[i]);
System.out.println();
	}

}
