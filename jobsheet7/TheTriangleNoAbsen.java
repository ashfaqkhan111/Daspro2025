package jobsheet7;

import java.util.Scanner;

public class TheTriangleNoAbsen {

	public TheTriangleNoAbsen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	int i = 0;
	String s = "";
	
	System.out.print("input number : ");
	int Inputnumber = input.nextInt();

	
	//while loop one
	
	
	/*if(Inputnumber <= 0) {
		
		System.out.print("invalid!!!!!!");
	}
	
	while (i < Inputnumber) {
		
		s+= "*";
		
		System.out.println(s);
		i++;
		
		
		
		}*/
	
	
	
	
	
	
	//for loop
	
	
	if(Inputnumber <= 0) {
		System.out.print("Invalid number!!!");
		
	}
	
	else { 
		
		for( i = Inputnumber; i>0 ; i--) {
			s+="*";
			System.out.println(s);
			
			for(int j = 0; j < i; j++) {
				
				System.out.print("*");
				
			}
	
		}
		System.out.println();
		
		}
		
	}
			
		}
		
		
	
	
	
	
	


