package bai1;

public class Simple84 {
char  d[];
int putl, getl;
public Simple84(int size){
	d=new char[size+1];
	putl= getl=0;
}
void put(char hc)
{
	if (putl ==d.length-1) {
		System.out.println(" - очередь переполнена");
		return;
	}
	putl++;
	d[putl]=hc;
	
}

char  get() {
	 if ( getl==putl) {
		 System.out.println(" - очередь пуста.");
		 return (char )0;
		 
	 }
	 getl++;
	 return d[getl];
 }



}
