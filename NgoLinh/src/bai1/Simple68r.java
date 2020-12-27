package bai1;

public class Simple68r {

	public static void main(String[] args)
			throws java.io.IOException {
	    char choice, ign;
	    Simple68 hlp1 = new Simple68();
	    for (;;)	{
	     do {
	     hlp1.menu();
	     choice = (char) System.in.read();
	      do {
	      ign = (char) System.in.read();
	    } while(ign != '\n');
	   } while( !hlp1.isv(choice) );
	     if(choice == 'q') break;
	      System.out.println("\n");
	hlp1.helpon(choice);
	}
	}
	}
