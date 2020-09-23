package comunityuni.com;

public class HocStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb= new StringBuilder();
sb.append("toi la ");
sb.append("ngo thi phuong linh");
sb.insert(16, "vietnam");
sb.delete(0,2);
String s = sb.toString();

System.out.println(s);
	}

}
