package communityuni.com;

import java.util.Random;

public class Ex3r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3 bigQ= new Ex3(100);
		Ex3 smallQ = new  Ex3(5);
		int ch;
		int i;
		for(i=0; i<6; i++)
		{
			bigQ.put(i);
			System.out.println();
		}
		System.out.println(" содержимое очереди bigQ: ");
		for(i=0; i<6;i++)
		{
			ch=bigQ.get();
				System.out.print(ch+"\t");
		}
		System.out.println();
		System.out.println(" программа их отсортировала по возрастанию:");
		bigQ.Sapxep();
		for(i=0;i<6; i++)
		{
			ch=bigQ.get();
			System.out.print(ch+" ");
		}
		System.out.println();

		for(i=0; i<6; i++)
		{
			smallQ.put(i);
			System.out.println();
		}
		System.out.print(" содержимое очереди smallQ: ");
		for(i=0;i<6; i++)
		{
			ch=smallQ.get();
			System.out.print(ch+" ");
		}
		
		System.out.println();

		smallQ.minMax();
		smallQ.tb();

	}
}
