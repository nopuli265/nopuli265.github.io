package communityuni.com.model;

public class Simple74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mass[]= new int [10];
int min,max;
mass[0]=99;
mass[1]=-10;
mass[2]=100123;
mass[3]=18;
mass[4]=-978;
mass[5]=5623;
mass[6]=463;
mass[7]=-9;
mass[8]=287;
mass[9]=49;
min=max= mass[0];
for (int i=1; i<10; i++)
{
	if(mass[i]>max)
		max=mass[i];
	if (mass[i]<min)
		min=mass[i];
}
System.out.println("min and max : " + min + " "+ max);
	}

}
