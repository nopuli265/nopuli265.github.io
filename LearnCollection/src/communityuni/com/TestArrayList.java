package communityuni.com;

import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ds1= new ArrayList();
		ds1.add("1");
		ds1.add (new Date("12/12/1998"));
		ds1.add("5.5");
		ArrayList<Integer>ds2= new ArrayList<Integer>();
		ArrayList<Double>ds3= new ArrayList<Double>();
		ArrayList<Boolean>ds4= new ArrayList<Boolean>();
		ArrayList<String>ds5= new ArrayList<String>();
		ds2.add(4);
		ds2.add(56);
		ds5.add("linh");
		ds5.add("ngo");
		//in ra danh sach so 5
		System.out.println("danh sach so 5 la:");
		for (int i=0; i<ds5.size(); i++)
		{
			System.out.print(ds5.get(i));
		}
		System.out.println();
		//them dong tin hoc ung dung vao vi tri so 1
		ds5.add(1," lop tin hoc ung dung ");
		System.out.println("danh sach sau khi chen la:");
		for (int i=0; i<ds5.size(); i++)
			System.out.print(ds5.get(i));
		System.out.println();
		//in ra danh sach so 2
		System.out.println("danh sach so 2 la:");
		for (int i=0; i<ds2.size(); i++)
		{ 
			System.out.print(ds2.get(i));
			System.out.print("\t");
		}
		System.out.println();
		//xoa vi tri so 2
		ds5.remove(2);
		System.out.println("danh sach sau khi xoa:");
		for( int i= 0; i< ds5.size(); i++)
			System.out.print(ds5.get(i));
		System.out.println();
		//doi thong tin
		ds5.set(0,"ngo thi phuong linh");
		System.out.println("danh sach sau khi thay doi la :");
		for (int i=0; i< ds5.size(); i++)
			System.out.print(ds5.get(i));
		System.out.println();
		ds5.clear();
		System.out.println("so phan tu cua danh sach bay h la:"+ ds5.size());
	}



}
