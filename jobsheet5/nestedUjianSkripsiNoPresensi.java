package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsiNoPresensi {

	public nestedUjianSkripsiNoPresensi() {
		
	}

	public static void main(String[] args) {
		

		Scanner input = new Scanner (System.in);
		
		
		
		//boolean free = false;
		
		System.out.print("Has the students free from the compensition (true / false)");
		boolean compensitionStatus = input.nextBoolean ();
		
		
		System.out.print("Enter guidence log with supervisor 1 :");
		int Supervisor1 = input.nextInt();
		
		
		System.out.print("Enter guidence log with supervisor 2 :");
		int Supervisor2 = input.nextInt();
		
		String message = "";
		
		if (compensitionStatus) {
			
			if (Supervisor1 >= 8 && Supervisor2 >= 4) {
				
				message ="All requirements met. student may register for their thesis exam.";
				
			}
			
			else if (Supervisor1 < 8 && Supervisor2 >= 4) {
				
				message ="Falied : Guidence log is less then 8 for Supervisor 1 ";
				
			}
			
			else if (Supervisor1 >=8 && Supervisor2 < 4) {
				
             message ="Failed : Guidence is less then 4 for Supervisor 2 ";

			}
			
			else if(Supervisor1 < 8 && Supervisor2 < 4){
				
				message = "Failed: Both Supervisor 1 and Supervisor 2 guidance logs are below requirements.";
			}
			
			
			else {
				message = "Failed : the student has not been cleared";
			}}
			
			else { 
				message = "Failed : The student has not been cleared of compensation. ";
			}
			System.out.print(message);
			
			input.close();
		}
	}


	