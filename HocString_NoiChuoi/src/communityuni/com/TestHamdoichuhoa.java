package communityuni.com;

public class TestHamdoichuhoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "obama";
		s1= s1.toUpperCase();
		System.out.println(s1);
		s1= s1.replaceFirst("bama", "bama".toLowerCase());
		System.out.println(s1);
		s1=s1.toLowerCase();
		System.out.println(s1);
		s1= s1.replaceFirst((s1.charAt(0)+""), (s1.charAt(0)+"").toUpperCase());
		System.out.println(s1);
	}

}
