import java.util.Random;

import AlgoTools.IO;
public class Prog_C {

	public static void main(String[] args) {
		
		IO.println("\n\tHerzlich Willkommen!\n\n");
		
		tipp();

	}
	
	static void tipp() {
		Random zufall=new Random();
		int[] zahl = new int[6];
		for (int i=0; i<=5; i++) {
			zahl[i]=zufall.nextInt(45)+1;
			for (int j=0; j<i;j++)
				if (zahl[i]==zahl[j]) {
					i--;
					break;
				}
		}
		
		for (int i=0; i<=5; i++) {
			IO.print(zahl[i],3);
		}
	}

}
