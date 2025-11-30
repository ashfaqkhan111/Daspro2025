package jobsheet7;

import java.util.Scanner;


public class DisplayTwoNoAbsen {

	public DisplayTwoNoAbsen() {
		
	}

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input the number : ");
		int NumInput = input.nextInt();
		
		
		for (int i = 1; i<= NumInput; i++ ) {
			
			if (i % 2 == 0) {
				
				System.out.printf(i+" ");
				
				
			}
			
			
		}

		
System.out.print("%");
	}

}
