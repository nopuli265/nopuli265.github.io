package communityuni.com;

public class Testnoichuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1= "ngo thi";
String s2= " phuong linh";
String s3= s1+s2;
System.out.println(s3);
System.out.println("chieu dai chuoi" + s3.length());

StringBuilder sb= new StringBuilder();
sb.append(s1);
sb.append("\t");
sb.append(s2);
System.out.println(sb.toString());
System.out.println("chieu dai chuoi" + sb.length());
StringBuilder sb1= new StringBuilder("ngo linh");
sb1.insert (3, " thi phuong ");
System.out.println(sb1.toString());
String st = s1.substring(0,3);
System.out.println(st);
	}

}
