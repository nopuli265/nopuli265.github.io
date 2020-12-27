package communityuni.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>map= new HashMap<Integer,String>();
		map.put(1, "dai");
		map.put(2, "linh");
		map.put(3, "thuy");
		map.put(4, "nhung");
	
		//lay danh sach ten
		Collection<String> dsTen= map.values();
		for ( String ten: dsTen)
		{
			System.out.println(ten);
		}
	
		//in ra danh sach ma
		System.out.println("danh sach ma:");
		Set<Integer>dsma= map.keySet();
		for (int ma:dsma)
		{
			System.out.println(ma);
		}
	
		//lay thong tin theo key
		System.out.println("ten cos khoa 1 la:");
		String Ten=map.get(1);
		System.out.println(Ten);
		
		//chen vao vi tri so 3
		if(map.containsKey(6)==false)
		{map.put(6, "huyen");
		System.out.println();
		}
		System.out.println("danh sach sau khi upload");
		//dsTen=map.values();
		for (String ten1:dsTen)
		{
			System.out.println(ten1);
		}
	
		//xoa theo key
		map.remove(4);
		System.out.println("danh sach sau khi xoa la");
		//dsTen=map.values();
		for (String ten2:dsTen)
		{
			System.out.println(ten2);
		}
	}

	private static boolean containsKey(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
