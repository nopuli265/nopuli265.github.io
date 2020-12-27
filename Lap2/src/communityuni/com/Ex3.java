package communityuni.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex3 {
		int q[];
		int putloc, getloc;
		Ex3 (int size)
		{
			q= new int[size + 1];
			putloc=getloc=0;
		}
		//-----------------------------------------------------------------
		void put( int putloc) {
			this.putloc=putloc;
			if (putloc==q.length-1) {
				System.out.println("- Очередь заполнена"); 
				return;
			}
			Scanner ch1= new Scanner(System.in);
			{
				System.out.print("q["+putloc+"]= ");
				q[putloc++]=ch1.nextInt();
			}
			
		}
		//---------------------------------------------------------------------

		int get() {
			if (getloc == putloc)
			{
				System.out.println("-Очередь пуста");
				
			} 		return q[getloc++];
		}	
		//--------------------------------------------------------------------------
		void Sapxep() {//чтобы программа их отсортировала по возрастанию

			int i,j;
			for(i=0;i<6;i++)
			{
				for (j=5; j>i; j--)
				{
					if (q[j]<q[j-1])
					{
						int temp=q[j];
						q[j]=q[j-1];
						q[j-1]=temp;
					}
				}
			}return;
		}

		//--------------------------------------------------------------------------
		void minMax() {

			int min, max;
			min= max= q[0];
			for (int i=1; i<q.length;i++)
			{
				if(q[i]>max)
					max=q[i];
				if (q[i]< min)
					min =q[i];
			}
			System.out.println(" min and max : " +min+ " and " + max);
		}
		//------------------------------------------------------------------------------
		void tb()
		{
			double s=0;int k=0;
			for (int i=0;i<q.length-1;i++)
			{
				s+=q[i];
				k+=1;
			}
			System.out.println("K= "+k);
			System.out.println("S=" +s);
			System.out.println("Среднее значение: "+(s/k));
		}
}






