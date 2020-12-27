package bai1;

public class Simple57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
for(i=1;i<4;i++)
{
	one:{
	two:{
	three:{
	System.out.println(" \ni= "+i);
	if (i==1) break one;
	if (i==2) break two;
	if (i==3) break three;
	System.out.println("это не будет напечатано");
}
System.out.println("после блока three.");
}
System.out.println("после блока two.");

}
System.out.println("после блока one.");

}
System.out.println("после блока цыкла.");

	}

}
