package jobsheet5;

import java.util.Scanner;

public class ifCetakKRSNoPresensi {

	public ifCetakKRSNoPresensi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
