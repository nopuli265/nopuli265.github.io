package bai1;

class Simple62r {
	  int pass;
  int volume;
  int cost;
	void range() {
		System.out.println("расстояние = " + volume*cost);
		}
	}



class Simple62 {
	public static void main (String args[]){
	Simple62r mini = new Simple62r();
	Simple62r sport = new Simple62r();
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
	mini.range();
	System.out.println("Sportcar может перевезти " + sport.pass + " пассажиров на расстояние " + r2 + " км");
	sport.range();
	}
	
}

