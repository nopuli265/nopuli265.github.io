package communityuni.com.test;

import java.util.Scanner;

import communityuni.com.model.Stack;

public class TestStack {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("размер стека:  ");
		int n= sc.nextInt();
Stack stk= new Stack(n);
char ch;

for(int i=0; i<n;i++)
{
	stk.push((char)('A'+i));
}
	
	System.out.println();
	System.out.print(" содержимое стека: ");
	for(int i=0; i<n; i++)
	{
		ch=stk.pop();
		System.out.print(ch+"\t");
	}
}
}