package bai1;

public class Simple7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gal, lit;
		int count;
		count = 0;
		for(gal = 1; gal<=100; gal++){
			lit = gal*3.7854;
			System.out.println(gal + "галлонов = " + lit + " литров.");
			count++;
			if(count == 10){
				System.out.println();
				count = 0;

	}
}
	}

}
