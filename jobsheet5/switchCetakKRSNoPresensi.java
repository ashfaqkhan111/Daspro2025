package jobsheet5;

import java.util.Scanner;

public class switchCetakKRSNoPresensi {

	public switchCetakKRSNoPresensi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter Semister : ");
		int Semester = input.nextInt();
		
		
		System.out.println("*****RESULTS*****");
		
		
		switch (Semester) {
		
		case 1 :
			System.out.print("KRS for Semester 1");
			break;
			
		case 2:
			System.out.print("KRS for semester 2");
			break;
			
		case 3:
			System.out.print("KRS for semester 3");
			break;
			
		case 4:
			System.out.print("KRS for semester 4 ");
			break;
			
		case 5:
			System.out.print("KRS for semester 5 ");
			break;
			
		case 6:
			System.out.print("KRS for semester 6");
			break;
			
		case 7:
			System.out.print("KRS for semester 7 ");
			break;
			
		case 8:
			System.out.print("KRS for semester 8 ");
			break;
			
			default:
				System.out.print("Invalid semester!");
		}

	}

}
