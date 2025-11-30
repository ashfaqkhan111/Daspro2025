package jobsheet8;

import java.util.Scanner;

public class TriangleStar {

	public TriangleStar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of N : ");
		int N = input.nextInt();
		
		int i =0;
		
		while(i <= N) {
			
			int j=0;
			
			while (j < i) {
				
				
				
				System.out.print("*");
		j++;
				
			}
			
			System.out.println();
			i++;
			
		}
		
		
	}

}
