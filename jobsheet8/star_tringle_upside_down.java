package jobsheet8;

import java.util.Scanner;

public class star_tringle_upside_down {

	public star_tringle_upside_down() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter Value of N : ");
		int N = input.nextInt();
		
		for (int i=1; i<=N; i++) {
			
			for (int j =i; j<=N; j++) {
				
				System.out.print("#");
				
			}
			System.out.println();
			
		}
		
	} 

}
