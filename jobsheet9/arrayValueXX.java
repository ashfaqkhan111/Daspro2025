package jobsheet9;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class arrayValueXX {

	public arrayValueXX() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	
	//orignal code
	
	
	int [] Final_Score = new int [10];
	
	int highest = Final_Score[0];
	int lowest = Final_Score[0];
	
	for (int i =0; i<Final_Score.length; i++) {
		
		System.out.print("Enter the final score " +(i+1)+" : " );
		Final_Score [i] = input.nextInt();
		
	}
	System.out.print("\n"+"*-*-*-*Results for the final score*-*-*-*" +"\n"+"\n");
	
	for(int i=0; i<10; i++) {
		
		
		
		System.out.println("the final Score for  " +(i+1)+" is " +" : "+ Final_Score[i] +"\n");
		
		
		
	}
	
	// modified as qustion 1
	
	
	System.out.println("\n"+"*******REsults******" +"\n");
	
	for (int i = 0; i<Final_Score.length; i++) {
		
		if (Final_Score[i] >= 70) {
			System.out.println("the student " + (i+1)+ " is PASS!! with marks : " +Final_Score[i]+"\n");
			
			
		}else {
			System.out.println("the Student " +(i+1)+ " is Fail!! with low marks : " + Final_Score[i]+"\n" );
		}
		
	}
	

			input.close();	
			}
		 	

	
	}


