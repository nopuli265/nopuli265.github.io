package bai1;

public class Simple72 {
double b;
int e;
double v;
Simple72( double base, int exp)
{
	this.b=base;
	this.e= exp;
	this.v=1;
	if (exp ==0 )
		return;
	for (; exp>0; exp--)
		this.v= this.v*base;
}
double get_sim() {
	return this.v;
}
}

	
