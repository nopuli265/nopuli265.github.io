package communityuni.com.test;

import java.util.Scanner;

import communityuni.com.model.Nhap;

public class TestNhap {
	

	public static void main(String[] args) throws java.io.IOException{
	        char choice, ign;
	        Nhap sp= new Nhap();
	        Nhap sp1 = new Nhap("coca-cola",10);
	        Nhap sp2 = new Nhap("pesi",20);
	        Nhap sp3 = new Nhap("Red Bull",30);
	        Nhap sp4 = new Nhap("Sprite",30);

	        sp.menu();
	    	Scanner sc= new Scanner(System.in);	
	    	System.out.println("-----------------------------------");
	    	System.out.print("moi nhap so n=");
	    	int a = sc.nextInt();
	    	sp.In(a);
	    	System.out.println("----------------------");
	    	
	    	float max= Nhap.price (sp1,sp2,sp3,sp4);
	    	
	    	
	}

	
	}

	



