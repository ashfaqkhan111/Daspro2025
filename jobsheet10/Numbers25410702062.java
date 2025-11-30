package jobsheet10;

import java.util.Scanner;
import java.util.Arrays;

public class Numbers25410702062 {

	public Numbers25410702062() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int [][] myNumbers = new int[3][];
		
		myNumbers [0] = new int [5];
		myNumbers [1] = new int [3];
		myNumbers [2] = new int [1];
		
	
		System.out.println("the deafult values of array \n");
		for(int i=0; i<myNumbers.length; i++) {
			System.out.println(Arrays.toString(myNumbers[i]));
			
		}
		
		System.out.println("Length of arrays \n");
		
		for(int i=0; i<myNumbers.length; i++) {
			System.out.println("Length of Rows : " + myNumbers[i].length);
			
		}
		
	
		
		}
		
		
		
	}

