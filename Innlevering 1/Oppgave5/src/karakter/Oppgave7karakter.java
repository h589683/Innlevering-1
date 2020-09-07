package karakter;

import java.util.Scanner;

public class Oppgave7karakter {

	public static void main(String[] args) {
		int[] studenter = new int[10];
		for(int i=1; i<=10; i++) {
			studenter[i]= i;
			System.out.println(studenter[i] + " Skriv inn poengsum: ");
		Scanner scan = new Scanner(System.in);
		int poengsum = scan.nextInt();
		
		if(poengsum < 101 && poengsum >=90) {
			System.out.println("Karakter A" );												
		}
		else if(poengsum < 90 && poengsum >=80) {
			System.out.println("Karakter B" );
		}
		else if(poengsum < 80 && poengsum >=60) {
			System.out.println("Karakter C" );
		}
		else if(poengsum < 60 && poengsum >=50) {
			System.out.println("Karakter D" );
		}
		else if(poengsum < 50 && poengsum >=40) {
			System.out.println("Karakter E" );
		}
		else if(poengsum < 40 && poengsum >=0) {
			System.out.println("Karakter F" );
		}
		else {
			System.out.println("Ugyldig poengsum" );
		}
	}

	}
}
