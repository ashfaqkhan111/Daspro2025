package jobsheet10;

import java.util.*;


public class SIAKAD254107020262 {

	public SIAKAD254107020262() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter number of Students : ");
		int num = input.nextInt();
		
		System.out.print("Enter number of courses ");
		int numC = input.nextInt();
		
		
		int [][] Score = new int [num][numC];
		
		
		
		for (int i=0; i<Score.length; i++) {
			System.out.println("Enter the Score for student #"+ (i+1));
			
			double Avrage = 0;
			
			for(int j=0; j<Score[i].length; j++) {
				System.out.println("course #" + (j+1)+ "Score : ");
				
				Score[i][j] = input.nextInt();
				
				Avrage = Avrage + Score[i][j];
				
			}
			System.out.println("the avrage of Student # " +(i+1) +"  " + Avrage/3);
			
		}
		
		 
	}

}
