package bai1;
class Simple66r{
	boolean myMeth(int a, int b) {
		if ((b%a)==0)
			return true;
		else return false;
	}
}
public class Simple66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Simple66r t= new Simple66r();
if ( t.myMeth(2, 20))
	System.out.println("2, это просто 2");
if( t.myMeth(3, 20))
	System.out.println("это не будет выведено на экран! обЪясните преподавателю почему?");
	}

}
