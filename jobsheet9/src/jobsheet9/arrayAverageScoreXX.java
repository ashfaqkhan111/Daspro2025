package jobsheet9;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class arrayAverageScoreXX {

	public arrayAverageScoreXX() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		
		// the orignal program 
		
		

		
		/*int [] Score = new int [10];
		double total =0;
		double avrage;
		
		for(int i=0; i<Score.length; i++) {
			
			System.out.print("Enter the final score : ");
			Score[i] = input.nextInt();
			
		}
		
		for(int i=0; i<Score.length; i++) {
			
			total = total + Score[i];
			
		}
		avrage = total/Score.length;
		System.out.print("Avrage of the Score is : "+avrage);*/
		
		
		
		
		
		//modified as asked in qustion 1 and 2
		
		
		
		
		int countpass = 0;
		int countfail = 0;
		
		double totalPass = 0;
		double totalfail = 0;
		
		
	
		
		System.out.print("Enter the length of array : ");
		int length = input.nextInt();
		
		int[] students = new int [length];
		
		for(int i =0; i<students.length; i++) {
			
			System.out.print("enter the number of students : ");
			students [i] = input.nextInt();
		}
		
		
		
		for(int i =0; i<students.length; i++) {
			
			
			if(students[i] > 70) {
				
				totalPass += students[i];
				countpass++;
			}
			else if(students[i] < 70){
				
				totalfail += students[i];
				countfail++;
				
			
				
			}
			
			
			
			
		}
		System.out.println("The avrage Score of Students who Fail :  "+totalfail/countfail);
		System.out.print("The avrage Score of Students who pass : "+totalPass/countpass);
		
		}
		
		
		
	}


