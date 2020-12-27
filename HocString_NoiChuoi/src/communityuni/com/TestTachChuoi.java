package communityuni.com;

public class TestTachChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= " sinh vien 1; ngo thi phuong linh; dhth";
String [] arr = s.split(";");
if (arr.length==3)
{
	System.out.println(" ma = " +arr[0]);
	System.out.println("ten = "+ arr[1]);
	System.out.println(" lop = " + arr[2]);
	
}
System.out.println(" =----------------------");
for (int i=0; i< arr.length;i++)
	System.out.println(arr[i]);

for (String x: arr)
	System.out.println(x);
	}

}
