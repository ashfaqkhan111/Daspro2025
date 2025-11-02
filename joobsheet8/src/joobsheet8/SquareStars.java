package joobsheet8;

import java.util.Scanner;

public class SquareStars {

	public SquareStars() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of N : ");
		int N = input.nextInt();
		
		for (int i = 1; i<=N; i+=1) {
			for(int j =1; j<=N; j+=1) {
			
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}

}
