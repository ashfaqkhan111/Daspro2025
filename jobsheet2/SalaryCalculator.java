package jobsheet2;

import java.util.Scanner;

public class SalaryCalculator {

	public SalaryCalculator() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		//Veriables 
		
	final int AllowencePerChild = 150000;
	final double PensionDedection = 0.05;
	
	//Inputs 
	
	System.out.print("Enter Basic Salary = ");
	double BasicSalary = input.nextDouble();
	
	System.out.print("Enter Num Childrens = ");
	int NumChildren = input.nextInt();
	
	//Calculations
	
	int NetChildrenAllowence = AllowencePerChild * NumChildren;
	double Pensiondedection =   BasicSalary * PensionDedection;
	double NetSalary = BasicSalary + NetChildrenAllowence - Pensiondedection;
	
	//outputs
	
	System.out.println("***Results***");
	System.out.println("Net Child Allowence = " + NetChildrenAllowence);
	System.out.println("Total Pension Dedection = " + Pensiondedection);
	System.out.println("Net Salary = " + NetSalary);
	
	input.close();
	
	}

}
