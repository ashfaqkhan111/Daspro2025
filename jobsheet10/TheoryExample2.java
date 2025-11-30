package jobsheet10;

import java.util.*;

public class TheoryExample2 {

	public TheoryExample2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("\nEnetr the tempature for cities \n");
		
		Double Temp [][] = new Double [5][7];
		String Cities [] = {"Tokeyo","Osaka","Sapporo","Fukuoka","Naha",};        
		        
		    for(int row=0; row<Temp.length; row++) {
		    	for(int col=0; col<Temp[row].length; col++) {
		    		
		    		System.out.print("Enter the Temp for City "+"'"+Cities[row]+"'"+" Day "+(col+1)+" : ");
		    		
		    		Temp[row][col] = input.nextDouble();
		    		
		    	}
		    	
		    	
		    }
		    
		    System.out.println("\n the result for Tempature");
		    
		for(int i=0; i<Temp.length; i++) {
			for(int j=0; j<Temp[i].length; j++) {
				
				System.out.print("The tempature for the city "+Cities[i]+" Day "+(j+1) + " is : "+Temp[i][j]);
				
			}
			
			
			
		}
		
		
		
	}

}
 