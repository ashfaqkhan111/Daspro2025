package jobsheet3;
import java.util.Scanner;
public class FeulCostCalculator {

	public FeulCostCalculator() {
		
	}

	public static void main(String[] args) {
		

		Scanner input = new Scanner (System.in);
		
		double FeulCostPerLiter = 10000;
		
		// Input
	    System.out.print("Enter Distance Km = ");
		double Distance = input.nextDouble();
		
		//calculation
		
		double FeulNeeded = Distance / 2;
		
		double TotalFeulCost = FeulCostPerLiter * FeulNeeded;
		
		System.out.println("Total Feul Cost Per Trip = " + TotalFeulCost + "\n" + "Feul Needed = " + FeulNeeded); // Output
		
		input.close();
	}

}
