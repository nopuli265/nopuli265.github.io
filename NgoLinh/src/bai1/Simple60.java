package bai1;

class Simple60r {
	  int pass;
    int volume;
    int cost;
  	 }


class Simple60 {
	public static void main (String args[]){
	Simple60r mini = new Simple60r();
	Simple60r sport = new Simple60r();
	int r1, r2;
	mini.pass=7;
	mini.volume=16;
	mini.cost=21;
	
	sport.pass=2;
	sport.volume=14;
	sport.cost=12;
	
	r1 = mini.volume*mini.cost;
	r2 = sport.volume*sport.cost;
	System.out.println("Minivan может перевезти " + mini.pass + " пассажиров на расстояние " + r1 + " км");
	System.out.println("Sportcar может перевезти " + sport.pass + " пассажиров на расстояние " + r2 + " км");
	}
}
