package communityuni.com;

public class Example96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numЬers[][] = { 
				{ "Tom", "555-3322" },
				{ "Mary", "555-8976"},
				{ "Jon", "555-1037" },
				{ "Rachel", "555-1400" } 
				} ; 
		int i;
		if(args.length != 1) 
			System.out.println ("Иcпoльзoвaниe: java Phone <имя>");
		else { 
			for (i=0; i<numЬers.length; i++) { 
				if (numЬers [i][0].equals (args [0])) {
					System.out.println(numЬers[i] [0] + ": " + numЬers [i] [1]); 
				break; 
			}
		}
		if(i == numЬers.length) 
			System.out.println("Имя не найдено.");
		}
	}

}
