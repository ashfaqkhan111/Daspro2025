package jobsheet6;

import java.util.Scanner;

public class studentPassFailSystem {

	public studentPassFailSystem() {
		
	}

	public static void main(String[] args) {
		

		
		Scanner input = new Scanner (System.in);
		
		// initialize variable
		double tugas = 0.3;
		double UASmidterm = 0.4;
		double UTSmidterm = 0.4;
		
		
		// to store data pass and fail
	    String status1,status2;
	
        String semesterStatus ; // to store semester status 
		
		// user system input
		System.out.print("EnterUTS for Algrotham and programing : ");
		double UTS_subject1 = input.nextDouble();
		
		System.out.print("Enter UAS for Algrotham and programing : ");
		double UAS_subject1 = input.nextDouble();
		
		System.out.print("Enter TUGAS for Algrotham and programing : ");
	    double TUGAS_subject1 = input.nextDouble();
	    
	
	    System.out.print("Enter UTS for data strecture : ");
	    double UTS_subject2 = input.nextDouble();
	
	   System.out.print("Enter UAS for data strecture : ");
	   double UAS_subject2 = input.nextDouble();
	
	    System.out.print("Enter TUGAS for data strecture : ");
		double TUGAS_subject2 = input.nextDouble();
		
		//calculations
		
	double finalScore_subject1 = (UTS_subject1 * UTSmidterm) + (UAS_subject1 * UASmidterm) + (TUGAS_subject1 * tugas);
	
	double finalScore_subject2 = (UTS_subject2 * UTSmidterm) + (UAS_subject2 * UASmidterm) + (TUGAS_subject2  * tugas );
	
	//Conditions
	
	if (finalScore_subject1 >= 60) {
		
		status1="Pass";
		
	}
	
	else {
		
		status1 = "Fail";
		
	}
	
	if(finalScore_subject2 >= 60) {
		
status2 = "Pass";
		
	}
	
	else {
		
		status2 = "Fail";
		
		
	}
	
	if (status1.equals ("Pass" )&& status2.equals("Pass")) {
		
		double Avrage = (finalScore_subject1 + finalScore_subject2)/2;
		
		if (Avrage >= 70) {
			
			semesterStatus = "Pass";
		}
		else {
			
			semesterStatus = "Fail";
			
		}
		
	}
	
	else {
		
		semesterStatus = "Fail"; 
	
	
	}
	
	
	System.out.println("\n--- OUTPUT ---");
	System.out.println("");
    System.out.println("Final Score (Algorithm & Programming): " + finalScore_subject1);
    System.out.println("Status (Algorithm & Programming): " + status1);
    System.out.println("Final Score (Data Structure): " + finalScore_subject2);
    System.out.println("Status (Data Structure): " + status2);
    System.out.println("Semester Status: " + semesterStatus);
	
	}
	
	


		
		
		
	}


