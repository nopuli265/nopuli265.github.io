package bai1;

public class Simple41 {

	public static void main(String[] args) 
	throws java.io.IOException {
		int i;
		System.out.println("нажмите s чтобы прервать выполнение программы");
		for (i=0; (char)System.in.read()!='s';i++)
			System.out.println("цыкл № " +i);
	}

}
