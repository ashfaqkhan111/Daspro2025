package jobsheet9;

import java.util.Scanner;
import java.util.Arrays;

public class FoodandBeverage {

	public FoodandBeverage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		double total = 0;
		
		System.out.print("Enter the number of orders : ");
		int length = input.nextInt();
		input.nextLine();
		
		String [] OrderName = new String[length];
		double [] Price = new double [length];
		
		for (int i=0; i<length; i++) {
			
			System.out.print("Enter the name of food or drink : ");
			OrderName[i] = input.nextLine();
			
			System.out.print("Enter the price : ");
			Price[i] = input.nextInt();
			
			total = total+Price[i];
			input.nextLine();
			
		}
         Arrays.sort(OrderName);
         
         
		System.out.print("the total price is " +total);
		
		System.out.print("list of orders " );
		
		for(int i=0; i<length; i++) {
			
			System.out.print(OrderName[i] + Price[i]);
			
		}
		
	}

}
