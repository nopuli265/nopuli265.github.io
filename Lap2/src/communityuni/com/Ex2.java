package communityuni.com;

public class Ex2 {
	int q[];
	int putloc, getloc;
int ch;
	Ex2 (int size)
	{
		q= new int[size +1];
		putloc=getloc=0;
	}
	public void put( int ch) {
		if (putloc==q.length-1) {
			System.out.println("- Очередь заполнена"); 
			return;
		}
		putloc++;
		q[putloc]=ch;
		this.ch= ch;
	}
	int get() {
		if (getloc== putloc)
		{
			System.out.println("-Очередь пуста");
		} 
		return ch;
}
}
