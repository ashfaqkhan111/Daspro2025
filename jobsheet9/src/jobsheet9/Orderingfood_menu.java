package jobsheet9;

import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.*;

public class Orderingfood_menu {

	public Orderingfood_menu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		String [] menu = {"fried rice", "fried Noodles", "toasted bread", "fried potatoes", "teh tarik", "cappuccino", "chocolate ice"};
		
		System.out.print("Enter the name of 'food or drink' you want : ");
		String search = input.nextLine().toLowerCase();
		
		
		
		for(String x: menu) {
		if (search.equals(x)) {
			
			System.out.print("The item is avalible");
			
			break;
			
		}
		else {
			System.out.print("not avalible!!");
			break;
		}
		
		}
	
		input.close();
		
	}

}
