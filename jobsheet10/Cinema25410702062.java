package jobsheet10;

import java.util.Scanner;
import java.util.Arrays;

public class Cinema25410702062 {

	public Cinema25410702062 () {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [][] audience = new String [4][2]; 
		
		audience [0][0] = "Amin";
		audience [0][1] = "A";
		audience [1][0] = "B";
		audience [1][1] = "C";
		audience [2][0] = "D";
		audience [2][1] = "E";
		audience [3][0] = "F";
		audience [3][1] = "G";
		
		System.out.printf("%s \t %s\n" , audience[0][0],audience[0][1]);
		System.out.printf("%s \t %s\n" , audience[1][0],audience[1][1]);
		System.out.printf("%s \t %s\n" , audience[2][0],audience[2][1]);
		System.out.printf("%s \t %s\n" , audience[3][0],audience[3][1]);
		
		System.out.println("\n the code results of step 4 \n");
		
		System.out.println(audience.length);
		System.out.println(audience[0].length);
		System.out.println(audience[1].length);
		System.out.println(audience[2].length);
		System.out.println(audience[3].length);
		
		System.out.println("\n the code for results of step 5");
		
		for(int i=0; i<audience.length; i++) {
			System.out.println("Length of row : " + (i+1)+ audience.length);
			
			
		}
		
		System.out.println("\n code result for step 6");
		
		for(String [] rowAudience : audience) {
			
			System.out.println("Length of rows : " +rowAudience.length);
			
		}
		
		System.out.println("\n code results for step 10");
		
		for(int i=0; i<audience[2].length; i++) {
			System.out.print(audience[2][i]);
			
			
		}
		
		
		System.out.println("\n code results for step 12");
		
		for(int i=0; i<audience.length; i++) {
			System.out.println("Audience int the row "+(i+1)+" : "+String.join(",", audience[i]));
			
			
		}
		
		}
		 
	}


