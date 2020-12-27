package communityuni.com;

public class Simple74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int max;int min;
		int mass[]= {99, -10, 100123, 18, -978, 5623,463,-9,287,49};
		min=max= mass[0];
		for (int i:mass)
		{
			if(i>max)
				max=i;
			if (i<min)
				min=i;
		}
		System.out.println("min and max : " + min + " "+ max);
			}


}
