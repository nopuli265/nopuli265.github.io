package bai1;
class Simple65r{
	boolean isEven(int x) {
		if ((x%2)==0)
			return true;
		else return false;
	}
}

public class Simple65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple65r t= new Simple65r();
		if (t.isEven(10))
			System.out.println(" 10 четное.");
		if (t.isEven(9))
			System.out.println(" 9 нечетное.");
		if (t.isEven(8))
			System.out.println(" 8 четное.");

	}

}
