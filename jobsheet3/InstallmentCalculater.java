package jobsheet3;

import java.util.Scanner;

public class InstallmentCalculater {

	public InstallmentCalculater() {
	
	}

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		
		
		System.out.print("Enter total price (x) =");
        double x = input.nextDouble();
        
        System.out.print("Enter DownPayment (y) = ");
		double y = input.nextDouble();
		
		
		
		System.out.print("Enter number of months (z) = ");
		int z = input.nextInt();
		
		
		double P = x - y;
		double r = 0.01;
		
		double MonthlyInstallment = P * (r * Math.pow (1 + r,z)) / (Math.pow(1+r,z)-1);
		
		System.out.println("**__**--**Results**__**--**");
		
		System.out.println("Installment per Months = " + MonthlyInstallment);
		
		System.out.println("Total Installments paid after clearnce = " + MonthlyInstallment * z);
		
		input.close();
	}

}
