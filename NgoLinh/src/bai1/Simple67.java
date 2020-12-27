package bai1;

class Simple67 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Simple67r car = new Simple67r();
		Simple67r sportcar = new Simple67r();
		double lit;
		int dis = 900;
		car.pass=7;
		car.volume=40;
		car.cost=15;
		
		sportcar.pass=3;
		sportcar.volume=30;
		sportcar.cost=20;
		lit = car.dist(dis);
		System.out.println("Чтобы проехать " + dis + " км легковому автомобилю потребуется " + lit + " литров топлива ");
	    lit = sportcar.dist(dis);
	    System.out.println("Чтобы проехать " + dis + " км спортивному автомобилю потребуется " + lit + " литров топлива ");
	}
}


