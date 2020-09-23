package comunityuni.com;

import java.util.StringTokenizer;

public class TeststringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="ngo thi phuong linh";
StringTokenizer token = new StringTokenizer(a);
while (token.hasMoreTokens())
{
	String value= token.nextToken();
	System.out.println(value);
}
	}

}
