package jobsheet5;

import java.util.Scanner;

public class ifCetakKRSNoPresensi {

	public ifCetakKRSNoPresensi() {
		
	}

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Ukt is Paid ? (true / false) :");
		boolean UKTlunas = input.nextBoolean();

		if (UKTlunas) {
			
			System.out.println("KRS can be printed");
			
		}
		
		else {
			System.out.print("Pay UKT first");
		}
	
		String message = UKTlunas ? "KRS can be printed " : "Pay UKT first ";
		System.out.println(message);
	
		input.close();
	}
	

}
