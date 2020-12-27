package bai1;
class Simple63r{
	void myMeth() {
	int i;
	for (i=0; i<10;i++ ) 
	{
		if(i==5) {
			System.out.println("Цикл был прерван на шаге " + i + " оператором return");
			return;
		}
		System.out.println(i+" цыкл не прервался ");
	}
	
	}
}
public class Simple63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Simple63r ex = new Simple63r();
ex.myMeth();
	}

}
