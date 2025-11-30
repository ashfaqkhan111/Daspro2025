package jobsheet9;

import java.util.Scanner;
import java.util.Arrays;

public class StudentsGradesManagementsXX {

	public StudentsGradesManagementsXX() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner input = new Scanner (System.in);
		
		int total =0;
		
		
		System.out.print("Enter the number of Students : ");
        int numStudents = input.nextInt();
        
        int [] StudentsGrades = new int [numStudents];
        
        for (int i=0; i<StudentsGrades.length; i++) {
        	
        	System.out.print("Enter the Grades for Students " +"("+(i+1)+")" +" : ");
        	StudentsGrades[i] = input.nextInt();
        	total = total + StudentsGrades[i];
        }
        
        
		int avrage = total / StudentsGrades.length;
		
		Arrays.sort(StudentsGrades);
		
		int lowest = StudentsGrades[0];
        int heighest = StudentsGrades[StudentsGrades.length - 1];
		
		System.out.println("the lowest grades is : "+lowest+"\n");
		System.out.println("the heighest grades is : "+heighest+"\n");
		System.out.println("the avrage grades is : "+avrage+"\n");
		System.out.print("the grades u entered : "+Arrays.toString(StudentsGrades)+"\n");
	}

}
