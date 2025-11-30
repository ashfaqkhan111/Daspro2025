package jobsheet9;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class linearSearchXX {

	public linearSearchXX() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		
		//the orignal code
		
		
		
		/*int [] arrayint = {23,45,12,67,89};
		
		int key = 12;
		int result = 0;
		
		for(int i = 0; i<arrayint.length; i++) {
			
			if(arrayint[i] == key) {
				
				result =i;
			}
			
		}
		
		System.out.print("The kesy is on "+"'" +result+ "'"+" position");*/
		
		
		
		
		
		//modified as qustion 2 and 3
		
		
		
		
		int result =0;
		System.out.print("Enter the number of array elements : ");
		int length = input.nextInt();
		
		int [] arrayint = new int[length];
		
		for (int i=0; i<arrayint.length; i++) {
			System.out.print("Enter the elements of Array : ");
			arrayint[i] = input.nextInt();
		}
		
		System.out.print("Enter the Key : ");
		int key = input.nextInt();
		
		for (int i=0; i<arrayint.length; i++) {
			
			while(true) {
			if(arrayint[i] == key) {
				
				result = i;
				break;
				
			}
			}
			
		}
		System.out.print("The key is on position : " +result);
	}

} 
