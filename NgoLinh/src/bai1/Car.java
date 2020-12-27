package bai1;
import java.util.Scanner;

class Car1{
	float t1,t2;
	float v;
	public void start() {
		System.out.println(" time start: ");
		Scanner sc= new Scanner(System.in);
		t1= sc.nextFloat();
	}

	public void stop() {
		System.out.println(" time stop: ");
		Scanner sc= new Scanner(System.in);
		t2= sc.nextFloat();
	}

	public float drive () {
		float howlong = v*(t2-t1);
		return howlong;
	}

	public float t1() {
		// TODO Auto-generated method stub
		return t1;
	}

	public float t2() {
		// TODO Auto-generated method stub
		return t2;
	}

}


public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 vantoc= new Car1();
		vantoc.start();
		vantoc.stop();
		vantoc.v=50;
		System.out.println("скорость= "+ vantoc.v);
		System.out.println(" расстояние, пройденное на машине от " + vantoc.t1()+ " h до "+vantoc.t2()+  " h: " + vantoc.drive()+"M");
	}
}
