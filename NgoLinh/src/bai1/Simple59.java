package bai1;


class Simple59r {
	  int pass;
    int volume;
    int cost;
  	 }

class Simple59 {
	public static void main (String args[]){
	Simple59r mini = new Simple59r();
	int r;
	mini.pass=7;
	mini.volume=16;
	mini.cost=21;
	r = mini.volume*mini.cost; 
	System.out.println("Minivan может перевезти " + mini.pass + " пассажиров на расстояние " + r + " км");
	}
}


