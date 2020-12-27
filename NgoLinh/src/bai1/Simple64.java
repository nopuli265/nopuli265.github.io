package bai1;

class Simple64r {
	  int pass;
int volume;
int cost;
	int range() {
		return volume*cost;
		}
	}


class Simple64 {
	public static void main (String args[]){
	Simple64r mini = new Simple64r();
	Simple64r sport = new Simple64r();
	
	int r1, r2;
	mini.pass=5;
	mini.volume=18;
	mini.cost=21;
	
	sport.pass=4;
	sport.volume=24;
	sport.cost=12;
	
	r1 = mini.range();
	r2 = sport.range();
	
	System.out.println("Minivan может перевезти " + mini.pass + " пассажиров на расстояние " + r1 + " км");
	mini.range();
	System.out.println("Sportcar может перевезти " + sport.pass + " пассажиров на расстояние " + r2 + " км");
	sport.range();
	}
	
}