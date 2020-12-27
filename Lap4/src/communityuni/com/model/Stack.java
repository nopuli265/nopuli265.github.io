package communityuni.com.model;

public class Stack {
private char st[];
private int t;

public Stack(int size) {
st= new char[size];
t=0;
}

public void push(char ch)
{
	if(t==st.length) {
		System.out.println("Стек заполнен");
	return;
	}
	st[t]=ch;
	t++;
}

public char pop() {
	if(t==0)
	{
		System.out.println("Cтек пуст!");
		return (char) 0;
	}
	t--;
	return st[t];
}


public Stack(char a[]) {
st= new char[a.length];
for ( int i=0; i< a.length; i++)
	push(a[i]);
}
}
