package communityuni.com.test;

public class SimpleFactorial {
	 static int factorial(int x ) {
		if (x<0) throw new IllegalArgumentException("x должен быть >= 0");
		int fact =1 ;
		for (int i=2; i<x ; i++)
			fact*=i;
		return fact;
	}

}

 class SimpleFactorial1 {
	 static long factorial(long x ) {
		if (x<0) throw new IllegalArgumentException("x должен быть >= 0");
if (x<1) return 1;
else
		return x* factorial(x-1);
	}
 }
