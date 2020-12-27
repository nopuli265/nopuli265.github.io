package communityuni.com;

public class Example4 {
private char q[];
private int putloc, getloc;
 Example4(int size) {
	q= new char[size+1];
	putloc=getloc=0;
}
 
 Example4(Example4 ex){
	 putloc=ex.putloc;
	 getloc=ex.getloc;
	 q= new char[ex.q.length];
	 for (int i= getloc+1;i<=putloc;i++)
		 q[i]=ex.q[i];
 }
 
 Example4 ( char a[]){
	 putloc= 0;
	 getloc=0;
	 q= new char[a.length+1];
	 for(int i=0; i<a.length;i++)
		 put(a[i]);
 }
 void put(char ch) {
	 if (putloc==q.length-1) {
		 System.out.println("- Очередь заполнена ");
	 return;
 }
 q[putloc++]=ch;
}
 char get() {
	 if (getloc==putloc) {
		 System.out.println("-Очередь пуста");
		 return (char)0;
	 }return q[getloc++];
 }
 
 
}
