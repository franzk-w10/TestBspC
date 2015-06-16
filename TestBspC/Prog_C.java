import java.util.Random;

import AlgoTools.IO;
public class Prog_C {

	public static void main(String[] args) {
		
		IO.println("\n\tHerzlich Willkommen!\n\n");
		
		tipp();

	}
	
	static void tipp() {
		Random zufall=new Random();
		int temp;
		for (int i=0; i<=5; i++) {
			temp=zufall.nextInt(45)+1;
			IO.print(temp,3);
		}
	}

}
