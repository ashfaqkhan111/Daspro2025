package Quiz;
import java.util.*;
import java.util.Arrays;

public class LSN_Quiz {

	public LSN_Quiz() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int [][] servay = new int[3][4];
		
		String[] programs = {"InfraStructure", "HealthCare"," Education"};
		
		for (int row =0; row<servay.length; row++) {
			System.out.println("Enter the Setisfaction for program " + "'"+programs[row]+"'");
			
			for(int col=0; col<servay[row].length; col++) {
				System.out.print("Enter the value : ");
				servay[row][col]=input.nextInt();
				
				input.nextLine();
			}
			
			
		}
		
		System.out.print("***** Setiffiction for each region  *****");
		
		for(int row=0; row<servay.length; row++) {
			
			System.out.println("Setisfiction for region" + "'"+(row+1)+"'"+" program " +"'"+programs[row]+"'");
			
			for(int col =0; col<servay[row].length; col++ ) {
				
			System.out.println("Setisfiction Score is : " +servay[row][col]);
				
				
			}
			
		}
		
		System.out.println("*****Avarage*****");
		
		for(int row=0; row<servay.length; row++) {
			
			int sum = 0;
			
			for(int col =0; col<servay[row].length; col++) {
				
				sum += servay[row][col];
				
				;
			}
			System.out.println("Avrage for the each Program "+"'"+programs[row]+"'"+" : "+(sum/servay[row].length) );
			
		}
		
		System.out.println("*****Highest Setiffiction rate *****");
		
		for(int row=0; row<servay.length; row++) {
			for(int col=0; col<servay.length; col++) {

				
				if(servay[row][col] >-1 && servay[row][col]>1) {
					System.out.println("the highest Setisfiction rate  is "  +"'"+servay[row][col]+"'"+"for region #"+(col+1) +"for program : "+ programs[row] );	
					break;
				}
				
			}
			
		}
		
	}

}
