package bai1;

public class Simple38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n, sr, re;
		for(n=1.0; n<100.0; n++){
			sr=Math.sqrt(n);
			System.out.println("Квадратный корень из " + n + " = " + sr);
			re = n - (sr*sr);
			System.out.println("Ошибка округления " + re);
			System.out.println();
		}

	}

}
