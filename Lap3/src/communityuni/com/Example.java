package communityuni.com;

public class Example {
public char q[];
public int putloc, getloc;

Example( int size){
	q= new char[size+1];
	putloc=getloc=0;
}
void put (char ch) {
	if (putloc==q.length-1) {
		System.out.println(" - Очередь заполнена");
		return;
	}
	q[putloc++]=ch;
}

char get() {
	if(getloc==putloc) {
		System.out.println("-Очередь пуста");
		return (char)0;
	}
	return q[getloc++];
}
}

