package communityuni.com;

import java.util.Random;

public class Ex2_2 {
	double q[];
	int putloc, getloc;
	double ch;
	Ex2_2 (int size)
	{
		q= new double[size +1];
		putloc=getloc=0;
	}
	public void put( double ch) {
		if (putloc==q.length-1) {
			System.out.println("- Очередь заполнена"); 
			return;
		}
		putloc++;
		Random rd= new Random();
		q[putloc]=rd.nextDouble();
	}
	double get() {
		if (getloc== putloc)
		{
			System.out.println("-Очередь пуста");
		} 
		return q[putloc];
	}
	
	
}

