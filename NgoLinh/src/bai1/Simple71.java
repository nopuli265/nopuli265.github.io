package bai1;

public class Simple71 {
int pass;
int volume;
int cost;
Simple71(int p, int v, int c){
	pass=p;
	volume = v;
	cost= c;

}
int dip() {
	return cost*volume;
}
 double dist(int km) {
	 return (double) km/ cost;
}
}
