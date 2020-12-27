package bai1;

public class Simple47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int e;
int res;
for(int i=0; i<10; i++) {
	res =1;
	e= i;
	while (e>0) {
		res *=2;
		e--;
	}
	System.out.println(" 2 в степени " +i+ "=" + res);
}
	}

}
