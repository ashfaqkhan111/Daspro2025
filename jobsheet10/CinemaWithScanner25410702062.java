package jobsheet10;

import java.util.Scanner;
import java.util.Arrays;

public class CinemaWithScanner25410702062 {

	public CinemaWithScanner25410702062() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input = new Scanner (System.in);
		
	String [][] audience = new String [4][2];
	
	System.out.println("Enter Dtails");
	
	while(true) {
		
		System.out.print("Enter the name : ");
	String Name = input.nextLine();
		
		System.out.print("Enter the row : ");
		int Row = input.nextInt();
		
		System.out.print("Enter column : ");
		int Column = input.nextInt();
	
		input.nextLine();
		
		if (Row<1 ||Row > audience.length || Column <1 || Column > audience[0].length) {
			
			System.out.println("Seat Does not esist try another one");
			continue;
		}
		
		else if(audience [Row -1][Column -1] !=null) {
			System.out.println("the Seat is already booked try to enter another one  ");	
			
		}
		
		else {
			
			System.out.println("booking confirmed");
		}
		
		audience [Row -1] [Column -1] = Name;
		System.out.print("you wants to add another one ? y/n : ");
		String Confirmation = input.nextLine().toLowerCase();
		
		if (Confirmation.equals("n") ) {
			
			System.out.println("Pregram Ended!!");
			
			break;
			
		}
		
	}
	
	for(int i=0; i<audience.length; i++) {
		
		for(int j=0; j<audience[i].length; j++) {
			
		
			
			if(audience[i][j] == null) {
				
				System.out.println("Row : "+(i+1)+ " Column : "+(j+1)+ " --> "+ audience[i][j]);
				continue;
				
			}
		System.out.println();
		}
		
	}
	
	}	
}


