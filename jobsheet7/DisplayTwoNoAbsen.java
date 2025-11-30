package jobsheet7;

import java.util.Scanner;


public class DisplayTwoNoAbsen {

	public DisplayTwoNoAbsen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
