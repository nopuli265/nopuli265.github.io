package bai1;

public class Simple53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for (int i=0; i<3; i++){
				System.out.println("Количество внешних циклов: " + i);
				System.out.println(" Счетчик внутренних циклов: ");
				
				int t=0;
				while (t<100){
					if (t == 10) break;
					System.out.print(t + " ");
					t++;
				}
				System.out.println();
			}
			System.out.println("Цикл завершен. ");  	

	}

}
