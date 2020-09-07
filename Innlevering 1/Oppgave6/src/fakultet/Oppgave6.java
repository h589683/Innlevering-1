package fakultet;

import java.util.Scanner;

public class Oppgave6 {

	public static void main(String[] args) {
		int heltall=0;
		int sum = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Skriv inn heltall: ");
		heltall=sc.nextInt();
		
		if(heltall > 0) { 
		
			for (int i = 1; i <= heltall; i++) {
			sum *= i;
		}
			System.out.println(sum);
		}
		
	}

}
