package communityuni.com;

class Example1 { 
	
	char q[];
	int putloc, getloc;

	Example1 (int size)
	{
		q= new char[size +1];
		putloc=getloc=0;
	}
	public void put( char ch) {
		if (putloc==q.length-1) {
			System.out.println("- Очередь заполнена"); 
			return;
		}
		putloc++;
		q[putloc]=ch;
	}
	 char get()
	{
		if (getloc== putloc)
		{
			System.out.println("-Очередь пуста");
		} 
	
		return q[putloc];

	}
}