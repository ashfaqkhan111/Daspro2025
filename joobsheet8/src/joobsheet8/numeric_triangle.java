package joobsheet8;

import java.util.Scanner;
import java.util.Random;

public class numeric_triangle {

	public numeric_triangle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the Value of N: ");
		int N = input.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			for(int j =i; j<=N; j++) {
				
				System.out.print(" ");
				
			}
			
			for(int k =1; k<=i; k++) {
				
				System.out.print(k);
			}
			
			System.out.println();
		}
		
	}

}
