package jobsheet5;

import java.util.Scanner;
public class ifElseCetakKRSNoPresens {

	public ifElseCetakKRSNoPresens() {
		
	}

	public static void main(String[] args) {
		

		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Semester : ");
		int Semester = input.nextInt();
		
		
		if(Semester == 1) {
			
			System.out.print("KRS for semester 1");
			
		}
		
		else if (Semester == 2) {
			
			System.out.print("KRS for Semester 2");
		}
		
		else if (Semester == 3) {
			
			System.out.print("KRS for semester 3");
		}
		
		else if (Semester == 4) {
			System.out.print("KRS for semester 4");
			
		}
		
		else if (Semester == 5) {
			System.out.print("KRS for semester 5");
			
		}
		
		else if (Semester == 6) {
			System.out.print("KRS for semester 6");
		}
		
		else if (Semester == 7) {
			System.out.print("KRS for semester 7");
				
			}
		else if (Semester == 8) {
			System.out.print("KRS for semester 8");
		}
		
		else {
			
			System.out.print("Invalid Semester!!!");
		}
		
		}
		
	}


