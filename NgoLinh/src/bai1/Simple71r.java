package bai1;

public class Simple71r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Simple71 car = new Simple71(7,16,21);
Simple71 sportscar= new Simple71( 2,14,12);
double lit;
int dis = 1000;
lit = car.dist(dis);
System.out.println("чтобы проехать " + dis +" км легковому автомобилю потребуется " + lit+ " литров топлива");
lit = sportscar.dist(dis);
System.out.println("чтобы проехать " + dis +" км легковому автомобилю потребуется " + lit+ " литров топлива");
	}
}
