package communityuni.com.model;

public class Simple77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int a,b,t;
		int size;
		size = 10;
		System.out.println(" первоначальный массив включает следующте элементы: ");
		for (int i=0; i< size; i++)
			System.out.print(" "+ nums[i]);
		System.out.println();
		
		for (a=0; a< size; a++)
			for (b=size-1; b>a; b--)
			{
				if (nums[b-1]>nums[b])
				{
					t= nums[b-1];
					nums[b-1] = nums[b];
					nums[b]=t;
				}
			}


		System.out.println(" массив отсортированный методом пузырька: ");
		for(int i=0;i<size;i++)
			System.out.print("  "+nums[i]);
		System.out.println();
	}

}
